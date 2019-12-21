package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Dados implements Serializable {

	private static final long serialVersionUID = 234195087352285219L;
	private DadosInstituicao instituicao;
	private DadosCartao dadosCartao;
	private DadosBoleto dadosBoleto;
	private String dataVencimento;
	private DadosBancarios dadosBancarios;

	public Dados() {
		super();
	}

	public Dados(DadosInstituicao instituicao, DadosCartao dadosCartao) {
		super();
		this.instituicao = instituicao;
		this.dadosCartao = dadosCartao;
	}

	public Dados(DadosInstituicao instituicao, DadosCartao dadosCartao, DadosBoleto dadosBoleto, String dataVencimento,
			DadosBancarios dadosBancarios) {
		super();
		this.instituicao = instituicao;
		this.dadosCartao = dadosCartao;
		this.dadosBoleto = dadosBoleto;
		this.dataVencimento = dataVencimento;
		this.dadosBancarios = dadosBancarios;
	}

	public DadosInstituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(DadosInstituicao instituicao) {
		this.instituicao = instituicao;
	}

	public DadosCartao getDadosCartao() {
		return dadosCartao;
	}

	public void setDadosCartao(DadosCartao dadosCartao) {
		this.dadosCartao = dadosCartao;
	}

	public DadosBoleto getDadosBoleto() {
		return dadosBoleto;
	}

	public void setDadosBoleto(DadosBoleto dadosBoleto) {
		this.dadosBoleto = dadosBoleto;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public DadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

}
