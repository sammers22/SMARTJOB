package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Empresa  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6036388311009563568L;

	private IdentificacaoExterna identificacaoExterna;
	
	private String codigo;						
	private String codigoNegocio;				
	private String CNPJ;							
	private String nome;							
	private String situacao;						
	private String tipoRelacionamentoComercial;
	
	private CategoriaParceiro categoriaParceiro;
	
	private String tipo;
	private String descricao;
	private Endereco endereco;
	
	private PontoVenda pontoVenda;
		
	/**
	 * 
	 */
	public Empresa() {
		super();
	}

	public Empresa(IdentificacaoExterna identificacaoExterna, String codigo, String codigoNegocio, String cNPJ,
			String nome, String situacao, String tipoRelacionamentoComercial, CategoriaParceiro categoriaParceiro,
			String tipo, String descricao, Endereco endereco, PontoVenda pontoVenda) {
		super();
		this.identificacaoExterna = identificacaoExterna;
		this.codigo = codigo;
		this.codigoNegocio = codigoNegocio;
		CNPJ = cNPJ;
		this.nome = nome;
		this.situacao = situacao;
		this.tipoRelacionamentoComercial = tipoRelacionamentoComercial;
		this.categoriaParceiro = categoriaParceiro;
		this.tipo = tipo;
		this.descricao = descricao;
		this.endereco = endereco;
		this.pontoVenda = pontoVenda;
	}

	public IdentificacaoExterna getIdentificacaoExterna() {
		return identificacaoExterna;
	}

	public void setIdentificacaoExterna(IdentificacaoExterna identificacaoExterna) {
		this.identificacaoExterna = identificacaoExterna;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoNegocio() {
		return codigoNegocio;
	}

	public void setCodigoNegocio(String codigoNegocio) {
		this.codigoNegocio = codigoNegocio;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipoRelacionamentoComercial() {
		return tipoRelacionamentoComercial;
	}

	public void setTipoRelacionamentoComercial(String tipoRelacionamentoComercial) {
		this.tipoRelacionamentoComercial = tipoRelacionamentoComercial;
	}

	public CategoriaParceiro getCategoriaParceiro() {
		return categoriaParceiro;
	}

	public void setCategoriaParceiro(CategoriaParceiro categoriaParceiro) {
		this.categoriaParceiro = categoriaParceiro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public PontoVenda getPontoVenda() {
		return pontoVenda;
	}

	public void setPontoVenda(PontoVenda pontoVenda) {
		this.pontoVenda = pontoVenda;
	}
	
	
	
}
