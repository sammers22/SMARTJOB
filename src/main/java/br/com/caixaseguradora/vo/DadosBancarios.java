package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosBancarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8332076799470445600L;
	private String agencia;
	private String numero;
	private String operacao;

	public DadosBancarios() {
		super();
	}

	public DadosBancarios(String agencia, String numero, String operacao) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.operacao = operacao;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

}
