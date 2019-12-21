package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Oferta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1595653068982891820L;
	
	private List<IdentificacaoExterna> identificacaoExterna;
	private  List<OfertaId> identificacao;
	
	public Oferta() {
		super();
	}

	public List<IdentificacaoExterna> getIdentificacaoExterna() {
		return identificacaoExterna;
	}

	public void setIdentificacaoExterna(List<IdentificacaoExterna> identificacaoExterna) {
		this.identificacaoExterna = identificacaoExterna;
	}

	public List<OfertaId> getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(List<OfertaId> identificacao) {
		this.identificacao = identificacao;
	}


	

}
