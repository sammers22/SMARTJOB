package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Opcoes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -43480413672976350L;
	private Parcelamento parcelamento;
	private Mecanismo mecanismo;

	public Opcoes() {
		super();
	}

	public Opcoes(Parcelamento parcelamento, Mecanismo mecanismo) {
		super();
		this.parcelamento = parcelamento;
		this.mecanismo = mecanismo;
	}

	public Parcelamento getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(Parcelamento parcelamento) {
		this.parcelamento = parcelamento;
	}

	public Mecanismo getMecanismo() {
		return mecanismo;
	}

	public void setMecanismo(Mecanismo mecanismo) {
		this.mecanismo = mecanismo;
	}

}
