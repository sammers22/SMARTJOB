package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class PessoaSeguradoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4861357591363915375L;
	private String tipo;
	private String documento;
	private String codigo;

	public PessoaSeguradoId() {
		super();
	}

	public PessoaSeguradoId(String tipo, String documento, String codigo) {
		super();
		this.tipo = tipo;
		this.documento = documento;
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
