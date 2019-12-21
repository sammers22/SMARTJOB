package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosPessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2513937930811202238L;
	private PessoaSegurado segurado;

	public DadosPessoa() {
		super();
	}

	public DadosPessoa(PessoaSegurado segurado) {
		super();
		this.segurado = segurado;
	}

	public PessoaSegurado getSegurado() {
		return segurado;
	}

	public void setSegurado(PessoaSegurado segurado) {
		this.segurado = segurado;
	}

}
