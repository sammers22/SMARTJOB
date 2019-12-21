package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class EnderecoQualificador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1479340084587670537L;
	private String codigo;	
	private String valor;
			
	public EnderecoQualificador() {
		super();
	}
	
	public EnderecoQualificador(String codigo, String valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

	
}
