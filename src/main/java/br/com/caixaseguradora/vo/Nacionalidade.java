package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Nacionalidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7569076523171076901L;
	private String codigo;
	private String valor;

	public Nacionalidade() {
		super();
	}

	public Nacionalidade(String codigo, String valor) {
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
