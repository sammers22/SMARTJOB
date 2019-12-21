package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Vigencia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5455437883234587376L;
	private String inicio;
	private String termino;

	public Vigencia() {
		super();
	}

	public Vigencia(String inicio, String termino) {
		super();
		this.inicio = inicio;
		this.termino = termino;
	}

	// Getter Methods

	public String getInicio() {
		return inicio;
	}

	public String getTermino() {
		return termino;
	}

	// Setter Methods

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}
}