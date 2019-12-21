package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Clientes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6176305849451039464L;

	private TipoCliente tipoCliente;
	
	private Pessoa pessoa;
	
	private Endereco endereco;
	
	private Comunicacao comunicacao;
	
	private List<Qualificadores> qualificadores;
	private List<Documentos> documentos;
			
	public Clientes() {
		super();
	}
	public Clientes(TipoCliente tipoCliente, Pessoa pessoa, Endereco endereco, Comunicacao comunicacao,
			List<Qualificadores> qualificadores, List<Documentos> documentos) {
		super();
		this.tipoCliente = tipoCliente;
		this.pessoa = pessoa;
		this.endereco = endereco;
		this.comunicacao = comunicacao;
		this.qualificadores = qualificadores;
		this.documentos = documentos;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public List<Documentos> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documentos> documentos) {
		this.documentos = documentos;
	}
	
	
	

}
