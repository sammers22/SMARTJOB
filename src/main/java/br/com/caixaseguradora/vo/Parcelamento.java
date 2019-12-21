package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Parcelamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5743576109883417113L;
	private String valorDemaisParcelas;
	private String quantidadeParcela;
	private String valorJuros;
	private String valorPrimeiraParcela;
	private Periodicidade periodicidade;

	public Parcelamento() {
		super();
	}

	public Parcelamento(String valorDemaisParcelas, String quantidadeParcela, String valorJuros,
			String valorPrimeiraParcela, Periodicidade periodicidade) {
		super();
		this.valorDemaisParcelas = valorDemaisParcelas;
		this.quantidadeParcela = quantidadeParcela;
		this.valorJuros = valorJuros;
		this.valorPrimeiraParcela = valorPrimeiraParcela;
		this.periodicidade = periodicidade;
	}

	// Getter Methods

	public String getValorDemaisParcelas() {
		return valorDemaisParcelas;
	}

	public String getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public String getValorJuros() {
		return valorJuros;
	}

	public String getValorPrimeiraParcela() {
		return valorPrimeiraParcela;
	}

	public Periodicidade getPeriodicidade() {
		return periodicidade;
	}

	// Setter Methods

	public void setValorDemaisParcelas(String valorDemaisParcelas) {
		this.valorDemaisParcelas = valorDemaisParcelas;
	}

	public void setQuantidadeParcela(String quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}

	public void setValorJuros(String valorJuros) {
		this.valorJuros = valorJuros;
	}

	public void setValorPrimeiraParcela(String valorPrimeiraParcela) {
		this.valorPrimeiraParcela = valorPrimeiraParcela;
	}

	public void setPeriodicidade(Periodicidade periodicidade) {
		this.periodicidade = periodicidade;
	}
}
