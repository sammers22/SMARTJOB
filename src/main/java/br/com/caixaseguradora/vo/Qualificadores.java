package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Qualificadores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3884314208601424168L;
	private String codigo;
	private String valor;

	public Qualificadores() {
		super();
	}

	public Qualificadores(String codigo, String valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
