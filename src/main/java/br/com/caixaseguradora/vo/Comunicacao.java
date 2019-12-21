package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class Comunicacao  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8913000482399691282L;
	private List<Parametros> parametros;
	private Acoes acoes;
	
	
	
	public Comunicacao() {
		super();
	}
	public Comunicacao(List<Parametros> parametros, Acoes acoes) {
		super();
		this.parametros = parametros;
		this.acoes = acoes;
	}
	public List<Parametros> getParametros() {
		return parametros;
	}
	public void setParametros(List<Parametros> parametros) {
		this.parametros = parametros;
	}
	public Acoes getAcoes() {
		return acoes;
	}
	public void setAcoes(Acoes acoes) {
		this.acoes = acoes;
	}
	
	
	
	
}
