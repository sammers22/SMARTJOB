package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class RamoCaixaSeguradora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4358750015104466540L;
	private String codigo;
	private String nome;

	public RamoCaixaSeguradora() {
		super();
	}

	public RamoCaixaSeguradora(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
