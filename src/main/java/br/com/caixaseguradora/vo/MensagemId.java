package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class MensagemId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1107627644104887821L;
	private String codigoNegocio;
	private String codigoNegocioProposta;

	public MensagemId() {
		super();
	}

	public MensagemId(String codigoNegocio, String codigoNegocioProposta) {
		super();
		this.codigoNegocio = codigoNegocio;
		this.codigoNegocioProposta = codigoNegocioProposta;
	}

	public String getCodigoNegocio() {
		return codigoNegocio;
	}

	public void setCodigoNegocio(String codigoNegocio) {
		this.codigoNegocio = codigoNegocio;
	}

	public String getCodigoNegocioProposta() {
		return codigoNegocioProposta;
	}

	public void setCodigoNegocioProposta(String codigoNegocioProposta) {
		this.codigoNegocioProposta = codigoNegocioProposta;
	}

}
