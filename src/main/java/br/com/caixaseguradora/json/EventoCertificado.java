package br.com.caixaseguradora.json;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

import br.com.caixaseguradora.util.Util;
import br.com.caixaseguradora.vo.Acoes;
import br.com.caixaseguradora.vo.Adesao;
import br.com.caixaseguradora.vo.Beneficiarios;
import br.com.caixaseguradora.vo.Cabecalho;
import br.com.caixaseguradora.vo.Canal;
import br.com.caixaseguradora.vo.CategoriaParceiro;
import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.Clientes;
import br.com.caixaseguradora.vo.Cobertura;
import br.com.caixaseguradora.vo.CoberturaIdExterna;
import br.com.caixaseguradora.vo.Cobranca;
import br.com.caixaseguradora.vo.Comunicacao;
import br.com.caixaseguradora.vo.Dados;
import br.com.caixaseguradora.vo.DadosFinanciamento;
import br.com.caixaseguradora.vo.DadosHabitacional;
import br.com.caixaseguradora.vo.DadosInstituicao;
import br.com.caixaseguradora.vo.DadosPessoa;
import br.com.caixaseguradora.vo.DadosPessoaFisica;
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
import br.com.caixaseguradora.vo.Mecanismo;
import br.com.caixaseguradora.vo.Mensagem;
import br.com.caixaseguradora.vo.MensagemDados;
import br.com.caixaseguradora.vo.MensagemId;
import br.com.caixaseguradora.vo.Moeda;
import br.com.caixaseguradora.vo.ObjetoEnvio;
import br.com.caixaseguradora.vo.Oferta;
import br.com.caixaseguradora.vo.OfertaId;
import br.com.caixaseguradora.vo.OfertaIdDados;
import br.com.caixaseguradora.vo.Opcoes;
import br.com.caixaseguradora.vo.Parametros;
import br.com.caixaseguradora.vo.Parcelamento;
import br.com.caixaseguradora.vo.Periodicidade;
import br.com.caixaseguradora.vo.Pessoa;
import br.com.caixaseguradora.vo.PessoaId;
import br.com.caixaseguradora.vo.PessoaSegurado;
import br.com.caixaseguradora.vo.PessoaSeguradoId;
import br.com.caixaseguradora.vo.Plano;
import br.com.caixaseguradora.vo.PontoVenda;
import br.com.caixaseguradora.vo.Premio;
import br.com.caixaseguradora.vo.Qualificador;
import br.com.caixaseguradora.vo.RamoCaixaSeguradora;
import br.com.caixaseguradora.vo.ResponsavelCaixaSeguradora;
import br.com.caixaseguradora.vo.ResponsavelEmpresa;
import br.com.caixaseguradora.vo.Segurado;
import br.com.caixaseguradora.vo.Telefone;
import br.com.caixaseguradora.vo.Tipo;
import br.com.caixaseguradora.vo.TipoCliente;
import br.com.caixaseguradora.vo.Tributacao;
import br.com.caixaseguradora.vo.Vigencia;
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
		  preencherObjCobranca(mensagem, certificado);
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
		  instituicao.setCodigo("1.232.132");
		  instituicao.setEmpresa("SUSEP");
		  instituicao.setDigitoVerificador("40");
		  Qualificador qualificador = new Qualificador();
		  qualificador.setDescricaoRamo(certificado.getNomRamo());
		  qualificador.setRamo(certificado.getNumRamo().toString());
		  qualificador.setGrupo(certificado.getCodGrupoSusep().toString());
		  instituicao.setQualificador(qualificador);
		  identificacaoExterna.setInstituicao(instituicao);
		  oferta.getIdentificacaoExterna().add(identificacaoExterna);
		  
		  oferta.setIdentificacao(new ArrayList<OfertaId>());
		  OfertaId idOferta = new OfertaId();
		  idOferta.setCodigoProduto(certificado.getCodProduto().toString());
		  OfertaIdDados ofertaIdDados = new OfertaIdDados();
		  ofertaIdDados.setNome(certificado.getDesProduto().trim());
		  idOferta.setDados(ofertaIdDados);
		  oferta.getIdentificacao().add(idOferta);
		  mensagem.setOferta(oferta);
	  }
	  
	  private static void preencherDadosSeguradora(Mensagem mensagem, Certificado certificado) {
		  EstruturaComercial estruturaComercial = new EstruturaComercial();
		  Empresa empresa = new Empresa();
		  empresa.setCodigo("12");//TODO 
		  empresa.setNome("Caixa Seguradora S/A");
		  empresa.setCNPJ("34.020.354/0001-10");
		  empresa.setTipoRelacionamentoComercial("seguradora");
		  empresa.setCodigoNegocio("05631");
		  empresa.setSituacao("ATIVA");
		  empresa.setTipo("E");
		  empresa.setDescricao("Caixa Seguradora S/A");

		  IdentificacaoExterna identificacaoExterna = new IdentificacaoExterna();
		  Instituicao instituicao = new Instituicao();
		  instituicao.setCodigo("1.232.132");
		  instituicao.setCodigoNegocio("SUSEP201110021");
		  instituicao.setEmpresa("SUSEP");
		  instituicao.setDigitoVerificador("1");
		  
		  Qualificador qualificador = new Qualificador();
		  qualificador.setDescricaoRamo(certificado.getNomRamo());
		  qualificador.setRamo(certificado.getNumRamo().toString());
		  qualificador.setGrupo(certificado.getCodGrupoSusep().toString());
		  instituicao.setQualificador(qualificador);
		  
		  Endereco endereco = new Endereco();
		  endereco.setLogradouro("SHN Quadra 1 Bloco E - Edifício Sede Caixa Seguradora");
		  endereco.setBairro("Asa Norte");
		  endereco.setCidade("Brasília");
		  endereco.setCep("70701-050");
		  endereco.setEstado("DF");
		  endereco.setPais("Brasil");
		  endereco.setNumero(" ");
		  endereco.setComplemento("");
		  
		  EnderecoQualificador endQualificador = new EnderecoQualificador();
		  endQualificador.setCodigo("1");
		  endQualificador.setValor("COBR");
		  
		  endereco.setQualificador(endQualificador);
		  empresa.setEndereco(endereco);
		  
		  CategoriaParceiro categoriaParceiro = new CategoriaParceiro();
		  categoriaParceiro.setCodigo("1");
		  categoriaParceiro.setValor("assistência");
		  empresa.setCategoriaParceiro(categoriaParceiro);
		  
		  PontoVenda pontoVenda = new PontoVenda();
		  pontoVenda.setCodigo(certificado.getCodFonte().toString());
		  pontoVenda.setNome(certificado.getNomeFonte().trim());
		  pontoVenda.setCodigoExterno(certificado.getOrgaoEmissor().toString());
		  pontoVenda.setTipo("AGENCIA");
		  pontoVenda.setSituacao("ATIVA");
		  Vigencia vigencia = new Vigencia();
		  vigencia.setInicio(Util.dateToStringUtc(certificado.getDtaIniVigencia()));
		  vigencia.setTermino(Util.dateToStringUtc(certificado.getDtaFimVigencia()));
		  pontoVenda.setVigencia(vigencia);
		  ResponsavelCaixaSeguradora responsavelCaixaSeguradora = new ResponsavelCaixaSeguradora("GERPO", "Alamir Mesquita Junior");
		  pontoVenda.setResponsavelCaixaSeguradora(responsavelCaixaSeguradora);
		  ResponsavelEmpresa responsavelEmpresa = new ResponsavelEmpresa("GERPO", "Alamir Mesquita Junior");
		  pontoVenda.setResponsavelEmpresa(responsavelEmpresa);
		  Canal canal = new Canal();
		  canal.setCodigo(certificado.getCodUnidOper() != null? certificado.getCodUnidOper().toString(): " ");
		  canal.setDescricao("AGENCIA CEF");
		  canal.setTipo("BALCAO");
		  canal.setNome("CEF");
		  pontoVenda.setCanal(canal);
		  empresa.setPontoVenda(pontoVenda);
		  
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
		  empresa.setDescricao(certificado.getNomRemunerado());
		  empresa.setCNPJ(certificado.getNumCpfCnpjRemunerado().toString());
		  empresa.setTipoRelacionamentoComercial("corretora");
		  empresa.setCodigo(certificado.getCodRemunerado().toString());
		  empresa.setCodigoNegocio(certificado.getCodSusep());	
		  empresa.setTipo("E");
		  empresa.setSituacao("ATIVA");
		  
		  IdentificacaoExterna identificacaoExterna = new IdentificacaoExterna();
		  Instituicao instituicao = new Instituicao();
		  instituicao.setCodigo("1.232.132");
		  instituicao.setCodigoNegocio("SUSEP201110021");
		  instituicao.setEmpresa("SUSEP");
		  instituicao.setDigitoVerificador("1");
		  
		  Qualificador qualificador = new Qualificador();
		  qualificador.setDescricaoRamo(certificado.getNomRamo());
		  qualificador.setRamo(certificado.getNumRamo().toString());
		  qualificador.setGrupo(certificado.getCodGrupoSusep().toString());
		  instituicao.setQualificador(qualificador);
		  
		  identificacaoExterna.setInstituicao(instituicao);
		  empresa.setIdentificacaoExterna(identificacaoExterna);
		  
		  Endereco endereco = new Endereco();
		  endereco.setLogradouro("SHN Quadra 1 Bloco E - Edifício Sede Caixa Seguradora");
		  endereco.setBairro("Asa Norte");
		  endereco.setCidade("Brasília");
		  endereco.setCep("70701-050");
		  endereco.setEstado("DF");
		  endereco.setPais("Brasil");
		  endereco.setNumero(" ");
		  endereco.setComplemento("");
		  
		  empresa.setEndereco(endereco);
		  
		  CategoriaParceiro categoriaParceiro = new CategoriaParceiro();
		  categoriaParceiro.setCodigo("1");
		  categoriaParceiro.setValor("assistência");
		  empresa.setCategoriaParceiro(categoriaParceiro);
		  
		  PontoVenda pontoVenda = new PontoVenda();
		  pontoVenda.setCodigo(certificado.getCodFonte().toString());
		  pontoVenda.setNome(certificado.getNomeFonte().trim());
		  pontoVenda.setCodigoExterno(certificado.getOrgaoEmissor().toString());
		  pontoVenda.setTipo("AGENCIA");
		  pontoVenda.setSituacao("ATIVA");
		  Vigencia vigencia = new Vigencia();
		  vigencia.setInicio(Util.dateToStringUtc(certificado.getDtaIniVigencia()));
		  vigencia.setTermino(Util.dateToStringUtc(certificado.getDtaFimVigencia()));
		  pontoVenda.setVigencia(vigencia);
		  ResponsavelCaixaSeguradora responsavelCaixaSeguradora = new ResponsavelCaixaSeguradora("GERPO", "Alamir Mesquita Junior");
		  pontoVenda.setResponsavelCaixaSeguradora(responsavelCaixaSeguradora);
		  ResponsavelEmpresa responsavelEmpresa = new ResponsavelEmpresa("GERPO", "Alamir Mesquita Junior");
		  pontoVenda.setResponsavelEmpresa(responsavelEmpresa);
		  Canal canal = new Canal();
		  canal.setCodigo(certificado.getCodUnidOper() != null? certificado.getCodUnidOper().toString(): " ");
		  canal.setDescricao("AGENCIA CEF");
		  canal.setTipo("BALCAO");
		  canal.setNome("CEF");
		  pontoVenda.setCanal(canal);
		  empresa.setPontoVenda(pontoVenda);
		  
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
		  
		  TipoCliente tipoCliente = new TipoCliente();
		  tipoCliente.setCodigo("1");
		  tipoCliente.setDescricao("Segurado");
		  clientes.setTipoCliente(tipoCliente);
		  
		  Pessoa pessoa = new Pessoa();
		  pessoa.setNome(certificado.getNomEstipulante());
		  pessoa.setDataNascimento(Util.dateToStringUtc(new Date())); //DATA FORÇADA POR NÃO HAVER REGISTRO NA BASE QUANDO FOR PJ 
		  
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
		  clientes.setComunicacao(preencherReguaComunicacao(certificado));
		  mensagem.getClientes().add(clientes);
		  
	  }

	  private static void preencherDadosSegurado(Mensagem mensagem, Certificado certificado) {
		  if(mensagem.getItensSegurados() == null) {
			  mensagem.setItensSegurados( new ArrayList<ItensSegurado>());
		  }
		  for (Segurado seg: certificado.getSegurados()) {
			  ItensSegurado itensSegurado = new ItensSegurado();
			  
			  DadosPessoa dadosPessoa = new DadosPessoa();
			  PessoaSegurado pessoaSegurado = new PessoaSegurado();
			  PessoaSeguradoId seguradoId = new PessoaSeguradoId();
			  seguradoId.setTipo("F");
			  seguradoId.setCodigo("CPF");
			  seguradoId.setDocumento(seg.getCpfCnpjSegurado().toString());
			  pessoaSegurado.setIdentificacao(seguradoId);
			  dadosPessoa.setSegurado(pessoaSegurado);
			  itensSegurado.setDadosPessoa(dadosPessoa);
			  
			  itensSegurado.setTipoItemSegurado("HABITACIONAL");
			  Beneficiarios beneficiarios = new Beneficiarios();
			  beneficiarios.setPercentualParticipacao(seg.getPctPactuacao().toString());
			  
			  Pessoa pessoa = new Pessoa();
			  pessoa.setNome(seg.getNomRazSocial());
			  PessoaId identificacao = new PessoaId();		
			  identificacao.setTipo("F");
			  identificacao.setDocumento("CPF");
			  identificacao.setCodigo(seg.getCpfCnpjSegurado().toString());
			  pessoa.setIdentificacao(identificacao);
			  
			  DadosPessoaFisica dadosPessoaFisica = new DadosPessoaFisica();
			  dadosPessoaFisica.setDataNascimento(Util.dateToStringUtc(seg.getDtaNascimento()));
			  pessoa.setDadosPessoaFisica(dadosPessoaFisica);
			  
			  
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
		  if(certificado.isCertificadoDFC() == false) {
			  premio.setPremioTotalBruto(certificado.getVlrPremioMip().add(certificado.getVlrIofMip()).add(certificado.getVlrPremioDfi()).add(certificado.getVlrIofDfi()).toString());		  
			  premio.setPremioTotalDesconto(BigDecimal.ZERO.toString());
			  premio.setPremioTotalLiquido(certificado.getVlrPremioMip().add(certificado.getVlrPremioDfi()).toString());
			  premio.setPremioTotalIOF(certificado.getVlrIofMip().add(certificado.getVlrIofDfi()).toString());
			  premio.setPremioTotalAdicionalFracionamento(BigDecimal.ZERO.toString());
			  premio.setPremioTotalCobertura(certificado.getVlrPremioMip().add(certificado.getVlrIofMip()).add(certificado.getVlrPremioDfi()).add(certificado.getVlrIofDfi()).toString());		  
			  premio.setPremioTotalAssistencia(BigDecimal.ZERO.toString());		  
			  premio.setValorSeguro(certificado.getVlrImpSegMip().add(certificado.getVlrImpSegDfi()).toString());	
			  
			  premio.setValorTotalBruto(certificado.getVlrPremioMip().add(certificado.getVlrIofMip()).add(certificado.getVlrPremioDfi()).add(certificado.getVlrIofDfi()).toString());
			  premio.setValorTotalDesconto(BigDecimal.ZERO.toString());
			  
			  premio.setValorTotalLiquido(certificado.getVlrPremioMip().add(certificado.getVlrPremioDfi()).toString());
			  premio.setValorTotalIOF(certificado.getVlrIofMip().add(certificado.getVlrIofDfi()).toString());
			  premio.setValorTotalAdicionalFracionamento(BigDecimal.ZERO.toString());
			  premio.setValorTotalCobertura(certificado.getVlrPremioMip().add(certificado.getVlrIofMip()).add(certificado.getVlrPremioDfi()).add(certificado.getVlrIofDfi()).toString());		  
			  premio.setValorTotalAssistencia(BigDecimal.ZERO.toString());		  
			  premio.setValorTotalAgravamento(BigDecimal.ZERO.toString());
		  }else {
			  
		  }
		  
		  premio.setValor(certificado.getPremioTotal().toString());
		  Moeda moeda = new Moeda("01", "Real", "R$");
		  premio.setMoeda(moeda);
		  mensagem.setPremio(premio);

	  }
	  
	  private static void preencherPagamento(Mensagem mensagem, Certificado certificado) {
		  MapaDados mapaDados = new MapaDados();
		  FormaPagamento formaPagamento = new FormaPagamento();
		  formaPagamento.setDescricao(certificado.getDesTpPagamento());
		  
		  mapaDados.setFormaPagamento(formaPagamento);
		  mensagem.setMapaDados(mapaDados); 
	  }
	  
	  private static void preencherObjCobranca(Mensagem mensagem, Certificado certificado) {
		  Cobranca cobranca = new Cobranca();
		  cobranca.setOpcoes(new ArrayList<Opcoes>());
		  Opcoes opcoes = new Opcoes();
		  Mecanismo mecanismo = new Mecanismo();
		  Dados dados = new Dados();
		  DadosInstituicao instituicao = new DadosInstituicao();
		  
		  instituicao.setCodigo(" ");
		  instituicao.setDigitoVerificador(" ");
		  instituicao.setNome(" ");
		  instituicao.setTipo("BANCO");
		  
		  dados.setInstituicao(instituicao);
		  mecanismo.setTipo("CRE");
		  Date vencimento = new Date();
		  vencimento.setDate(certificado.getNumDiaVencto());
		  dados.setDataVencimento(Util.dateToStringUtc(vencimento ));
		  mecanismo.setDados(dados);
		  opcoes.setMecanismo(mecanismo);
		  
		  Parcelamento parcelamento = new Parcelamento();
		  parcelamento.setValorDemaisParcelas(BigDecimal.ZERO.toString());
		  parcelamento.setQuantidadeParcela(certificado.getQtdParcelaPagto().toString());
		  parcelamento.setValorJuros(BigDecimal.ZERO.toString());
		  parcelamento.setValorPrimeiraParcela(certificado.getVlrPremioDfi().add(certificado.getVlrPremioMip()).toString());
		  Periodicidade periodicidade = new Periodicidade();
		  periodicidade.setQuantidade(certificado.getQtdMesesContrato().toString());
		  periodicidade.setUnidade(certificado.getDesPeriodicidadeCobr());
		  periodicidade.setDescricao(certificado.getDesPeriodicidadeCobr());
		  parcelamento.setPeriodicidade(periodicidade);
		  opcoes.setParcelamento(parcelamento);
		  
		  Adesao adesao = new Adesao();
		  if(certificado.getPremioEndosso() != null) {
			  adesao.setCodigoIDLG(certificado.getPremioEndosso().getNumIdlg() != null ? certificado.getPremioEndosso().getNumIdlg().trim():certificado.getPremioEndosso().getNumIdlg());
			  adesao.setDataHoraPagamento(Util.dateToStringUtc(certificado.getPremioEndosso().getDtaQuitacao()));
			  adesao.setDataVencimento(Util.dateToStringUtc(certificado.getPremioEndosso().getDtaVencimento()));
			  adesao.setValor(BigDecimal.ZERO.toString());
		  }
		  
		  Moeda moeda = new Moeda("01", "Real", "R$");
		  adesao.setMoeda(moeda);
		  
		  Mecanismo mecanismoAdesao = new Mecanismo();
		  mecanismoAdesao.setTipo("DEBITO_CONTA");
		  Dados dadosAdesao = new Dados();
		  DadosInstituicao instituicaoAdesao = new DadosInstituicao();
		  
		  instituicaoAdesao.setCodigo(certificado.getBancariosEstip() != null ? certificado.getBancariosEstip().getCodBanco().toString(): "");
		  instituicaoAdesao.setDigitoVerificador(certificado.getBancariosEstip() != null ? "1": " ");
		  instituicaoAdesao.setNome(certificado.getBancariosEstip() != null ? certificado.getBancariosEstip().getNomBanco(): "");
		  instituicaoAdesao.setTipo("BANCO");
		  
		  dadosAdesao.setInstituicao(instituicaoAdesao);
		  mecanismoAdesao.setDados(dadosAdesao);
		  adesao.setMecanismo(mecanismoAdesao);
		  
		  Plano plano = new Plano();
		  plano.setCodigoIDLG(" ");
		  plano.setMoeda(moeda);
		  
		  Mecanismo mecanismoPlano = new Mecanismo();
		  mecanismoPlano.setTipo("DEBITO_CONTA");
		  
		  Dados dadosPlano = new Dados();
		  DadosInstituicao instituicaoPlano = new DadosInstituicao();
		  
		  instituicaoPlano.setCodigo(certificado.getBancariosEstip() != null ? certificado.getBancariosEstip().getCodBanco().toString(): "");
		  instituicaoPlano.setDigitoVerificador(certificado.getBancariosEstip() != null ? "1": " ");
		  instituicaoPlano.setNome(certificado.getBancariosEstip() != null ? certificado.getBancariosEstip().getNomBanco(): "");
		  instituicaoPlano.setTipo("BANCO");

		  dadosPlano.setInstituicao(instituicaoPlano);
		  mecanismoPlano.setDados(dadosPlano);
		  plano.setMecanismo(mecanismoPlano);
		  
		  cobranca.getOpcoes().add(opcoes);
		  cobranca.setAdesao(adesao);
		  cobranca.setPlano(plano);
		  mensagem.setCobranca(cobranca);
	  }
	  
	  private static Comunicacao preencherReguaComunicacao(Certificado certificado) {
		  Comunicacao comunicacao = new Comunicacao();
		  List<Parametros> parametros = new ArrayList<Parametros>();
		  for (Segurado seg : certificado.getSegurados()) {
			  if(seg.getTelefones() !=null ) {
				  for (Telefone tel: seg.getTelefones()) {
					  Parametros param = new Parametros();
					  param.setCodigo("telefone");
					  param.setTipo(tel.getDesTpTelefone().trim().toLowerCase());
					  param.setValor(tel.getNumDDD()+""+tel.getNumTelefone());
					  parametros.add(param);
				  }				  
			  }
			  if(seg.getEmails()!=null) {
				  for (String email : seg.getEmails()) {
					  Parametros param = new Parametros();
					  param.setCodigo("email");
					  param.setTipo("pessoal");
					  param.setValor(email.trim());
					  parametros.add(param);
				}
			  }
			  
		  }
		  Acoes acoes = new Acoes();
		  acoes.setEnviaEmail(true);
		  acoes.setEnviaSMS(true);
		  acoes.setEnviaImpresso(false);
		  acoes.setEnviaPush(false);
		  acoes.setAssina(false);
		  acoes.setArmazenaHCP(true);
		  acoes.setEmailComProva(true);
		  acoes.setGeraPDF(true);
		  comunicacao.setAcoes(acoes);
		  comunicacao.setParametros(parametros);
		  return comunicacao;
	  }
	  
	  private static Cobertura getMip(Certificado certificado) {
		  Cobertura  coberMip = new Cobertura();
		  
		  CoberturaIdExterna identificacaoExterna = new CoberturaIdExterna();
		  identificacaoExterna.setCodigo("244");
		  identificacaoExterna.setCodigoNegocio("1");
		  identificacaoExterna.setEmpresa("SUSEP");
		  
		  Qualificador qualificador = new Qualificador();
		  qualificador.setDescricaoRamo(certificado.getNomRamo());
		  qualificador.setRamo(certificado.getNumRamo().toString());
		  qualificador.setGrupo(certificado.getCodGrupoSusep().toString());
		  identificacaoExterna.setQualificador(qualificador);

		  coberMip.setIdentificacaoExterna(identificacaoExterna);
		  
		  Tipo tipo = new Tipo();
		  tipo.setCodigo("A");
		  tipo.setDescricao("");
		  
		  coberMip.setTipo(tipo);
		  
		  RamoCaixaSeguradora ramoCaixaSeguradora = new RamoCaixaSeguradora();
		  ramoCaixaSeguradora.setCodigo(certificado.getRamoMpi().toString());
		  coberMip.setRamoCaixaSeguradora(ramoCaixaSeguradora);
		  coberMip.setCodigoCobertura(certificado.getRamoMpi().toString());
		  coberMip.setNome("Morte Invalidez Permanente");
		  coberMip.setDescricao("Morte Invalidez Permanente");
		  coberMip.setSigla("MIP");
		  
		  coberMip.setValorCustoEfetivoSH(certificado.getVlrCesh().toString()); //SERÁ REMOVIDO
		  
		  LimiteIndenizacao limiteIndenizacao = new LimiteIndenizacao();
		  limiteIndenizacao.setValorMinimo(BigDecimal.ZERO.toString());
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
		  
		  CoberturaIdExterna identificacaoExterna = new CoberturaIdExterna();
		  identificacaoExterna.setCodigo("244");
		  identificacaoExterna.setCodigoNegocio("2");
		  identificacaoExterna.setEmpresa("SUSEP");
		  
		  Qualificador qualificador = new Qualificador();
		  qualificador.setDescricaoRamo(certificado.getNomRamo());
		  qualificador.setRamo(certificado.getNumRamo().toString());
		  qualificador.setGrupo(certificado.getCodGrupoSusep().toString());
		  identificacaoExterna.setQualificador(qualificador);
		  coberDfi.setIdentificacaoExterna(identificacaoExterna);
		  
		  Tipo tipo = new Tipo();
		  tipo.setCodigo("A");
		  tipo.setDescricao("");
		  
		  coberDfi.setTipo(tipo);
		  
		  RamoCaixaSeguradora ramoCaixaSeguradoraDfi = new RamoCaixaSeguradora();
		  ramoCaixaSeguradoraDfi.setCodigo(certificado.getRamoDfi().toString());
		  coberDfi.setRamoCaixaSeguradora(ramoCaixaSeguradoraDfi);
		  
		  coberDfi.setCodigoCobertura(certificado.getRamoDfi().toString());
		  coberDfi.setNome("Danos Físicos ao Imóvel");
		  coberDfi.setDescricao("Danos Físicos ao Imóvel");
		  coberDfi.setSigla("DFI");
		  		  
		  LimiteIndenizacao limiteIndenizacaoDfi = new LimiteIndenizacao();
		  limiteIndenizacaoDfi.setValorMinimo(BigDecimal.ZERO.toString());
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
