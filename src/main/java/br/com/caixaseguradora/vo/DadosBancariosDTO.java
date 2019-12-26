package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosBancariosDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4853054225256265679L;
	private Integer codBanco;
	private Integer codAgencia;
	private Long numConta;
	private String numDvConta;
	private Integer numOperConta;
	private String nomBanco;

	public DadosBancariosDTO() {
		super();
	}

	public DadosBancariosDTO(Integer codBanco, Integer codAgencia, Long numConta, String numDvConta,
			Integer numOperConta, String nomBanco) {
		super();
		this.codBanco = codBanco;
		this.codAgencia = codAgencia;
		this.numConta = numConta;
		this.numDvConta = numDvConta;
		this.numOperConta = numOperConta;
		this.nomBanco = nomBanco;
	}

	public Integer getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(Integer codBanco) {
		this.codBanco = codBanco;
	}

	public Integer getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(Integer codAgencia) {
		this.codAgencia = codAgencia;
	}

	public Long getNumConta() {
		return numConta;
	}

	public void setNumConta(Long numConta) {
		this.numConta = numConta;
	}

	public String getNumDvConta() {
		return numDvConta;
	}

	public void setNumDvConta(String numDvConta) {
		this.numDvConta = numDvConta;
	}

	public Integer getNumOperConta() {
		return numOperConta;
	}

	public void setNumOperConta(Integer numOperConta) {
		this.numOperConta = numOperConta;
	}

	public String getNomBanco() {
		return nomBanco;
	}

	public void setNomBanco(String nomBanco) {
		this.nomBanco = nomBanco;
	}

}
