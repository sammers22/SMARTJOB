package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosFinanciamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5664141692888825995L;
	private String numero;
	private String digitoVerificador;
			
	public DadosFinanciamento() {
		super();
	}

	public DadosFinanciamento(String numero, String digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	// Getter Methods

	public String getNumero() {
		return numero;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	// Setter Methods

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
}
