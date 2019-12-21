package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class ResponsavelEmpresa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1108061445656077424L;
	private String unidadeOrganizacional;
	private String contato;

	
	/**
	 * 
	 */
	public ResponsavelEmpresa() {
		super();
	}

	/**
	 * @param unidadeOrganizacional
	 * @param contato
	 */
	public ResponsavelEmpresa(String unidadeOrganizacional, String contato) {
		super();
		this.unidadeOrganizacional = unidadeOrganizacional;
		this.contato = contato;
	}

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
