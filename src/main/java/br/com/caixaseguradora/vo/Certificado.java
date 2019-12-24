package br.com.caixaseguradora.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Certificado {
	
	private String	codProcSusep;
	private Long	numApolice;
	private Long	numCertificado;
	private Integer	numContrato;
	private Date	dtaEmissao;
	private Date	dtaIniVigencia;
	private Date	dtaFimVigencia;
	private Long	numContratoTerc;
	private String	numDvContrTerc;
	private String	nomRemunerado;
	private Integer	codRemunerado;
	private String	codSusep;
	private String	nomEstipulante;
	private Long	cpfCpnjEstip;
	private String	nomLogradouroEstip;
	private String	numLogradouroEstip;
	private String	nomBairroEstip;
	private String	nomCidadeEstip;
	private String	codCepEstip;
	private String	codUfEstip;
	private Integer	numEnderecoSegurado;
	private String	nomLogradouroSegurado;
	private String	numLogradouroSegurado;
	private String	nomBairroSegurado;
	private String	nomCidadeSegurado;
	private String	codCepSegurado;
	private String	codUfSegurado;
	private String	bemSegurado;
	private BigDecimal	vlrImpSegMip;
	private BigDecimal	vlrImpSegDfi;
	private BigDecimal	vlrImpSegDfc;
	private BigDecimal	vlrPremioMip;
	private BigDecimal	vlrPremioDfi;
	private BigDecimal	vlrPremioDfc;
	private BigDecimal	vlrIofMip;
	private BigDecimal	vlrIofDfi;
	private BigDecimal	vlrIofDfc;
	private BigDecimal	premioTotal;
	private BigDecimal	vlrCesh;
	private Integer	seqObjCertif;
	private String	indTpPagamento;
	private String	desTpPagamento;
	private Integer	indPeriodicidadeCobr;
	private String	desPeriodicidadeCobr;
	private Integer	qtdMesesContrato;
	private Integer	numRamo;
	private Integer	codFonte;
	private Date	dtaAverbacao;
	private String	staPessoa;
	private Integer ramoDfi;
	private Integer ramoMpi;
	private Integer ramoDfc;
	private boolean certificadoDFC;
	
	private List<Segurado> segurados;
	
	public String getCodProcSusep() {
		return codProcSusep;
	}
	public void setCodProcSusep(String codProcSusep) {
		this.codProcSusep = codProcSusep != null ? codProcSusep.trim() : codProcSusep;
	}
	public Long getNumApolice() {
		return numApolice;
	}
	public void setNumApolice(Long numApolice) {
		this.numApolice = numApolice;
	}
	public Long getNumCertificado() {
		return numCertificado;
	}
	public void setNumCertificado(Long numCertificado) {
		this.numCertificado = numCertificado;
	}
	public Integer getNumContrato() {
		return numContrato;
	}
	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}
	public Date getDtaEmissao() {
		return dtaEmissao;
	}
	public void setDtaEmissao(Date dtaEmissao) {
		this.dtaEmissao = dtaEmissao;
	}
	public Date getDtaIniVigencia() {
		return dtaIniVigencia;
	}
	public void setDtaIniVigencia(Date dtaIniVigencia) {
		this.dtaIniVigencia = dtaIniVigencia;
	}
	public Date getDtaFimVigencia() {
		return dtaFimVigencia;
	}
	public void setDtaFimVigencia(Date dtaFimVigencia) {
		this.dtaFimVigencia = dtaFimVigencia;
	}
	public Long getNumContratoTerc() {
		return numContratoTerc;
	}
	public void setNumContratoTerc(Long numContratoTerc) {
		this.numContratoTerc = numContratoTerc;
	}
	public String getNumDvContrTerc() {
		return numDvContrTerc;
	}
	public void setNumDvContrTerc(String numDvContrTerc) {
		this.numDvContrTerc =  numDvContrTerc != null ? numDvContrTerc.trim() : numDvContrTerc;
	}
	public String getNomRemunerado() {
		return nomRemunerado;
	}
	public void setNomRemunerado(String nomRemunerado) {
		this.nomRemunerado = nomRemunerado != null ? nomRemunerado.trim() : nomRemunerado;
	}
	public Integer getCodRemunerado() {
		return codRemunerado;
	}
	public void setCodRemunerado(Integer codRemunerado) {
		this.codRemunerado = codRemunerado;
	}
	public String getCodSusep() {
		return codSusep;
	}
	public void setCodSusep(String codSusep) {
		this.codSusep = codSusep != null ? codSusep.trim() : codSusep;
	}
	public String getNomEstipulante() {
		return nomEstipulante;
	}
	public void setNomEstipulante(String nomEstipulante) {
		this.nomEstipulante = nomEstipulante != null ? nomEstipulante.trim() : nomEstipulante;
	}
	public Long getCpfCpnjEstip() {
		return cpfCpnjEstip;
	}
	public void setCpfCpnjEstip(Long cpfCpnjEstip) {
		this.cpfCpnjEstip = cpfCpnjEstip;
	}
	public String getNomLogradouroEstip() {
		return nomLogradouroEstip;
	}
	public void setNomLogradouroEstip(String nomLogradouroEstip) {
		this.nomLogradouroEstip = nomLogradouroEstip != null ? nomLogradouroEstip.trim() : nomLogradouroEstip;
	}
	public String getNumLogradouroEstip() {
		return numLogradouroEstip;
	}
	public void setNumLogradouroEstip(String numLogradouroEstip) {
		this.numLogradouroEstip = numLogradouroEstip != null ? numLogradouroEstip.trim() : numLogradouroEstip;
	}
	public String getNomBairroEstip() {
		return nomBairroEstip;
	}
	public void setNomBairroEstip(String nomBairroEstip) {
		this.nomBairroEstip = nomBairroEstip != null ? nomBairroEstip.trim() : nomBairroEstip;
	}
	public String getNomCidadeEstip() {
		return nomCidadeEstip;
	}
	public void setNomCidadeEstip(String nomCidadeEstip) {
		this.nomCidadeEstip = nomCidadeEstip != null ? nomCidadeEstip.trim() : nomCidadeEstip;
	}
	public String getCodCepEstip() {
		return codCepEstip;
	}
	public void setCodCepEstip(String codCepEstip) {
		this.codCepEstip = codCepEstip != null ? codCepEstip.trim() : codCepEstip;
	}
	public String getCodUfEstip() {
		return codUfEstip;
	}
	public void setCodUfEstip(String codUfEstip) {
		this.codUfEstip = codUfEstip != null ? codUfEstip.trim() : codUfEstip;
	}
	public Integer getNumEnderecoSegurado() {
		return numEnderecoSegurado;
	}
	public void setNumEnderecoSegurado(Integer numEnderecoSegurado) {
		this.numEnderecoSegurado = numEnderecoSegurado;
	}
	public String getNomLogradouroSegurado() {
		return nomLogradouroSegurado;
	}
	public void setNomLogradouroSegurado(String nomLogradouroSegurado) {
		this.nomLogradouroSegurado = nomLogradouroSegurado != null ? nomLogradouroSegurado.trim() : nomLogradouroSegurado;
	}
	public String getNumLogradouroSegurado() {
		return numLogradouroSegurado;
	}
	public void setNumLogradouroSegurado(String numLogradouroSegurado) {
		this.numLogradouroSegurado = numLogradouroSegurado != null ? numLogradouroSegurado.trim() : numLogradouroSegurado;
	}
	public String getNomBairroSegurado() {
		return nomBairroSegurado;
	}
	public void setNomBairroSegurado(String nomBairroSegurado) {
		this.nomBairroSegurado = nomBairroSegurado != null ? nomBairroSegurado.trim() : nomBairroSegurado;
	}
	public String getNomCidadeSegurado() {
		return nomCidadeSegurado;
	}
	public void setNomCidadeSegurado(String nomCidadeSegurado) {
		this.nomCidadeSegurado = nomCidadeSegurado != null ? nomCidadeSegurado.trim() : nomCidadeSegurado;
	}
	public String getCodCepSegurado() {
		return codCepSegurado;
	}
	public void setCodCepSegurado(String codCepSegurado) {
		this.codCepSegurado = codCepSegurado != null ? codCepSegurado.trim() : codCepSegurado;
	}
	public String getCodUfSegurado() {
		return codUfSegurado;
	}
	public void setCodUfSegurado(String codUfSegurado) {
		this.codUfSegurado = codUfSegurado != null ? codUfSegurado.trim() : codUfSegurado;
	}
	public String getBemSegurado() {
		return bemSegurado;
	}
	public void setBemSegurado(String bemSegurado) {
		this.bemSegurado = bemSegurado != null ? bemSegurado.trim() : bemSegurado;
	}
	public BigDecimal getVlrImpSegMip() {
		return vlrImpSegMip;
	}
	public void setVlrImpSegMip(BigDecimal vlrImpSegMip) {
		this.vlrImpSegMip = vlrImpSegMip;
	}
	public BigDecimal getVlrImpSegDfi() {
		return vlrImpSegDfi;
	}
	public void setVlrImpSegDfi(BigDecimal vlrImpSegDfi) {
		this.vlrImpSegDfi = vlrImpSegDfi;
	}
	public BigDecimal getVlrImpSegDfc() {
		return vlrImpSegDfc;
	}
	public void setVlrImpSegDfc(BigDecimal vlrImpSegDfc) {
		this.vlrImpSegDfc = vlrImpSegDfc;
	}
	public BigDecimal getVlrPremioMip() {
		return vlrPremioMip;
	}
	public void setVlrPremioMip(BigDecimal vlrPremioMip) {
		this.vlrPremioMip = vlrPremioMip;
	}
	public BigDecimal getVlrPremioDfi() {
		return vlrPremioDfi;
	}
	public void setVlrPremioDfi(BigDecimal vlrPremioDfi) {
		this.vlrPremioDfi = vlrPremioDfi;
	}
	public BigDecimal getVlrPremioDfc() {
		return vlrPremioDfc;
	}
	public void setVlrPremioDfc(BigDecimal vlrPremioDfc) {
		this.vlrPremioDfc = vlrPremioDfc;
	}
	public BigDecimal getVlrIofMip() {
		return vlrIofMip;
	}
	public void setVlrIofMip(BigDecimal vlrIofMip) {
		this.vlrIofMip = vlrIofMip;
	}
	public BigDecimal getVlrIofDfi() {
		return vlrIofDfi;
	}
	public void setVlrIofDfi(BigDecimal vlrIofDfi) {
		this.vlrIofDfi = vlrIofDfi;
	}
	public BigDecimal getVlrIofDfc() {
		return vlrIofDfc;
	}
	public void setVlrIofDfc(BigDecimal vlrIofDfc) {
		this.vlrIofDfc = vlrIofDfc;
	}
	public BigDecimal getPremioTotal() {
		return premioTotal;
	}
	public void setPremioTotal(BigDecimal premioTotal) {
		this.premioTotal = premioTotal;
	}
	public BigDecimal getVlrCesh() {
		return vlrCesh;
	}
	public void setVlrCesh(BigDecimal vlrCesh) {
		this.vlrCesh = vlrCesh;
	}
	public Integer getSeqObjCertif() {
		return seqObjCertif;
	}
	public void setSeqObjCertif(Integer seqObjCertif) {
		this.seqObjCertif = seqObjCertif;
	}
	public String getIndTpPagamento() {
		return indTpPagamento;
	}
	public void setIndTpPagamento(String indTpPagamento) {
		this.indTpPagamento = indTpPagamento != null ? indTpPagamento.trim() : indTpPagamento;
		if(indTpPagamento != null) {
			if(indTpPagamento.equals("A")) {
				setDesTpPagamento("Antecipado");				
			}
			if(indTpPagamento.equals("P")) {
				setDesTpPagamento("Postecipado");				
			}			
		}else {
			setDesTpPagamento("");							
		}
	}	
	public String getDesTpPagamento() {
		return desTpPagamento;
	}
	public void setDesTpPagamento(String desTpPagamento) {
		this.desTpPagamento = desTpPagamento;
	}
	public Integer getIndPeriodicidadeCobr() {
		return indPeriodicidadeCobr;
	}
	public void setIndPeriodicidadeCobr(Integer indPeriodicidadeCobr) {
		this.indPeriodicidadeCobr = indPeriodicidadeCobr;
		if(indPeriodicidadeCobr != null) {
			if(indPeriodicidadeCobr.equals(1)) {
				setDesPeriodicidadeCobr("À Vista");
			}
			if(indPeriodicidadeCobr.equals(2)) {
				setDesPeriodicidadeCobr("Mensal");
			}
			if(indPeriodicidadeCobr.equals(3)) {
				setDesPeriodicidadeCobr("Trimestral");
			}
			if(indPeriodicidadeCobr.equals(4)) {
				setDesPeriodicidadeCobr("Anual");
			}
		}
	}	
	public String getDesPeriodicidadeCobr() {
		return desPeriodicidadeCobr;
	}
	public void setDesPeriodicidadeCobr(String desPeriodicidadeCobr) {
		this.desPeriodicidadeCobr = desPeriodicidadeCobr;
	}
	public Integer getQtdMesesContrato() {
		return qtdMesesContrato;
	}
	public void setQtdMesesContrato(Integer qtdMesesContrato) {
		this.qtdMesesContrato = qtdMesesContrato;
	}
	public Integer getNumRamo() {
		return numRamo;
	}
	public void setNumRamo(Integer numRamo) {
		this.numRamo = numRamo;
	}
	public Integer getCodFonte() {
		return codFonte;
	}
	public void setCodFonte(Integer codFonte) {
		this.codFonte = codFonte;
	}
	public Date getDtaAverbacao() {
		return dtaAverbacao;
	}
	public void setDtaAverbacao(Date dtaAverbacao) {
		this.dtaAverbacao = dtaAverbacao;
	}
	public String getStaPessoa() {
		return staPessoa;
	}
	public void setStaPessoa(String staPessoa) {
		this.staPessoa =  staPessoa != null ? staPessoa.trim() : staPessoa;
	}
	public List<Segurado> getSegurados() {
		return segurados;
	}
	public void setSegurados(List<Segurado> segurados) {
		this.segurados = segurados;
	}
	
	
	public Integer getRamoDfi() {
		return ramoDfi;
	}
	public void setRamoDfi(Integer ramoDfi) {
		this.ramoDfi = ramoDfi;
	}
	public Integer getRamoMpi() {
		return ramoMpi;
	}
	public void setRamoMpi(Integer ramoMpi) {
		this.ramoMpi = ramoMpi;
	}
	public Integer getRamoDfc() {
		return ramoDfc;
	}
	public void setRamoDfc(Integer ramoDfc) {
		this.ramoDfc = ramoDfc;
	}
	public boolean isCertificadoDFC() {
		return certificadoDFC;
	}
	public void setCertificadoDFC(boolean certificadoDFC) {
		this.certificadoDFC = certificadoDFC;
	}
	@Override
	public String toString() {
		return "Certificado [codProcSusep=" + codProcSusep + ", numApolice=" + numApolice + ", numCertificado="
				+ numCertificado + ", numContrato=" + numContrato + ", dtaEmissao=" + dtaEmissao + ", dtaIniVigencia="
				+ dtaIniVigencia + ", dtaFimVigencia=" + dtaFimVigencia + ", numContratoTerc=" + numContratoTerc
				+ ", numDvContrTerc=" + numDvContrTerc + ", nomRemunerado=" + nomRemunerado + ", codRemunerado="
				+ codRemunerado + ", codSusep=" + codSusep + ", nomEstipulante=" + nomEstipulante + ", cpfCpnjEstip="
				+ cpfCpnjEstip + ", nomLogradouroEstip=" + nomLogradouroEstip + ", numLogradouroEstip="
				+ numLogradouroEstip + ", nomBairroEstip=" + nomBairroEstip + ", nomCidadeEstip=" + nomCidadeEstip
				+ ", codCepEstip=" + codCepEstip + ", codUfEstip=" + codUfEstip + ", numEnderecoSegurado="
				+ numEnderecoSegurado + ", nomLogradouroSegurado=" + nomLogradouroSegurado + ", numLogradouroSegurado="
				+ numLogradouroSegurado + ", nomBairroSegurado=" + nomBairroSegurado + ", nomCidadeSegurado="
				+ nomCidadeSegurado + ", codCepSegurado=" + codCepSegurado + ", codUfSegurado=" + codUfSegurado
				+ ", bemSegurado=" + bemSegurado + ", vlrImpSegMip=" + vlrImpSegMip + ", vlrImpSegDfi=" + vlrImpSegDfi
				+ ", vlrImpSegDfc=" + vlrImpSegDfc + ", vlrPremioMip=" + vlrPremioMip + ", vlrPremioDfi=" + vlrPremioDfi
				+ ", vlrPremioDfc=" + vlrPremioDfc + ", vlrIofMip=" + vlrIofMip + ", vlrIofDfi=" + vlrIofDfi
				+ ", vlrIofDfc=" + vlrIofDfc + ", premioTotal=" + premioTotal + ", vlrCesh=" + vlrCesh
				+ ", seqObjCertif=" + seqObjCertif + ", indTpPagamento=" + indTpPagamento + ", indPeriodicidadeCobr="
				+ indPeriodicidadeCobr + ", qtdMesesContrato=" + qtdMesesContrato + ", numRamo=" + numRamo
				+ ", codFonte=" + codFonte + ", dtaAverbacao=" + dtaAverbacao + ", staPessoa=" + staPessoa
				+ ", segurados=" + segurados + "]";
	}
	
	
	
}