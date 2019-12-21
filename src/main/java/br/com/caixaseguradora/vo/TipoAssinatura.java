package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class TipoAssinatura implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7858484753501318249L;
	private String codigo;
	private String valor;

	public TipoAssinatura() {
		super();
	}

	public TipoAssinatura(String codigo, String valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getValor() {
		return valor;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
