package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class ContratosAverbados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8605551999573141373L;
	private Integer numContrato;

	public ContratosAverbados() {
		super();
	}

	public ContratosAverbados(Integer numContrato) {
		super();
		this.numContrato = numContrato;
	}

	public Integer getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}

}
