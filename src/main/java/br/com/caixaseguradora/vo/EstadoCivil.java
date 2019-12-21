package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class EstadoCivil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6580706880625780498L;
	private String codigo;
	private String valor;

	public EstadoCivil() {
		super();
	}

	public EstadoCivil(String codigo, String valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	// Getter Methods

	public String getCodigo() {
		return codigo;
	}

	public String getValor() {
		return valor;
	}

	// Setter Methods

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
