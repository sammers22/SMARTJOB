package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class CoberturaIdExterna implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2737493105084748902L;
	private String codigo;
	private String empresa;
	private String codigoNegocio;
	private String codigoPLN;
	private Qualificador qualificador;

	/**
	 * 
	 */
	public CoberturaIdExterna() {
		super();
	}

	public CoberturaIdExterna(String codigo, String empresa, String codigoNegocio, String codigoPLN,
			Qualificador qualificador) {
		super();
		this.codigo = codigo;
		this.empresa = empresa;
		this.codigoNegocio = codigoNegocio;
		this.codigoPLN = codigoPLN;
		this.qualificador = qualificador;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public String getCodigoNegocio() {
		return codigoNegocio;
	}

	public String getCodigoPLN() {
		return codigoPLN;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setCodigoNegocio(String codigoNegocio) {
		this.codigoNegocio = codigoNegocio;
	}

	public void setCodigoPLN(String codigoPLN) {
		this.codigoPLN = codigoPLN;
	}

	public Qualificador getQualificador() {
		return qualificador;
	}

	public void setQualificador(Qualificador qualificador) {
		this.qualificador = qualificador;
	}

}
