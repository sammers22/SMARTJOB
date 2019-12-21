package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class MapaDados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7267376168755328012L;
	private FormaPagamento formaPagamento;

	public MapaDados(FormaPagamento formaPagamento) {
		super();
		this.formaPagamento = formaPagamento;
	}

	public MapaDados() {
		super();
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	


}
