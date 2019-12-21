package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Moeda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6946357672273288376L;
	private String codigo;
	private String nome;
	private String simbolo;

	public Moeda() {
		super();
	}

	public Moeda(String codigo, String nome, String simbolo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.simbolo = simbolo;
	}

	// Getter Methods
	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getSimbolo() {
		return simbolo;
	}

	// Setter Methods
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
}
