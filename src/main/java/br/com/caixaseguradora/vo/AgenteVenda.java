package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class AgenteVenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1871152647003461773L;
	private String codigoNegocioAgenteVenda;
	private String codigoDVAgenteVenda;

	/**
	 * 
	 */
	public AgenteVenda() {
		super();
	}

	/**
	 * @param codigoNegocioAgenteVenda
	 * @param codigoDVAgenteVenda
	 */
	public AgenteVenda(String codigoNegocioAgenteVenda, String codigoDVAgenteVenda) {
		super();
		this.codigoNegocioAgenteVenda = codigoNegocioAgenteVenda;
		this.codigoDVAgenteVenda = codigoDVAgenteVenda;
	}

	// Getter Methods

	public String getCodigoNegocioAgenteVenda() {
		return codigoNegocioAgenteVenda;
	}

	public String getCodigoDVAgenteVenda() {
		return codigoDVAgenteVenda;
	}

	// Setter Methods

	public void setCodigoNegocioAgenteVenda(String codigoNegocioAgenteVenda) {
		this.codigoNegocioAgenteVenda = codigoNegocioAgenteVenda;
	}

	public void setCodigoDVAgenteVenda(String codigoDVAgenteVenda) {
		this.codigoDVAgenteVenda = codigoDVAgenteVenda;
	}
}
