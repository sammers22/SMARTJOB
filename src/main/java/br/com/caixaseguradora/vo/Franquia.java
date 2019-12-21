package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Franquia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1636765586813160067L;
	private String valor;
	private Periodicidade periodicidade;

	/**
	* 
	*/
	public Franquia() {
		super();
	}

	/**
	 * @param valor
	 * @param periodicidade
	 */
	public Franquia(String valor, Periodicidade periodicidade) {
		super();
		this.valor = valor;
		this.periodicidade = periodicidade;
	}

	// Getter Methods

	public String getValor() {
		return valor;
	}

	public Periodicidade getPeriodicidade() {
		return periodicidade;
	}

	// Setter Methods

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setPeriodicidade(Periodicidade periodicidade) {
		this.periodicidade = periodicidade;
	}
}
