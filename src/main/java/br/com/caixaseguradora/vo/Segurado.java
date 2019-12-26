package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Segurado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6488502410551469175L;
	
	private Integer numPessoa;
	private Long	cpfCnpjSegurado;
	private String	nomRazSocial;
	private BigDecimal	pctPactuacao;
	
	private List<Telefone> telefones;
	
	
	public Segurado(String nomRazSocial, Long cpfCnpjSegurado, BigDecimal pctPactuacao) {
		super();
		this.nomRazSocial = nomRazSocial;
		this.cpfCnpjSegurado = cpfCnpjSegurado;
		this.pctPactuacao = pctPactuacao;
	}
	public Segurado() {
		super();
	}
			
	public Integer getNumPessoa() {
		return numPessoa;
	}
	public void setNumPessoa(Integer numPessoa) {
		this.numPessoa = numPessoa;
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
			
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	@Override
	public String toString() {
		return "Segurado [nomeSegurado=" + nomRazSocial + ", cpfCnpjSegurado=" + cpfCnpjSegurado + ", pctPactuacao="
				+ pctPactuacao + "]";
	}
	
	
}
