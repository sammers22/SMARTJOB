package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7722776103637927104L;
	private PessoaId identificacao;
	private String nome;
	
	private String dataNascimento;
	private boolean isentaIOF;
	private String faturamentoAnual;
	
	private DadosPessoaFisica dadosPessoaFisica; /*Apenas deve ser usado no json o campo dataNascimento */
			
	public Pessoa() {
		super();
	}

	public Pessoa(PessoaId identificacao, String nome, DadosPessoaFisica dadosPessoaFisica) {
		super();
		this.identificacao = identificacao;
		this.nome = nome;
		this.dadosPessoaFisica = dadosPessoaFisica;
	}
	
	/**
	 * Contrutor para Pessoa Cliente
	 * @param identificacao
	 * @param nome
	 * @param dataNascimento
	 * @param isentaIOF
	 * @param faturamentoAnual
	 * @param dadosPessoaFisica
	 */	
	public Pessoa(PessoaId identificacao, String nome, String dataNascimento, boolean isentaIOF, String faturamentoAnual,
			DadosPessoaFisica dadosPessoaFisica) {
		super();
		this.identificacao = identificacao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.isentaIOF = isentaIOF;
		this.faturamentoAnual = faturamentoAnual;
		this.dadosPessoaFisica = dadosPessoaFisica;
	}

	public PessoaId getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(PessoaId identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public DadosPessoaFisica getDadosPessoaFisica() {
		return dadosPessoaFisica;
	}
	public void setDadosPessoaFisica(DadosPessoaFisica dadosPessoaFisica) {
		this.dadosPessoaFisica = dadosPessoaFisica;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean getIsentaIOF() {
		return isentaIOF;
	}

	public void setIsentaIOF(boolean isentaIOF) {
		this.isentaIOF = isentaIOF;
	}

	public String getFaturamentoAnual() {
		return faturamentoAnual;
	}

	public void setFaturamentoAnual(String faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	} 	
	
	
	
}
