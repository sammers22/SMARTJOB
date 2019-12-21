package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class OfertaIdDados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -445266214003573613L;
	private String nome;

	public OfertaIdDados(String nome) {
		super();
		this.nome = nome;
	}

	public OfertaIdDados() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
