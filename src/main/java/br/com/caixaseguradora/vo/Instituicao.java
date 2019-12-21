package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Instituicao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2248672725236708909L;
	private String codigo;				
	private String empresa;	
	private String codigoNegocio;
	private String digitoVerificador;
		
	private Qualificador qualificador;
	
	public Instituicao() {
		super();
	}
	
	public Instituicao(String codigo, String empresa, String codigoNegocio, String digitoVerificador) {
		super();
		this.codigo = codigo;
		this.empresa = empresa;
		this.codigoNegocio = codigoNegocio;
		this.digitoVerificador = digitoVerificador;
	}
		
	public Qualificador getQualificador() {
		return qualificador;
	}

	public void setQualificador(Qualificador qualificador) {
		this.qualificador = qualificador;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCodigoNegocio() {
		return codigoNegocio;
	}
	public void setCodigoNegocio(String codigoNegocio) {
		this.codigoNegocio = codigoNegocio;
	}
	public String getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	
}
