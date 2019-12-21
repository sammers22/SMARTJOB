package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Endereco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6551909050603173179L;
	private String cep;	
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String numero;
	private String complemento;
	
	private EnderecoQualificador qualificador;
	
	public Endereco() {
		super();
	}

	public Endereco(String cep, String pais, String estado, String cidade, String bairro, String logradouro,
			String numero, String complemento, EnderecoQualificador qualificador) {
		super();
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.qualificador = qualificador;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public EnderecoQualificador getQualificador() {
		return qualificador;
	}

	public void setQualificador(EnderecoQualificador qualificador) {
		this.qualificador = qualificador;
	}
	
	
}
