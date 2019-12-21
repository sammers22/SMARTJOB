package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Juros implements Serializable {

	private static final long serialVersionUID = -5462780160777530749L;
	private String valor;
	private String tipo;
	private Periodicidade periodicidade;

	public Juros() {
		super();
	}

	public Juros(String valor, String tipo, Periodicidade periodicidade) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.periodicidade = periodicidade;
	}

	// Getter Methods

	public String getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Periodicidade getPeriodicidade() {
		return periodicidade;
	}

	// Setter Methods

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPeriodicidade(Periodicidade periodicidadeObject) {
		this.periodicidade = periodicidadeObject;
	}
}
