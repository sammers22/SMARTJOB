package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class EstruturaComercial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8374032485650476806L;
	
	private Empresa empresa;

	public EstruturaComercial() {
		super();
	}
	
	public EstruturaComercial(Empresa empresa) {
		super();
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
