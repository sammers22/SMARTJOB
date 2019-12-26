package br.com.caixaseguradora.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PremioEndosso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3337274614626938344L;
	private BigDecimal vlrParcel;
	private BigDecimal vlrPremio;
	private Integer numEndosso;
	private String numIdlg;
	private Date dtaVencimento;
	private Date dtaQuitacao;
	
		
	public PremioEndosso() {
		super();
	}
	public PremioEndosso(BigDecimal vlrParcel, BigDecimal vlrPremio, Integer numEndosso, String numIdlg,
			Date dtaVencimento) {
		super();
		this.vlrParcel = vlrParcel;
		this.vlrPremio = vlrPremio;
		this.numEndosso = numEndosso;
		this.numIdlg = numIdlg;
		this.dtaVencimento = dtaVencimento;
	}
	
	public BigDecimal getVlrParcel() {
		return vlrParcel;
	}
	public void setVlrParcel(BigDecimal vlrParcel) {
		this.vlrParcel = vlrParcel;
	}
	public BigDecimal getVlrPremio() {
		return vlrPremio;
	}
	public void setVlrPremio(BigDecimal vlrPremio) {
		this.vlrPremio = vlrPremio;
	}
	public Integer getNumEndosso() {
		return numEndosso;
	}
	public void setNumEndosso(Integer numEndosso) {
		this.numEndosso = numEndosso;
	}
	public String getNumIdlg() {
		return numIdlg;
	}
	public void setNumIdlg(String numIdlg) {
		this.numIdlg = numIdlg;
	}
	public Date getDtaVencimento() {
		return dtaVencimento;
	}
	public void setDtaVencimento(Date dtaVencimento) {
		this.dtaVencimento = dtaVencimento;
	}
	public Date getDtaQuitacao() {
		return dtaQuitacao;
	}
	public void setDtaQuitacao(Date dtaQuitacao) {
		this.dtaQuitacao = dtaQuitacao;
	}
	
	

}
