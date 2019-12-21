package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Profissao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4551500361310234597L;
	private String codigo;
	private String valor;
	private String detalhamento;
			
	public Profissao() {
		super();
	}

	public Profissao(String codigo, String valor, String detalhamento) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.detalhamento = detalhamento;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getValor() {
		return valor;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}
}
