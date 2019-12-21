package br.com.caixaseguradora.vo;

import java.util.List;

public class DadosBoleto {

	private String nomeTitular;
	private String codigoBarras;
	private String nossoNumero;
	private List<DadosBoletoMensagem> mensagens;
	private String valorDocumento;
	private String numeroDocumento;
	private String codigoCedente;
	private String linhaDigitavel;
	private String dataDocumento;
	private Juros juros;

	// Getter Methods

	public String getNomeTitular() {
		return nomeTitular;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public String getNossoNumero() {
		return nossoNumero;
	}

	public String getValorDocumento() {
		return valorDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getCodigoCedente() {
		return codigoCedente;
	}

	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}

	public String getDataDocumento() {
		return dataDocumento;
	}

	public Juros getJuros() {
		return juros;
	}

	// Setter Methods

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public void setValorDocumento(String valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public void setCodigoCedente(String codigoCedente) {
		this.codigoCedente = codigoCedente;
	}

	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}

	public void setDataDocumento(String dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public void setJuros(Juros jurosObject) {
		this.juros = jurosObject;
	}

	public List<DadosBoletoMensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<DadosBoletoMensagem> mensagens) {
		this.mensagens = mensagens;
	}

}
