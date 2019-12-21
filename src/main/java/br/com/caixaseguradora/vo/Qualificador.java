package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Qualificador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9187058211192412410L;
	private String grupo;
	private String ramo;
	private String descricaoRamo;

	public Qualificador() {
		super();
	}

	public Qualificador(String grupo, String ramo, String descricaoRamo) {
		super();
		this.grupo = grupo;
		this.ramo = ramo;
		this.descricaoRamo = descricaoRamo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getDescricaoRamo() {
		return descricaoRamo;
	}

	public void setDescricaoRamo(String descricaoRamo) {
		this.descricaoRamo = descricaoRamo;
	}

}
