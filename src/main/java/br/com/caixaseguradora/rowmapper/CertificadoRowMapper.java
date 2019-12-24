package br.com.caixaseguradora.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import br.com.caixaseguradora.vo.Certificado;

public class CertificadoRowMapper implements RowMapper<Certificado> {

	@Override
	public Certificado mapRow(ResultSet rs, int rowNum) throws SQLException {

		Certificado certificado = new Certificado();

		certificado.setCodProcSusep(rs.getString("COD_PROC_SUSEP"));
		certificado.setNumApolice(rs.getLong("NUM_APOLICE"));
		certificado.setNumCertificado(rs.getLong("NUM_CERTIFICADO"));
		certificado.setNumContrato(rs.getInt("NUM_CONTRATO"));
		certificado.setDtaEmissao(rs.getDate("DTA_EMISSAO"));
		certificado.setDtaIniVigencia(rs.getDate("DTA_INI_VIGENCIA"));
		certificado.setDtaFimVigencia(rs.getDate("DTA_FIM_VIGENCIA"));
		certificado.setNumContratoTerc(rs.getLong("NUM_CONTRATO_TERC"));
		certificado.setNumDvContrTerc(rs.getString("NUM_DV_CONTR_TERC"));
		certificado.setNomRemunerado(rs.getString("NOME_REMUNERADO"));
		certificado.setCodRemunerado(rs.getInt("COD_REMUNERADO"));
		certificado.setCodSusep(rs.getString("COD_SUSEP"));
		certificado.setNomEstipulante(rs.getString("NOME_ESTIPULANTE"));
		certificado.setCpfCpnjEstip(rs.getLong("CPF_CNPJ_ESTIP"));
		certificado.setNomLogradouroEstip(rs.getString("NOM_LOGRADOURO_ESTIP"));
		certificado.setNumLogradouroEstip(rs.getString("NUM_LOGRADOURO_ESTIP"));
		certificado.setNomBairroEstip(rs.getString("NOM_BAIRRO_ESTIP"));
		certificado.setNomCidadeEstip(rs.getString("NOM_CIDADE_ESTIP"));
		certificado.setCodCepEstip(rs.getString("COD_CEP_ESTIP"));
		certificado.setCodUfEstip(rs.getString("COD_UF_ESTIP"));
/*		certificado.setNomeSegurado(rs.getString("NOME_SEGURADO"));
		certificado.setCpfCnpjSegurado(rs.getLong("CPF_CNPJ_SEGURADO"));
		certificado.setPctPactuacao(rs.getBigDecimal("PCT_PACTUACAO"));*/
		certificado.setNumEnderecoSegurado(rs.getInt("NUM_ENDERECO_SEGURADO"));
		certificado.setNomLogradouroSegurado(rs.getString("NOM_LOGRADOURO_SEGURADO"));
		certificado.setNumLogradouroSegurado(rs.getString("NUM_LOGRADOURO_SEGURADO"));
		certificado.setNomBairroSegurado(rs.getString("NOM_BAIRRO_SEGURADO"));
		certificado.setNomCidadeSegurado(rs.getString("NOM_CIDADE_SEGURADO"));
		certificado.setCodCepSegurado(rs.getString("COD_CEP_SEGURADO"));
		certificado.setCodUfSegurado(rs.getString("COD_UF_SEGURADO"));
		certificado.setBemSegurado(rs.getString("BEM_SEGURADO"));
		certificado.setVlrImpSegMip(rs.getBigDecimal("VLR_IMP_SEG_MIP"));
		certificado.setVlrImpSegDfi(rs.getBigDecimal("VLR_IMP_SEG_DFI"));
		certificado.setVlrImpSegDfc(rs.getBigDecimal("VLR_IMP_SEG_DFC"));
		certificado.setVlrPremioMip(rs.getBigDecimal("VLR_PREMIO_MIP"));
		certificado.setVlrPremioDfi(rs.getBigDecimal("VLR_PREMIO_DFI"));
		certificado.setVlrPremioDfc(rs.getBigDecimal("VLR_PREMIO_DFC"));
		certificado.setVlrIofMip(rs.getBigDecimal("VLR_IOF_MIP"));
		certificado.setVlrIofDfi(rs.getBigDecimal("VLR_IOF_DFI"));
		certificado.setVlrIofDfc(rs.getBigDecimal("VLR_IOF_DFC"));
		certificado.setPremioTotal(rs.getBigDecimal("PREMIO_TOTAL"));
		certificado.setVlrCesh(rs.getBigDecimal("VLR_CESH"));
		certificado.setSeqObjCertif(rs.getInt("SEQ_OBJ_CERTIF"));
		certificado.setIndTpPagamento(rs.getString("IND_TP_PAGAMENTO"));
		
		certificado.setIndPeriodicidadeCobr(rs.getInt("IND_PERIODICIDADE_COBR"));
		certificado.setQtdMesesContrato(rs.getInt("QTD_MESES_CONTRATO"));
		certificado.setNumRamo(rs.getInt("NUM_RAMO"));
		certificado.setCodFonte(rs.getInt("COD_FONTE"));
		certificado.setDtaAverbacao(rs.getDate("DTA_AVERBACAO"));
		certificado.setStaPessoa(rs.getString("STA_PESSOA"));
		
		return certificado;
	}

}
