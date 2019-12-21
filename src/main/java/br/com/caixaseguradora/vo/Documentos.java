package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Documentos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5135225652261299035L;
	private String nome;
	private String tipo;
	private String sigla;
	private String valor;
	private String orgaoExpedicao;
	private String dataExpedicao;
	private String ufExpedicao;

	public Documentos() {
		super();
	}

	public Documentos(String nome, String tipo, String sigla, String valor, String orgaoExpedicao, String dataExpedicao,
			String ufExpedicao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.sigla = sigla;
		this.valor = valor;
		this.orgaoExpedicao = orgaoExpedicao;
		this.dataExpedicao = dataExpedicao;
		this.ufExpedicao = ufExpedicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getOrgaoExpedicao() {
		return orgaoExpedicao;
	}

	public void setOrgaoExpedicao(String orgaoExpedicao) {
		this.orgaoExpedicao = orgaoExpedicao;
	}

	public String getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(String dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public String getUfExpedicao() {
		return ufExpedicao;
	}

	public void setUfExpedicao(String ufExpedicao) {
		this.ufExpedicao = ufExpedicao;
	}

}
