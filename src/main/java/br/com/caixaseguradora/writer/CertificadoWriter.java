package br.com.caixaseguradora.writer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemStreamSupport;
import org.springframework.batch.item.ItemWriter;

import br.com.caixaseguradora.dao.CertificadoDAO;
import br.com.caixaseguradora.util.Util;
import br.com.caixaseguradora.vo.Beneficiarios;
import br.com.caixaseguradora.vo.Cabecalho;
import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.Clientes;
import br.com.caixaseguradora.vo.DadosFinanciamento;
import br.com.caixaseguradora.vo.DadosHabitacional;
import br.com.caixaseguradora.vo.Empresa;
import br.com.caixaseguradora.vo.Endereco;
import br.com.caixaseguradora.vo.EnderecoQualificador;
import br.com.caixaseguradora.vo.EstruturaComercial;
import br.com.caixaseguradora.vo.IdentificacaoExterna;
import br.com.caixaseguradora.vo.Imovel;
import br.com.caixaseguradora.vo.Instituicao;
import br.com.caixaseguradora.vo.ItensSegurado;
import br.com.caixaseguradora.vo.Mensagem;
import br.com.caixaseguradora.vo.MensagemDados;
import br.com.caixaseguradora.vo.MensagemId;
import br.com.caixaseguradora.vo.Oferta;
import br.com.caixaseguradora.vo.Periodicidade;
import br.com.caixaseguradora.vo.Pessoa;
import br.com.caixaseguradora.vo.PessoaId;
import br.com.caixaseguradora.vo.Segurado;
import br.com.caixaseguradora.vo.VigenciaContrato;

@SuppressWarnings("unused")
public class CertificadoWriter extends ItemStreamSupport implements ItemWriter<Certificado> {

	private CertificadoDAO dao;
	  
	  public void write(List<? extends Certificado> certificados) {
	    for (Certificado cert : certificados) {
	    	List<Segurado> segurados = dao.recuperarSegurados(cert.getNumContrato(), cert.getNumCertificado(), cert.getSeqObjCertif());
	    	cert.setSegurados(segurados);
	    	System.out.println(cert);
	    }
	  }
	  
	  public void setDao(CertificadoDAO dao) {
	    this.dao = dao;
	  }
	  
	  private String eventoCertificado(Certificado certificado) {
		  Mensagem mensagem = new Mensagem();
		  
		  preencherCabecalhoCertif(mensagem, certificado);		  
		  preencherDadosSeguradora(mensagem, certificado);
		  preencherDadosCorretor(mensagem, certificado);
		  preencherDadosEstipulante(mensagem, certificado);
		  
		  return null;
	  }
	  
	  private void cabecalhoEvento(Mensagem mensagem) {
		  Cabecalho cabecalho = new Cabecalho();
		  cabecalho.setVersao("2.0");
		  cabecalho.setOrigem("smart");
		  cabecalho.setDataHora(Util.dateToStringUtc(new Date()));
		  cabecalho.setCodigoCanal("3");
		  cabecalho.setCanal("Apólice");
		  cabecalho.setCodigoEstado("3.1");
		  cabecalho.setEstado("Ativa");
		  cabecalho.setCodigoEvento("3.1.1");
		  cabecalho.setEvento("Apolice emitida");
		  cabecalho.setGeradorEvento("smart");
		  mensagem.setCabecalho(cabecalho);
	  }
	  
	  private void preencherCabecalhoCertif(Mensagem mensagem, Certificado certificado) {
		  MensagemId identificacao = new MensagemId();
		  identificacao.setCodigoNegocio(certificado.getNumApolice().toString());
		  identificacao.setCodigoNegocioProposta(certificado.getNumContrato().toString());
		  mensagem.setIdentificacao(identificacao);
		  		  
		  MensagemDados dados = new MensagemDados();
		  dados.setDataHoraGeracao(Util.dateToStringUtc(certificado.getDtaEmissao()));
		  dados.setTipo("NOVO");
		  mensagem.setDados(dados);
		  		  
		  VigenciaContrato vigenciaContrato = new VigenciaContrato();
		  vigenciaContrato.setInicio(Util.dateToStringUtc(certificado.getDtaIniVigencia()));
		  vigenciaContrato.setTermino(Util.dateToStringUtc(certificado.getDtaFimVigencia()));
		  mensagem.setVigenciaContrato(vigenciaContrato);
		  
		  
		  mensagem.setItensSegurados(new ArrayList<ItensSegurado>());
		  DadosHabitacional dadosHabitacional = new DadosHabitacional();
		  //TODO Falta preencher numero do certicado, JSON não possui campo
		  DadosFinanciamento dadosFinanciamento = new DadosFinanciamento();
		  dadosFinanciamento.setNumero(certificado.getNumContratoTerc().toString());
		  dadosFinanciamento.setDigitoVerificador(certificado.getNumDvContrTerc());
		  dadosHabitacional.setDadosFinanciamento(dadosFinanciamento);
		  mensagem.getItensSegurados().get(0).setDadosHabitacional(dadosHabitacional);
		  
		  Oferta oferta = new Oferta();
		  oferta.setIdentificacaoExterna(new ArrayList<IdentificacaoExterna>());
		  
		  Instituicao instituicao = new Instituicao();
		  instituicao.setCodigoNegocio(certificado.getCodProcSusep());
		  
		  oferta.getIdentificacaoExterna().get(0).setInstituicao(instituicao);
	  }
	  
	  private void preencherDadosSeguradora(Mensagem mensagem, Certificado certificado) {
		  EstruturaComercial estruturaComercial = new EstruturaComercial();
		  Empresa empresa = new Empresa();
		  empresa.setNome("Caixa Seguradora S/A");
		  empresa.setCNPJ("34.020.354/0001-10");
		  empresa.setTipoRelacionamentoComercial("seguradora");
		  empresa.setCodigoNegocio("05631");
		  empresa.setSituacao("ATIVA");
/*		  IdentificacaoExterna identificacaoExterna = new IdentificacaoExterna();
		  Instituicao instituicao = new Instituicao();
		  instituicao.setCodigoNegocio();
		  identificacaoExterna.setInstituicao(instituicao);
		  empresa.setIdentificacaoExterna(identificacaoExterna);*/
		  
		  Endereco endereco = new Endereco();
		  endereco.setLogradouro("SHN Quadra 1 Bloco E - Edifício Sede Caixa Seguradora");
		  endereco.setBairro("Asa Norte");
		  endereco.setCidade("Brasília");
		  endereco.setCep("70701-050");
		  endereco.setEstado("DF");
		  
		  EnderecoQualificador qualificador = new EnderecoQualificador();
		  qualificador.setCodigo("1");
		  qualificador.setValor("Residêncial");
		  
		  endereco.setQualificador(qualificador);
		  empresa.setEndereco(endereco);
		  
		  estruturaComercial.setEmpresa(empresa);
		  if(mensagem.getEstruturaComercial() == null) {
			  mensagem.setEstruturaComercial(new ArrayList<EstruturaComercial>());			  
		  }
		  mensagem.getEstruturaComercial().add(estruturaComercial);
	  }
	  
	  private void preencherDadosCorretor(Mensagem mensagem, Certificado certificado) {
		  EstruturaComercial estruturaComercial = new EstruturaComercial();
		  Empresa empresa = new Empresa();
		  empresa.setNome(certificado.getNomRemunerado());
		  //empresa.setCNPJ("34.020.354/0001-10");
		  empresa.setTipoRelacionamentoComercial("corretora");
		  empresa.setCodigo(certificado.getCodRemunerado().toString());
		  empresa.setCodigoNegocio(certificado.getCodSusep());		  
		  empresa.setSituacao("ATIVA");
		  
		  if(mensagem.getEstruturaComercial() == null) {
			  mensagem.setEstruturaComercial(new ArrayList<EstruturaComercial>());			  
		  }
		  estruturaComercial.setEmpresa(empresa);
		  mensagem.getEstruturaComercial().add(estruturaComercial);
	  }
	  
	  private void preencherDadosEstipulante(Mensagem mensagem, Certificado certificado) {
		  if(mensagem.getClientes() == null) {
			  mensagem.setClientes(new ArrayList<Clientes>());
		  }
		  Clientes clientes = new Clientes();
		  Pessoa pessoa = new Pessoa();
		  pessoa.setNome(certificado.getNomEstipulante());
		  
		  PessoaId identificacao = new PessoaId();
		  identificacao.setTipo("J");
		  identificacao.setDocumento("CNPJ");
		  identificacao.setCodigo(certificado.getCpfCpnjEstip().toString());
		  pessoa.setIdentificacao(identificacao);
		  
		  Endereco endereco = new Endereco();
		  endereco.setLogradouro(certificado.getNomLogradouroEstip());
		  endereco.setNumero(certificado.getNumLogradouroEstip());
		  endereco.setBairro(certificado.getNomBairroEstip());
		  endereco.setCidade(certificado.getNomCidadeEstip());
		  endereco.setCep(certificado.getCodCepEstip());
		  endereco.setEstado(certificado.getCodUfEstip());
		  clientes.setEndereco(endereco);
		  //TODO Verificar tipo de cliente quando for estipulante
		  clientes.setPessoa(pessoa);
		  
		  mensagem.getClientes().add(clientes);
		  
	  }

	  private void preencherDadosSegurado(Mensagem mensagem, Certificado certificado) {
		  if(mensagem.getItensSegurados() == null) {
			  mensagem.setItensSegurados( new ArrayList<ItensSegurado>());
		  }
		  for (Segurado seg: certificado.getSegurados()) {
			  ItensSegurado itensSegurado = new ItensSegurado();
			  itensSegurado.setTipoItemSegurado("HABITACIONAL");
			  Beneficiarios beneficiarios = new Beneficiarios();
			  beneficiarios.setPercentualParticipacao(seg.getPctPactuacao().toString());
			  Pessoa pessoa = new Pessoa();
			  pessoa.setNome(seg.getNomRazSocial());
			  PessoaId identificacao = new PessoaId();		
			  identificacao.setTipo(seg.getCpfCnpjSegurado().toString());
			  pessoa.setIdentificacao(identificacao);
			  
			  beneficiarios.setPessoa(pessoa);
			  itensSegurado.setBeneficiarios(beneficiarios);
			  
			  if(itensSegurado.getImovel() == null) {
				  itensSegurado.setImovel(new Imovel());
			  }
			  Endereco endereco = new Endereco();
			  endereco.setLogradouro(certificado.getNomLogradouroSegurado());
			  endereco.setNumero(certificado.getNumLogradouroSegurado());
			  endereco.setBairro(certificado.getNomBairroSegurado());
			  endereco.setCep(certificado.getCodCepSegurado());
			  endereco.setEstado(certificado.getCodUfSegurado());
			  itensSegurado.getImovel().setEndereco(endereco);
			  
			  DadosHabitacional dadosHabitacional = new DadosHabitacional();
			  dadosHabitacional.setTipo("IMOVEL");
			  dadosHabitacional.setDataAverbacao(Util.dateToStringUtc(certificado.getDtaAverbacao()));
			  itensSegurado.setDadosHabitacional(dadosHabitacional);  
			  mensagem.getItensSegurados().add(itensSegurado);
			
		  }
	  }
	  
	  private void preencherCoberturas(Mensagem mensagem, Certificado certificado) {
		  if(mensagem.getItensSegurados() == null) {
			  mensagem.setItensSegurados( new ArrayList<ItensSegurado>());
		  }
		  
	  }
}
