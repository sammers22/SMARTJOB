package br.com.caixaseguradora.vo;

public class Beneficiarios {

	private GrauParentesco grauParentesco;
	private String percentualParticipacao;
	private Pessoa pessoa;
			
	public Beneficiarios() {
		super();
	}

	public Beneficiarios(GrauParentesco grauParentesco, String percentualParticipacao, Pessoa pessoa) {
		super();
		this.grauParentesco = grauParentesco;
		this.percentualParticipacao = percentualParticipacao;
		this.pessoa = pessoa;
	}
	
	public GrauParentesco getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(GrauParentesco grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public String getPercentualParticipacao() {
		return percentualParticipacao;
	}
	public void setPercentualParticipacao(String percentualParticipacao) {
		this.percentualParticipacao = percentualParticipacao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
