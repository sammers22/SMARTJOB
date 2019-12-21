package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Plano implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3771939585969487063L;
	private String codigoIDLG;
	private Mecanismo mecanismo;
	private String valorParcela;
	private Periodicidade periodicidade;
	private String quantidadeParcelas;
	private List<OpcoesVencimentoParcela> opcoesVencimentoParcela;
	private Moeda moeda;
	private List<Tributacao> tributacao;

	public Plano() {
		super();
	}

	public Plano(String codigoIDLG, Mecanismo mecanismo, String valorParcela, Periodicidade periodicidade,
			String quantidadeParcelas, List<OpcoesVencimentoParcela> opcoesVencimentoParcela, Moeda moeda,
			List<Tributacao> tributacao) {
		super();
		this.codigoIDLG = codigoIDLG;
		this.mecanismo = mecanismo;
		this.valorParcela = valorParcela;
		this.periodicidade = periodicidade;
		this.quantidadeParcelas = quantidadeParcelas;
		this.opcoesVencimentoParcela = opcoesVencimentoParcela;
		this.moeda = moeda;
		this.tributacao = tributacao;
	}

	public String getCodigoIDLG() {
		return codigoIDLG;
	}

	public void setCodigoIDLG(String codigoIDLG) {
		this.codigoIDLG = codigoIDLG;
	}

	public Mecanismo getMecanismo() {
		return mecanismo;
	}

	public void setMecanismo(Mecanismo mecanismo) {
		this.mecanismo = mecanismo;
	}

	public String getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(String valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Periodicidade getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(Periodicidade periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(String quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public List<OpcoesVencimentoParcela> getOpcoesVencimentoParcela() {
		return opcoesVencimentoParcela;
	}

	public void setOpcoesVencimentoParcela(List<OpcoesVencimentoParcela> opcoesVencimentoParcela) {
		this.opcoesVencimentoParcela = opcoesVencimentoParcela;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}

	public List<Tributacao> getTributacao() {
		return tributacao;
	}

	public void setTributacao(List<Tributacao> tributacao) {
		this.tributacao = tributacao;
	}

}
