package br.com.caixaseguradora.json;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;

import br.com.caixaseguradora.util.Util;
import br.com.caixaseguradora.vo.Beneficiarios;
import br.com.caixaseguradora.vo.Cabecalho;
import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.Clientes;
import br.com.caixaseguradora.vo.Cobertura;
import br.com.caixaseguradora.vo.DadosFinanciamento;
import br.com.caixaseguradora.vo.DadosHabitacional;
import br.com.caixaseguradora.vo.Empresa;
import br.com.caixaseguradora.vo.Endereco;
import br.com.caixaseguradora.vo.EnderecoQualificador;
import br.com.caixaseguradora.vo.EstruturaComercial;
import br.com.caixaseguradora.vo.FormaPagamento;
import br.com.caixaseguradora.vo.Franquia;
import br.com.caixaseguradora.vo.IdentificacaoExterna;
import br.com.caixaseguradora.vo.Imovel;
import br.com.caixaseguradora.vo.Instituicao;
import br.com.caixaseguradora.vo.ItensSegurado;
import br.com.caixaseguradora.vo.LimiteIndenizacao;
import br.com.caixaseguradora.vo.MapaDados;
import br.com.caixaseguradora.vo.Mensagem;
import br.com.caixaseguradora.vo.MensagemDados;
import br.com.caixaseguradora.vo.MensagemId;
import br.com.caixaseguradora.vo.ObjetoEnvio;
import br.com.caixaseguradora.vo.Oferta;
import br.com.caixaseguradora.vo.Periodicidade;
import br.com.caixaseguradora.vo.Pessoa;
import br.com.caixaseguradora.vo.PessoaId;
import br.com.caixaseguradora.vo.Premio;
import br.com.caixaseguradora.vo.RamoCaixaSeguradora;
import br.com.caixaseguradora.vo.Segurado;
import br.com.caixaseguradora.vo.Tributacao;
import br.com.caixaseguradora.vo.VigenciaContrato;

public abstract class EventoCertificado {

	  public static String eventoCertificadoMipDfi(Certificado certificado) {
		  ObjetoEnvio obj = new ObjetoEnvio();
		  Mensagem mensagem = new Mensagem();
		  obj.setCabecalho(cabecalhoEvento(mensagem));
		  preencherCabecalhoCertif(mensagem, certificado);		  
		  preencherDadosSeguradora(mensagem, certificado);
		  preencherDadosCorretor(mensagem, certificado);
		  preencherDadosEstipulante(mensagem, certificado);
		  preencherDadosSegurado(mensagem, certificado);
		  preencherCoberturas(mensagem, certificado);
		  preencherPagamento(mensagem, certificado);
		  obj.setMensagem(mensagem);
		  Gson gson = new Gson();
		  String json = gson.toJson(obj);
		  return json;
	  }
	  
	  private static Cabecalho cabecalhoEvento(Mensagem mensagem) {
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
		  return cabecalho;
	  }
	  
	  private static void preencherCabecalhoCertif(Mensagem mensagem, Certificado certificado) {
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
		  Periodicidade periodicidade = new Periodicidade();
		  periodicidade.setQuantidade(certificado.getQtdMesesContrato().toString());
		  periodicidade.setUnidade(certificado.getDesPeriodicidadeCobr());
		  periodicidade.setDescricao(certificado.getDesPeriodicidadeCobr());
		  vigenciaContrato.setPeriodicidade(periodicidade);
		  
		  mensagem.setVigenciaContrato(vigenciaContrato);
		  
		  if(mensagem.getItensSegurados()== null) {
			  mensagem.setItensSegurados(new ArrayList<ItensSegurado>());

		  }
		  ItensSegurado itensSegurado = new ItensSegurado();
		  DadosHabitacional dadosHabitacional = new DadosHabitacional();
		  //TODO Falta preencher numero do certicado, JSON não possui campo
		  DadosFinanciamento dadosFinanciamento = new DadosFinanciamento();
		  dadosFinanciamento.setNumero(certificado.getNumContratoTerc().toString());
		  dadosFinanciamento.setDigitoVerificador(certificado.getNumDvContrTerc());
		  dadosHabitacional.setDadosFinanciamento(dadosFinanciamento);
		  itensSegurado.setDadosHabitacional(dadosHabitacional);
		  mensagem.getItensSegurados().add(itensSegurado);
		  
		  Oferta oferta = new Oferta();
		  oferta.setIdentificacaoExterna(new ArrayList<IdentificacaoExterna>());
		  IdentificacaoExterna identificacaoExterna = new IdentificacaoExterna();
		  Instituicao instituicao = new Instituicao();
		  instituicao.setCodigoNegocio(certificado.getCodProcSusep());
		  identificacaoExterna.setInstituicao(instituicao);
		  oferta.getIdentificacaoExterna().add(identificacaoExterna);
		  mensagem.setOferta(oferta);
	  }
	  
	  private static void preencherDadosSeguradora(Mensagem mensagem, Certificado certificado) {
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
		  qualificador.setValor("COBR");
		  
		  endereco.setQualificador(qualificador);
		  empresa.setEndereco(endereco);
		  
		  estruturaComercial.setEmpresa(empresa);
		  if(mensagem.getEstruturaComercial() == null) {
			  mensagem.setEstruturaComercial(new ArrayList<EstruturaComercial>());			  
		  }
		  mensagem.getEstruturaComercial().add(estruturaComercial);
	  }
	  
	  private static void preencherDadosCorretor(Mensagem mensagem, Certificado certificado) {
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
	  
	  private static void preencherDadosEstipulante(Mensagem mensagem, Certificado certificado) {
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

	  private static void preencherDadosSegurado(Mensagem mensagem, Certificado certificado) {
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
	  
	  private static void preencherCoberturas(Mensagem mensagem, Certificado certificado) {
		  if(mensagem.getItensSegurados() == null) {
			  mensagem.setItensSegurados( new ArrayList<ItensSegurado>());
		  }
		  ItensSegurado itensSegurado = new ItensSegurado();
		  itensSegurado.setCoberturas(new ArrayList<Cobertura>());
		  
		  if(certificado.isCertificadoDFC()) {
			  
		  }else {
			  //MIP
			  Cobertura coberMip = getMip(certificado);
			  itensSegurado.getCoberturas().add(coberMip);
			  
			  //DFI
			  Cobertura coberDfi = getDfi(certificado);
			  itensSegurado.getCoberturas().add(coberDfi);
		  }
		  
		  mensagem.getItensSegurados().add(itensSegurado);

		  Premio premio = new Premio();
		  premio.setValor(certificado.getPremioTotal().toString());
		  mensagem.setPremio(premio);

	  }
	  
	  private static void preencherPagamento(Mensagem mensagem, Certificado certificado) {
		  MapaDados mapaDados = new MapaDados();
		  FormaPagamento formaPagamento = new FormaPagamento();
		  formaPagamento.setDescricao(certificado.getDesTpPagamento());
		  
		  mapaDados.setFormaPagamento(formaPagamento);
		  mensagem.setMapaDados(mapaDados);
		  
	  }
	  
	  private static Cobertura getMip(Certificado certificado) {
		  Cobertura  coberMip = new Cobertura();
		  RamoCaixaSeguradora ramoCaixaSeguradora = new RamoCaixaSeguradora();
		  ramoCaixaSeguradora.setCodigo(certificado.getRamoMpi().toString());
		  coberMip.setRamoCaixaSeguradora(ramoCaixaSeguradora);
		  
		  coberMip.setDescricao("MIP/ Morte Inval. Permanente");
		  coberMip.setValorCustoEfetivoSH(certificado.getVlrCesh().toString());
		  
		  LimiteIndenizacao limiteIndenizacao = new LimiteIndenizacao();
		  limiteIndenizacao.setValorMaximo(certificado.getVlrImpSegMip().toString());
		  coberMip.setLimiteIndenizacao(limiteIndenizacao);
		  
		  coberMip.setPremioLiquidoCobertura(certificado.getVlrPremioMip().toString());
		  coberMip.setAdicionalFracionamentoCobertura(BigDecimal.ZERO.toString());
		  coberMip.setTributacao(new ArrayList<Tributacao>());
		  
		  Tributacao tributacao = new Tributacao();
		  tributacao.setValor(certificado.getVlrIofMip().toString());
		  coberMip.getTributacao().add(tributacao);
		  
		  coberMip.setPremioTotalCobertura((certificado.getVlrPremioMip().add(certificado.getVlrIofMip())).toString());
		  
		  Franquia franquia = new Franquia();
		  franquia.setValor(BigDecimal.ZERO.toString());
		  coberMip.setFranquia(franquia);
		  
		  return coberMip;
	  }
	  
	  private static Cobertura getDfi(Certificado certificado) {
		  Cobertura  coberDfi = new Cobertura();
		  RamoCaixaSeguradora ramoCaixaSeguradoraDfi = new RamoCaixaSeguradora();
		  ramoCaixaSeguradoraDfi.setCodigo(certificado.getRamoDfi().toString());
		  coberDfi.setRamoCaixaSeguradora(ramoCaixaSeguradoraDfi);
		  
		  coberDfi.setDescricao("DFI/Dano Físico ao Imóvel");
		  
		  LimiteIndenizacao limiteIndenizacaoDfi = new LimiteIndenizacao();
		  limiteIndenizacaoDfi.setValorMaximo(certificado.getVlrImpSegDfi().toString());
		  coberDfi.setLimiteIndenizacao(limiteIndenizacaoDfi);
		  
		  coberDfi.setPremioLiquidoCobertura(certificado.getVlrPremioDfi().toString());
		  coberDfi.setAdicionalFracionamentoCobertura(BigDecimal.ZERO.toString());
		  coberDfi.setTributacao(new ArrayList<Tributacao>());
		  
		  Tributacao tributacaoDfi = new Tributacao();
		  tributacaoDfi.setValor(certificado.getVlrIofDfi().toString());
		  coberDfi.getTributacao().add(tributacaoDfi);
		  
		  coberDfi.setPremioTotalCobertura((certificado.getVlrPremioDfi().add(certificado.getVlrIofDfi())).toString());
		  
		  Franquia franquiaDfi = new Franquia();
		  franquiaDfi.setValor(BigDecimal.ZERO.toString());
		  coberDfi.setFranquia(franquiaDfi);
		  return coberDfi;
		  
	  }
}
