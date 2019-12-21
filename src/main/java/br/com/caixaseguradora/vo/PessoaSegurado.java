package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class PessoaSegurado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1799017695557035765L;
	private PessoaSeguradoId identificacao;
	private String nome;
	private DadosPessoaFisica dadosPessoaFisica;
	private Endereco endereco;
	private Assinatura assinatura;
	private Comunicacao comunicacao;
	private List<Qualificadores> qualificadores;

	public PessoaSegurado() {
		super();
	}

	public PessoaSegurado(PessoaSeguradoId identificacao, String nome, DadosPessoaFisica dadosPessoaFisica,
			Endereco endereco, Assinatura assinatura, Comunicacao comunicacao, List<Qualificadores> qualificadores) {
		super();
		this.identificacao = identificacao;
		this.nome = nome;
		this.dadosPessoaFisica = dadosPessoaFisica;
		this.endereco = endereco;
		this.assinatura = assinatura;
		this.comunicacao = comunicacao;
		this.qualificadores = qualificadores;
	}

	public PessoaSeguradoId getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(PessoaSeguradoId identificacao) {
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Assinatura getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}

	public Comunicacao getComunicacao() {
		return comunicacao;
	}

	public void setComunicacao(Comunicacao comunicacao) {
		this.comunicacao = comunicacao;
	}

	public List<Qualificadores> getQualificadores() {
		return qualificadores;
	}

	public void setQualificadores(List<Qualificadores> qualificadores) {
		this.qualificadores = qualificadores;
	}

}
