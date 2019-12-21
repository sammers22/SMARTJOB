package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosPessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6434231918668891678L;
	private String dataNascimento;
	private Sexo sexo;
	private EstadoCivil estadoCivil;
	private Profissao profissao;
	private Nacionalidade nacionalidade;

	public DadosPessoaFisica() {
		super();
	}

	public DadosPessoaFisica(String dataNascimento, Sexo sexo, EstadoCivil estadoCivil, Profissao profissao,
			Nacionalidade nacionalidade) {
		super();
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.nacionalidade = nacionalidade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
