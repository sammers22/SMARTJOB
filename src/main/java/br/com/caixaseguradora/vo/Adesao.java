package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Adesao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 551767695272262067L;
	private String codigoIDLG;
	private String dataHoraPagamento;
	private String dataVencimento;
	private String valor;
	private Moeda moeda;
	private List<Tributacao> tributacao;
	private Mecanismo mecanismo;

	public Adesao() {
		super();
	}

	public Adesao(String codigoIDLG, String dataHoraPagamento, String dataVencimento, String valor, Moeda moeda,
			List<Tributacao> tributacao, Mecanismo mecanismo) {
		super();
		this.codigoIDLG = codigoIDLG;
		this.dataHoraPagamento = dataHoraPagamento;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.moeda = moeda;
		this.tributacao = tributacao;
		this.mecanismo = mecanismo;
	}

	// Getter Methods

	public String getCodigoIDLG() {
		return codigoIDLG;
	}

	public String getDataHoraPagamento() {
		return dataHoraPagamento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public String getValor() {
		return valor;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public Mecanismo getMecanismo() {
		return mecanismo;
	}

	// Setter Methods

	public void setCodigoIDLG(String codigoIDLG) {
		this.codigoIDLG = codigoIDLG;
	}

	public void setDataHoraPagamento(String dataHoraPagamento) {
		this.dataHoraPagamento = dataHoraPagamento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setMoeda(Moeda moedaObject) {
		this.moeda = moedaObject;
	}

	public void setMecanismo(Mecanismo mecanismo) {
		this.mecanismo = mecanismo;
	}

	public List<Tributacao> getTributacao() {
		return tributacao;
	}

	public void setTributacao(List<Tributacao> tributacao) {
		this.tributacao = tributacao;
	}

}
