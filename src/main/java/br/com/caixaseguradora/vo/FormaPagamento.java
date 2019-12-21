package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class FormaPagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8920710638456067764L;
	private String descricao;
	
	public FormaPagamento() {
		super();
	}

	public FormaPagamento(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
