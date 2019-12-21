package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class ResponsavelCaixaSeguradora implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2271815867655137350L;
	private String unidadeOrganizacional;
	private String contato;

	
	
	/**
	 * @param unidadeOrganizacional
	 * @param contato
	 */
	public ResponsavelCaixaSeguradora(String unidadeOrganizacional, String contato) {
		super();
		this.unidadeOrganizacional = unidadeOrganizacional;
		this.contato = contato;
	}

	// Getter Methods

	public String getUnidadeOrganizacional() {
		return unidadeOrganizacional;
	}

	public String getContato() {
		return contato;
	}

	// Setter Methods

	public void setUnidadeOrganizacional(String unidadeOrganizacional) {
		this.unidadeOrganizacional = unidadeOrganizacional;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
}