package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class LimiteAcionamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3220869162202479255L;
	private float quantidade;
	
	public LimiteAcionamento() {
		super();
	}

	public LimiteAcionamento(float quantidade) {
		super();
		this.quantidade = quantidade;
	}

	// Getter Methods
	public float getQuantidade() {
		return quantidade;
	}

	// Setter Methods
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
}
