package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Imovel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3927589728181873694L;
	private Endereco endereco;

	public Imovel() {
		super();
	}

	public Imovel(Endereco endereco) {
		super();
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
