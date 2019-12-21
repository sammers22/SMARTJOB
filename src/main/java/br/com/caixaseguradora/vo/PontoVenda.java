package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class PontoVenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1590809985070992238L;
	private String codigo;
	private String nome;
	private String tipo;
	private String codigoExterno;
	private Vigencia vigencia;
	private ResponsavelCaixaSeguradora responsavelCaixaSeguradora;
	private ResponsavelEmpresa responsavelEmpresa;
	private String situacao;
	private Canal canal;
	private AgenteVenda agenteVenda;

	public PontoVenda() {
		super();
	}

	public PontoVenda(String codigo, String nome, String tipo, String codigoExterno) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.codigoExterno = codigoExterno;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public Vigencia getVigencia() {
		return vigencia;
	}

	public void setVigencia(Vigencia vigencia) {
		this.vigencia = vigencia;
	}

	public ResponsavelCaixaSeguradora getResponsavelCaixaSeguradora() {
		return responsavelCaixaSeguradora;
	}

	public void setResponsavelCaixaSeguradora(ResponsavelCaixaSeguradora responsavelCaixaSeguradora) {
		this.responsavelCaixaSeguradora = responsavelCaixaSeguradora;
	}

	public ResponsavelEmpresa getResponsavelEmpresa() {
		return responsavelEmpresa;
	}

	public void setResponsavelEmpresa(ResponsavelEmpresa responsavelEmpresa) {
		this.responsavelEmpresa = responsavelEmpresa;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public AgenteVenda getAgenteVenda() {
		return agenteVenda;
	}

	public void setAgenteVenda(AgenteVenda agenteVenda) {
		this.agenteVenda = agenteVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codigoExterno == null) ? 0 : codigoExterno.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PontoVenda other = (PontoVenda) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (codigoExterno == null) {
			if (other.codigoExterno != null)
				return false;
		} else if (!codigoExterno.equals(other.codigoExterno))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

}
