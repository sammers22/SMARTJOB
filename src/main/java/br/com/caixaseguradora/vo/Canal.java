package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Canal implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 4623688238776178515L;
	private String codigo;
	private String nome;
	private String tipo;
	private String descricao;
	
	/**
	 * 
	 */
	public Canal() {
		super();
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param tipo
	 * @param descricao
	 */
	public Canal (String codigo, String nome, String tipo, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}