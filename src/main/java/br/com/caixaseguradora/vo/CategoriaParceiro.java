package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class CategoriaParceiro implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4289319317897401210L;
	private String codigo;
    private String valor;
            
	public CategoriaParceiro() {
		super();
	}
	
	public CategoriaParceiro(String codigo, String valor) {
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
