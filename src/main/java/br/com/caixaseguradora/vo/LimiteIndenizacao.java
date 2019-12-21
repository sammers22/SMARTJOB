package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class LimiteIndenizacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5170458923271607828L;
	private String valorMinimo;
	private String valorMaximo;

	public LimiteIndenizacao() {
		super();
	}

	public LimiteIndenizacao(String valorMinimo, String valorMaximo) {
		super();
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
	}

	// Getter Methods

	public String getValorMinimo() {
		return valorMinimo;
	}

	public String getValorMaximo() {
		return valorMaximo;
	}

	// Setter Methods

	public void setValorMinimo(String valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public void setValorMaximo(String valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
}
