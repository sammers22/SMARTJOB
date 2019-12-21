package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class MensagemDados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4495034501392272845L;
	private String dataHoraGeracao;
	private String tipo;

	public MensagemDados() {
		super();
	}

	public MensagemDados(String dataHoraGeracao, String tipo) {
		super();
		this.dataHoraGeracao = dataHoraGeracao;
		this.tipo = tipo;
	}

	public String getDataHoraGeracao() {
		return dataHoraGeracao;
	}

	public void setDataHoraGeracao(String dataHoraGeracao) {
		this.dataHoraGeracao = dataHoraGeracao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
