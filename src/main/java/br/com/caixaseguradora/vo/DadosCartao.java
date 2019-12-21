package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosCartao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2888154878671031904L;
	private String nomeTitular;
	private String numeroCartao;
	private String digitoVerificador;
	private String dataValidade;
	private String token;
	private String bandeira;

	public DadosCartao() {
		super();
	}

	public DadosCartao(String nomeTitular, String numeroCartao, String digitoVerificador, String dataValidade,
			String token, String bandeira) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.digitoVerificador = digitoVerificador;
		this.dataValidade = dataValidade;
		this.token = token;
		this.bandeira = bandeira;
	}

	// Getter Methods

	public String getNomeTitular() {
		return nomeTitular;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public String getToken() {
		return token;
	}

	public String getBandeira() {
		return bandeira;
	}

	// Setter Methods

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

}
