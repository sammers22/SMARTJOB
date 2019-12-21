package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosInstituicao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4198871825161857098L;
	private String tipo;
	private String nome;
	private String codigo;
	private String digitoVerificador;

	public DadosInstituicao() {
		super();
	}

	public DadosInstituicao(String tipo, String nome, String codigo, String digitoVerificador) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.codigo = codigo;
		this.digitoVerificador = digitoVerificador;
	}

	// Getter Methods

	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	// Setter Methods

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

}
