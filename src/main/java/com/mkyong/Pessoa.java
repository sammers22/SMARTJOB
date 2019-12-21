package com.mkyong;

import java.util.Date;

public class Pessoa {

	private Integer numPessoa;
	private Long numCpfCnpj;
	private String nomRazSocial;
	private String indTpPessoa;
	private String staPessao;
	private Integer codExterno;
	private Integer codIntegracao;
	private Date dtaCadastramento;
	
	public Integer getNumPessoa() {
		return numPessoa;
	}
	public void setNumPessoa(Integer numPessoa) {
		this.numPessoa = numPessoa;
	}
	public Long getNumCpfCnpj() {
		return numCpfCnpj;
	}
	public void setNumCpfCnpj(Long numCpfCnpj) {
		this.numCpfCnpj = numCpfCnpj;
	}
	public String getNomRazSocial() {
		return nomRazSocial;
	}
	public void setNomRazSocial(String nomRazSocial) {
		this.nomRazSocial = nomRazSocial;
	}
	public String getIndTpPessoa() {
		return indTpPessoa;
	}
	public void setIndTpPessoa(String indTpPessoa) {
		this.indTpPessoa = indTpPessoa;
	}
	public String getStaPessao() {
		return staPessao;
	}
	public void setStaPessao(String staPessao) {
		this.staPessao = staPessao;
	}
	public Integer getCodExterno() {
		return codExterno;
	}
	public void setCodExterno(Integer codExterno) {
		this.codExterno = codExterno;
	}
	public Integer getCodIntegracao() {
		return codIntegracao;
	}
	public void setCodIntegracao(Integer codIntegracao) {
		this.codIntegracao = codIntegracao;
	}
	public Date getDtaCadastramento() {
		return dtaCadastramento;
	}
	public void setDtaCadastramento(Date dtaCadastramento) {
		this.dtaCadastramento = dtaCadastramento;
	}
	
	

}
