package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Tipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6884522595439930533L;
	private String codigo;
	private String descricao;

	public Tipo() {
		super();
	}

	public Tipo(String codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
