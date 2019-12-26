package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Telefone implements Serializable {

	private static final long serialVersionUID = 1662283186104251424L;
	private Integer numDDD;
	private Integer numTelefone;
	private String desTpTelefone;

	public Telefone() {
		super();
	}

	public Telefone(Integer numDDD, Integer numTelefone, String desTpTelefone) {
		super();
		this.numDDD = numDDD;
		this.numTelefone = numTelefone;
		this.desTpTelefone = desTpTelefone;
	}

	public Integer getNumDDD() {
		return numDDD;
	}

	public void setNumDDD(Integer numDDD) {
		this.numDDD = numDDD;
	}

	public Integer getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(Integer numTelefone) {
		this.numTelefone = numTelefone;
	}

	public String getDesTpTelefone() {
		return desTpTelefone;
	}

	public void setDesTpTelefone(String desTpTelefone) {
		this.desTpTelefone = desTpTelefone;
	}

	

}
