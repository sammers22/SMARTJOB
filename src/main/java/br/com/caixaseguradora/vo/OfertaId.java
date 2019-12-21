package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class OfertaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2208999486919079889L;

	private String codigoOferta;
	private String codigoNegocioOferta;
	private String codigoProduto;
	private String codigoNegocioProduto;
	private OfertaIdDados dados;

	public OfertaId() {
		super();
	}

	public OfertaId(String codigoOferta, String codigoNegocioOferta, String codigoProduto,
			String codigoNegocioProduto) {
		super();
		this.codigoOferta = codigoOferta;
		this.codigoNegocioOferta = codigoNegocioOferta;
		this.codigoProduto = codigoProduto;
		this.codigoNegocioProduto = codigoNegocioProduto;
	}

	public OfertaIdDados getDados() {
		return dados;
	}

	public void setDados(OfertaIdDados dados) {
		this.dados = dados;
	}

	public String getCodigoOferta() {
		return codigoOferta;
	}

	public void setCodigoOferta(String codigoOferta) {
		this.codigoOferta = codigoOferta;
	}

	public String getCodigoNegocioOferta() {
		return codigoNegocioOferta;
	}

	public void setCodigoNegocioOferta(String codigoNegocioOferta) {
		this.codigoNegocioOferta = codigoNegocioOferta;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getCodigoNegocioProduto() {
		return codigoNegocioProduto;
	}

	public void setCodigoNegocioProduto(String codigoNegocioProduto) {
		this.codigoNegocioProduto = codigoNegocioProduto;
	}

}
