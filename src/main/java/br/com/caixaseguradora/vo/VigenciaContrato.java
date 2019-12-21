package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class VigenciaContrato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2287027539519389016L;
	private String inicio;
	private String termino;
	private Periodicidade periodicidade;

	public VigenciaContrato() {
		super();
	}

	public VigenciaContrato(String inicio, String termino, Periodicidade periodicidade) {
		super();
		this.inicio = inicio;
		this.termino = termino;
		this.periodicidade = periodicidade;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public Periodicidade getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(Periodicidade periodicidade) {
		this.periodicidade = periodicidade;
	}

}
