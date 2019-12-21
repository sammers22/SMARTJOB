package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Descontos implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 7006087230876084189L;
	private String valor;
	private String descricao;
	private String tipoValor;
	private String motivo;

	/**
	 * 
	 */
	public Descontos() {
		super();
	}

	/**
	 * @param valor
	 * @param descricao
	 * @param tipoValor
	 * @param motivo
	 */
	public Descontos(String valor, String descricao, String tipoValor, String motivo) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.tipoValor = tipoValor;
		this.motivo = motivo;
	}

	// Getter Methods

	public String getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTipoValor() {
		return tipoValor;
	}

	public String getMotivo() {
		return motivo;
	}

	// Setter Methods

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
