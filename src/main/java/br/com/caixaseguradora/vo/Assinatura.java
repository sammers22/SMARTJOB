package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Assinatura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8931030765875127519L;
	private TipoAssinatura tipoAssinatura;
	private String dataAssinatura;

	public Assinatura() {
		super();
	}

	public Assinatura(TipoAssinatura tipoAssinatura, String dataAssinatura) {
		super();
		this.tipoAssinatura = tipoAssinatura;
		this.dataAssinatura = dataAssinatura;
	}

	// Getter Methods
	public TipoAssinatura getTipoAssinatura() {
		return tipoAssinatura;
	}

	public String getDataAssinatura() {
		return dataAssinatura;
	}

	// Setter Methods
	public void setTipoAssinatura(TipoAssinatura tipoAssinatura) {
		this.tipoAssinatura = tipoAssinatura;
	}

	public void setDataAssinatura(String dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}
}
