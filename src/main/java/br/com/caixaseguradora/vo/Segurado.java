package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Segurado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6488502410551469175L;
	
	private Long	cpfCnpjSegurado;
	private String	nomRazSocial;
	private BigDecimal	pctPactuacao;
	
	
	
	public Segurado(String nomRazSocial, Long cpfCnpjSegurado, BigDecimal pctPactuacao) {
		super();
		this.nomRazSocial = nomRazSocial;
		this.cpfCnpjSegurado = cpfCnpjSegurado;
		this.pctPactuacao = pctPactuacao;
	}
	public Segurado() {
		super();
	}
	
	public String getNomRazSocial() {
		return nomRazSocial;
	}
	public void setNomRazSocial(String nomRazSocial) {
		this.nomRazSocial = nomRazSocial != null ? nomRazSocial.trim():nomRazSocial;
	}
	public Long getCpfCnpjSegurado() {
		return cpfCnpjSegurado;
	}
	public void setCpfCnpjSegurado(Long cpfCnpjSegurado) {
		this.cpfCnpjSegurado = cpfCnpjSegurado;
	}
	public BigDecimal getPctPactuacao() {
		return pctPactuacao;
	}
	public void setPctPactuacao(BigDecimal pctPactuacao) {
		this.pctPactuacao = pctPactuacao;
	}
	@Override
	public String toString() {
		return "Segurado [nomeSegurado=" + nomRazSocial + ", cpfCnpjSegurado=" + cpfCnpjSegurado + ", pctPactuacao="
				+ pctPactuacao + "]";
	}
	
	
}
