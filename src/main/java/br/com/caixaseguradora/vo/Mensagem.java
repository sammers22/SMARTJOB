package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Mensagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1147940908828587825L;

	//private Cabecalho cabecalho;

	private MensagemId identificacao;

	private MensagemDados dados;

	private VigenciaContrato vigenciaContrato;

	private Oferta oferta;

	private List<EstruturaComercial> estruturaComercial;

	private List<ItensSegurado> itensSegurados;

	private Premio premio;

	private List<Clientes> clientes;
	
	private Cobranca cobranca;

	private MapaDados mapaDados;

	public Mensagem() {
		super();
	}

	public Mensagem( MensagemId identificacao, MensagemDados dados,
			VigenciaContrato vigenciaContrato, Oferta oferta, List<EstruturaComercial> estruturaComercial,
			List<ItensSegurado> itensSegurados, Premio premio, Cobranca cobranca, MapaDados mapaDados) {
		super();
		this.identificacao = identificacao;
		this.dados = dados;
		this.vigenciaContrato = vigenciaContrato;
		this.oferta = oferta;
		this.estruturaComercial = estruturaComercial;
		this.itensSegurados = itensSegurados;
		this.premio = premio;
		this.cobranca = cobranca;
		this.mapaDados = mapaDados;
	}

	public MensagemId getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(MensagemId identificacao) {
		this.identificacao = identificacao;
	}

	public MensagemDados getDados() {
		return dados;
	}

	public void setDados(MensagemDados dados) {
		this.dados = dados;
	}

	public VigenciaContrato getVigenciaContrato() {
		return vigenciaContrato;
	}

	public void setVigenciaContrato(VigenciaContrato vigenciaContrato) {
		this.vigenciaContrato = vigenciaContrato;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

	public List<EstruturaComercial> getEstruturaComercial() {
		return estruturaComercial;
	}

	public void setEstruturaComercial(List<EstruturaComercial> estruturaComercial) {
		this.estruturaComercial = estruturaComercial;
	}

	public List<ItensSegurado> getItensSegurados() {
		return itensSegurados;
	}

	public void setItensSegurados(List<ItensSegurado> itensSegurados) {
		this.itensSegurados = itensSegurados;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Cobranca getCobranca() {
		return cobranca;
	}

	public void setCobranca(Cobranca cobranca) {
		this.cobranca = cobranca;
	}

	public MapaDados getMapaDados() {
		return mapaDados;
	}

	public void setMapaDados(MapaDados mapaDados) {
		this.mapaDados = mapaDados;
	}

	public List<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}
	
	

}
