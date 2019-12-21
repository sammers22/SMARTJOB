package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Premio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4508690203304039176L;
	private Moeda moeda;
	private String premioTotalBruto;
	private String premioTotalDesconto;
	private String premioTotalLiquido;
	private String premioTotalIOF;
	private String premioTotalAdicionalFracionamento;
	private String premioTotalCobertura;
	private String premioTotalAssistencia;
	private String valor;
	private String valorSeguro;
	private String valorTotalBruto;
	private String valorTotalDesconto;
	private String valorTotalLiquido;
	private String valorTotalIOF;
	private String valorTotalAdicionalFracionamento;
	private String valorTotalCobertura;
	private String valorTotalAssistencia;
	private String valorTotalAgravamento;

	public Premio() {
		super();
	}

	public Premio(Moeda moeda, String premioTotalBruto, String premioTotalDesconto, String premioTotalLiquido,
			String premioTotalIOF, String premioTotalAdicionalFracionamento, String premioTotalCobertura,
			String premioTotalAssistencia, String valor, String valorSeguro, String valorTotalBruto,
			String valorTotalDesconto, String valorTotalLiquido, String valorTotalIOF,
			String valorTotalAdicionalFracionamento, String valorTotalCobertura, String valorTotalAssistencia,
			String valorTotalAgravamento) {
		super();
		this.moeda = moeda;
		this.premioTotalBruto = premioTotalBruto;
		this.premioTotalDesconto = premioTotalDesconto;
		this.premioTotalLiquido = premioTotalLiquido;
		this.premioTotalIOF = premioTotalIOF;
		this.premioTotalAdicionalFracionamento = premioTotalAdicionalFracionamento;
		this.premioTotalCobertura = premioTotalCobertura;
		this.premioTotalAssistencia = premioTotalAssistencia;
		this.valor = valor;
		this.valorSeguro = valorSeguro;
		this.valorTotalBruto = valorTotalBruto;
		this.valorTotalDesconto = valorTotalDesconto;
		this.valorTotalLiquido = valorTotalLiquido;
		this.valorTotalIOF = valorTotalIOF;
		this.valorTotalAdicionalFracionamento = valorTotalAdicionalFracionamento;
		this.valorTotalCobertura = valorTotalCobertura;
		this.valorTotalAssistencia = valorTotalAssistencia;
		this.valorTotalAgravamento = valorTotalAgravamento;
	}

	// Getter Methods

	public Moeda getMoeda() {
		return moeda;
	}

	public String getPremioTotalBruto() {
		return premioTotalBruto;
	}

	public String getPremioTotalDesconto() {
		return premioTotalDesconto;
	}

	public String getPremioTotalLiquido() {
		return premioTotalLiquido;
	}

	public String getPremioTotalIOF() {
		return premioTotalIOF;
	}

	public String getPremioTotalAdicionalFracionamento() {
		return premioTotalAdicionalFracionamento;
	}

	public String getPremioTotalCobertura() {
		return premioTotalCobertura;
	}

	public String getPremioTotalAssistencia() {
		return premioTotalAssistencia;
	}

	public String getValor() {
		return valor;
	}

	public String getValorSeguro() {
		return valorSeguro;
	}

	public String getValorTotalBruto() {
		return valorTotalBruto;
	}

	public String getValorTotalDesconto() {
		return valorTotalDesconto;
	}

	public String getValorTotalLiquido() {
		return valorTotalLiquido;
	}

	public String getValorTotalIOF() {
		return valorTotalIOF;
	}

	public String getValorTotalAdicionalFracionamento() {
		return valorTotalAdicionalFracionamento;
	}

	public String getValorTotalCobertura() {
		return valorTotalCobertura;
	}

	public String getValorTotalAssistencia() {
		return valorTotalAssistencia;
	}

	public String getValorTotalAgravamento() {
		return valorTotalAgravamento;
	}

	// Setter Methods

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}

	public void setPremioTotalBruto(String premioTotalBruto) {
		this.premioTotalBruto = premioTotalBruto;
	}

	public void setPremioTotalDesconto(String premioTotalDesconto) {
		this.premioTotalDesconto = premioTotalDesconto;
	}

	public void setPremioTotalLiquido(String premioTotalLiquido) {
		this.premioTotalLiquido = premioTotalLiquido;
	}

	public void setPremioTotalIOF(String premioTotalIOF) {
		this.premioTotalIOF = premioTotalIOF;
	}

	public void setPremioTotalAdicionalFracionamento(String premioTotalAdicionalFracionamento) {
		this.premioTotalAdicionalFracionamento = premioTotalAdicionalFracionamento;
	}

	public void setPremioTotalCobertura(String premioTotalCobertura) {
		this.premioTotalCobertura = premioTotalCobertura;
	}

	public void setPremioTotalAssistencia(String premioTotalAssistencia) {
		this.premioTotalAssistencia = premioTotalAssistencia;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setValorSeguro(String valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public void setValorTotalBruto(String valorTotalBruto) {
		this.valorTotalBruto = valorTotalBruto;
	}

	public void setValorTotalDesconto(String valorTotalDesconto) {
		this.valorTotalDesconto = valorTotalDesconto;
	}

	public void setValorTotalLiquido(String valorTotalLiquido) {
		this.valorTotalLiquido = valorTotalLiquido;
	}

	public void setValorTotalIOF(String valorTotalIOF) {
		this.valorTotalIOF = valorTotalIOF;
	}

	public void setValorTotalAdicionalFracionamento(String valorTotalAdicionalFracionamento) {
		this.valorTotalAdicionalFracionamento = valorTotalAdicionalFracionamento;
	}

	public void setValorTotalCobertura(String valorTotalCobertura) {
		this.valorTotalCobertura = valorTotalCobertura;
	}

	public void setValorTotalAssistencia(String valorTotalAssistencia) {
		this.valorTotalAssistencia = valorTotalAssistencia;
	}

	public void setValorTotalAgravamento(String valorTotalAgravamento) {
		this.valorTotalAgravamento = valorTotalAgravamento;
	}
}
