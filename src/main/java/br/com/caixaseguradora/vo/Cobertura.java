package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Cobertura implements Serializable {

	private static final long serialVersionUID = 2733477997968583675L;

	private CoberturaIdExterna identificacaoExterna;

	private List<Descontos> descontos;

	private String codigoCobertura;
	private String nome;
	private String descricao;
	private String sigla;
	private String premioLiquidoCobertura;
	private String premioTotalCobertura;
	private String adicionalFracionamentoCobertura;
	private String valorCustoEfetivoSH;
	private Tipo tipo;
	private Franquia franquia;
	private LimiteAcionamento limiteAcionamento;
	private LimiteIndenizacao limiteIndenizacao;
	private RamoCaixaSeguradora ramoCaixaSeguradora;
	private List<Tributacao> tributacao;
	

	public Cobertura() {
		super();
	}
	
	public Cobertura(CoberturaIdExterna identificacaoExterna, List<Descontos> descontos, String codigoCobertura,
			String nome, String descricao, String sigla, String premioLiquidoCobertura, String premioTotalCobertura,
			String adicionalFracionamentoCobertura, String valorCustoEfetivoSH, Tipo tipo, Franquia franquia,
			LimiteAcionamento limiteAcionamento, LimiteIndenizacao limiteIndenizacao,
			RamoCaixaSeguradora ramoCaixaSeguradora, List<Tributacao> tributacao) {
		super();
		this.identificacaoExterna = identificacaoExterna;
		this.descontos = descontos;
		this.codigoCobertura = codigoCobertura;
		this.nome = nome;
		this.descricao = descricao;
		this.sigla = sigla;
		this.premioLiquidoCobertura = premioLiquidoCobertura;
		this.premioTotalCobertura = premioTotalCobertura;
		this.adicionalFracionamentoCobertura = adicionalFracionamentoCobertura;
		this.valorCustoEfetivoSH = valorCustoEfetivoSH;
		this.tipo = tipo;
		this.franquia = franquia;
		this.limiteAcionamento = limiteAcionamento;
		this.limiteIndenizacao = limiteIndenizacao;
		this.ramoCaixaSeguradora = ramoCaixaSeguradora;
		this.tributacao = tributacao;
	}


	public CoberturaIdExterna getIdentificacaoExterna() {
		return identificacaoExterna;
	}

	public void setIdentificacaoExterna(CoberturaIdExterna identificacaoExterna) {
		this.identificacaoExterna = identificacaoExterna;
	}

	public List<Descontos> getDescontos() {
		return descontos;
	}

	public void setDescontos(List<Descontos> descontos) {
		this.descontos = descontos;
	}

	public String getCodigoCobertura() {
		return codigoCobertura;
	}

	public void setCodigoCobertura(String codigoCobertura) {
		this.codigoCobertura = codigoCobertura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getPremioLiquidoCobertura() {
		return premioLiquidoCobertura;
	}

	public void setPremioLiquidoCobertura(String premioLiquidoCobertura) {
		this.premioLiquidoCobertura = premioLiquidoCobertura;
	}

	public String getPremioTotalCobertura() {
		return premioTotalCobertura;
	}

	public void setPremioTotalCobertura(String premioTotalCobertura) {
		this.premioTotalCobertura = premioTotalCobertura;
	}

	public String getAdicionalFracionamentoCobertura() {
		return adicionalFracionamentoCobertura;
	}

	public void setAdicionalFracionamentoCobertura(String adicionalFracionamentoCobertura) {
		this.adicionalFracionamentoCobertura = adicionalFracionamentoCobertura;
	}

	public String getValorCustoEfetivoSH() {
		return valorCustoEfetivoSH;
	}

	public void setValorCustoEfetivoSH(String valorCustoEfetivoSH) {
		this.valorCustoEfetivoSH = valorCustoEfetivoSH;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Franquia getFranquia() {
		return franquia;
	}

	public void setFranquia(Franquia franquia) {
		this.franquia = franquia;
	}

	public LimiteAcionamento getLimiteAcionamento() {
		return limiteAcionamento;
	}

	public void setLimiteAcionamento(LimiteAcionamento limiteAcionamento) {
		this.limiteAcionamento = limiteAcionamento;
	}

	public LimiteIndenizacao getLimiteIndenizacao() {
		return limiteIndenizacao;
	}

	public void setLimiteIndenizacao(LimiteIndenizacao limiteIndenizacao) {
		this.limiteIndenizacao = limiteIndenizacao;
	}

	public RamoCaixaSeguradora getRamoCaixaSeguradora() {
		return ramoCaixaSeguradora;
	}

	public void setRamoCaixaSeguradora(RamoCaixaSeguradora ramoCaixaSeguradora) {
		this.ramoCaixaSeguradora = ramoCaixaSeguradora;
	}

	public List<Tributacao> getTributacao() {
		return tributacao;
	}

	public void setTributacao(List<Tributacao> tributacao) {
		this.tributacao = tributacao;
	}
	

}
