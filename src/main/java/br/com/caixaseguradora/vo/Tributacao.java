package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Tributacao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String tributo;
	private String valor;
	private String percentual;

	public Tributacao() {
		super();
	}

	public Tributacao(String codigo, String tributo, String valor, String percentual) {
		super();
		this.codigo = codigo;
		this.tributo = tributo;
		this.valor = valor;
		this.percentual = percentual;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTributo() {
		return tributo;
	}

	public String getValor() {
		return valor;
	}

	public String getPercentual() {
		return percentual;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTributo(String tributo) {
		this.tributo = tributo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setPercentual(String percentual) {
		this.percentual = percentual;
	}
	
	

}
