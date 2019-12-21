package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Periodicidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6878298638513075412L;
	private String unidade;
	private String quantidade;
	private String descricao;
	
	
	
	public Periodicidade() {
		super();
	}
	public Periodicidade(String unidade, String quantidade, String descricao) {
		super();
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}
	
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
