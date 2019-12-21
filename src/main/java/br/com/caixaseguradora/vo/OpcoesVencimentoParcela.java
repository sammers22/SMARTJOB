package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class OpcoesVencimentoParcela implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6233869014103094597L;
	private String diaVencimento;
	
	public OpcoesVencimentoParcela() {
		super();
	}

	public OpcoesVencimentoParcela(String diaVencimento) {
		super();
		this.diaVencimento = diaVencimento;
	}

	public String getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(String diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	
	

}
