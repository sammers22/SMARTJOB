package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class PessoaId implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 2312639405488607079L;
	private String tipo;
	private String documento;
	private String codigo;

	public PessoaId() {
		super();
	}

	public PessoaId(String tipo, String documento, String codigo) {
		super();
		this.tipo = tipo;
		this.documento = documento;
		this.codigo = codigo;
	}

	// Getter Methods

	public String getTipo() {
		return tipo;
	}

	public String getDocumento() {
		return documento;
	}

	public String getCodigo() {
		return codigo;
	}

	// Setter Methods

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
