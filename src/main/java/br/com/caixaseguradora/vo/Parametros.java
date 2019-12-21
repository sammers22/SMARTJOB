package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Parametros implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -748245571265038307L;
	private String codigo;
	private String tipo;
	private String valor;
	
	
	
	public Parametros() {
		super();
	}
	public Parametros(String codigo, String tipo, String valor) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.valor = valor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
