package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosBoletoMensagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	private String ordem;

	public DadosBoletoMensagem() {
		super();
	}

	public DadosBoletoMensagem(String mensagem, String ordem) {
		super();
		this.mensagem = mensagem;
		this.ordem = ordem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

}
