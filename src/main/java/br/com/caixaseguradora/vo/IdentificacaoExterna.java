package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class IdentificacaoExterna implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3812971156796321451L;
	private Instituicao instituicao;

	public IdentificacaoExterna(Instituicao instituicao) {
		super();
		this.instituicao = instituicao;
	}

	public IdentificacaoExterna() {
		super();
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

}
