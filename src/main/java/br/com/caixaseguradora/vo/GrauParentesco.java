package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class GrauParentesco implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 8728535144706834890L;
	private String codigo;
	private String valor;
	private String descricao;

	public GrauParentesco() {
		super();
	}

	public GrauParentesco(String codigo, String valor, String descricao) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
