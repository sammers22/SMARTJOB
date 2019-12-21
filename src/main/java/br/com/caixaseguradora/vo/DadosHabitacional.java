package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class DadosHabitacional implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6103387428003592853L;
	private String tipo;
    private String dataAverbacao;
    private DadosFinanciamento dadosFinanciamento;
    
	public DadosHabitacional(String tipo, String dataAverbacao, DadosFinanciamento dadosFinanciamento) {
		super();
		this.tipo = tipo;
		this.dataAverbacao = dataAverbacao;
		this.dadosFinanciamento = dadosFinanciamento;
	}
	
	public DadosHabitacional() {
		super();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDataAverbacao() {
		return dataAverbacao;
	}
	public void setDataAverbacao(String dataAverbacao) {
		this.dataAverbacao = dataAverbacao;
	}
	public DadosFinanciamento getDadosFinanciamento() {
		return dadosFinanciamento;
	}
	public void setDadosFinanciamento(DadosFinanciamento dadosFinanciamento) {
		this.dadosFinanciamento = dadosFinanciamento;
	}
    
	
    
    
}
