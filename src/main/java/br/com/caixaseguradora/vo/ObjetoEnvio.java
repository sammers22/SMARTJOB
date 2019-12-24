package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class ObjetoEnvio implements Serializable{

	private Cabecalho cabecalho;
	private Mensagem mensagem;

	public ObjetoEnvio() {
		super();

	}

	public ObjetoEnvio(Cabecalho cabecalho, Mensagem mensagem) {
		super();
		this.cabecalho = cabecalho;
		this.mensagem = mensagem;
	}

	public Cabecalho getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

}
