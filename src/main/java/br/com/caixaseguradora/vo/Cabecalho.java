package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Cabecalho implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8885250970409367197L;
	
	private String versao;
	private String origem;;
	private String dataHora;
	private String codigoCanal;
	private String canal;
	private String codigoEstado;
	private String estado;
	private String codigoEvento;
	private String evento;
	private String geradorEvento;
	
	public Cabecalho() {
		super();
	}
	
	public Cabecalho(String versao, String origem, String dataHora, String codigoCanal, String canal,
			String codigoEstado, String estado, String codigoEvento, String evento, String geradorEvento) {
		super();
		this.versao = versao;
		this.origem = origem;
		this.dataHora = dataHora;
		this.codigoCanal = codigoCanal;
		this.canal = canal;
		this.codigoEstado = codigoEstado;
		this.estado = estado;
		this.codigoEvento = codigoEvento;
		this.evento = evento;
		this.geradorEvento = geradorEvento;
	}
	
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getCodigoCanal() {
		return codigoCanal;
	}
	public void setCodigoCanal(String codigoCanal) {
		this.codigoCanal = codigoCanal;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getCodigoEstado() {
		return codigoEstado;
	}
	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCodigoEvento() {
		return codigoEvento;
	}
	public void setCodigoEvento(String codigoEvento) {
		this.codigoEvento = codigoEvento;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getGeradorEvento() {
		return geradorEvento;
	}
	public void setGeradorEvento(String geradorEvento) {
		this.geradorEvento = geradorEvento;
	}
	
	
	
}
