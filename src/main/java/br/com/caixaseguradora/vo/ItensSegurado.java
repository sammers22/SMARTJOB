package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.util.List;

public class ItensSegurado implements Serializable{

	private static final long serialVersionUID = -7903714743995170560L;
	private String tipoItemSegurado;
	private DadosPessoa dadosPessoa;
	private Beneficiarios beneficiarios;
	private DadosHabitacional dadosHabitacional;
	
	private List<Cobertura> coberturas;
	
	private Imovel imovel;
		
	public ItensSegurado() {
		super();
	}

	public ItensSegurado(String tipoItemSegurado, DadosPessoa dadosPessoa, Beneficiarios beneficiarios,
			DadosHabitacional dadosHabitacional, List<Cobertura> coberturas, Imovel imovel) {
		super();
		this.tipoItemSegurado = tipoItemSegurado;
		this.dadosPessoa = dadosPessoa;
		this.beneficiarios = beneficiarios;
		this.dadosHabitacional = dadosHabitacional;
		this.coberturas = coberturas;
		this.imovel = imovel;
	}

	public String getTipoItemSegurado() {
		return tipoItemSegurado;
	}

	public void setTipoItemSegurado(String tipoItemSegurado) {
		this.tipoItemSegurado = tipoItemSegurado;
	}

	public DadosPessoa getDadosPessoa() {
		return dadosPessoa;
	}

	public void setDadosPessoa(DadosPessoa dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}

	public Beneficiarios getBeneficiarios() {
		return beneficiarios;
	}

	public void setBeneficiarios(Beneficiarios beneficiarios) {
		this.beneficiarios = beneficiarios;
	}

	public DadosHabitacional getDadosHabitacional() {
		return dadosHabitacional;
	}

	public void setDadosHabitacional(DadosHabitacional dadosHabitacional) {
		this.dadosHabitacional = dadosHabitacional;
	}

	public List<Cobertura> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(List<Cobertura> coberturas) {
		this.coberturas = coberturas;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	
}
