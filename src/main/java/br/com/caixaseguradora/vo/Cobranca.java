package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Cobranca implements Serializable{

	private static final long serialVersionUID = -7509190433506891675L;
	private List<Opcoes> opcoes;
	private Adesao adesao;
	private Plano plano;

	public Cobranca() {
		super();
	}

	public Cobranca(List<Opcoes> opcoes, Adesao adesao, Plano plano) {
		super();
		this.opcoes = opcoes;
		this.adesao = adesao;
		this.plano = plano;
	}

	public List<Opcoes> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<Opcoes> opcoes) {
		this.opcoes = opcoes;
	}

	public Adesao getAdesao() {
		return adesao;
	}

	public void setAdesao(Adesao adesao) {
		this.adesao = adesao;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

}
