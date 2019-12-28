package br.com.caixaseguradora.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import br.com.caixaseguradora.dao.CertificadoDAO;
import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.DadosBancariosDTO;
import br.com.caixaseguradora.vo.PremioEndosso;
import br.com.caixaseguradora.vo.Segurado;
import br.com.caixaseguradora.vo.Telefone;

@SuppressWarnings("deprecation")
public class CertificadoDAOImpl implements CertificadoDAO {

	private SimpleJdbcTemplate simpleJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	public List<Segurado> recuperarSegurados(Integer numContrato, Long numCertificado, Integer seqCertificado) {
		String sql = " SELECT OP.NUM_PESSOA, P.NOM_RAZ_SOCIAL, P.NUM_CPF_CNPJ AS cpfCnpjSegurado, OP.PCT_PACTUACAO, PF.DTA_NASCIMENTO FROM " + 
				" SEGUROS.SX_OBJ_CERTIF OC, SEGUROS.SX_OBJ_CERTIF_PES OCP, " + 
				" SEGUROS.SX_OBJ_PESSOA OP, SEGUROS.SX_PESSOA P, SEGUROS.SX_PESSOA_FISICA PF"+
				" WHERE OC.NUM_CONTRATO = OCP.NUM_CONTRATO " + 
				" AND OC.NUM_CERTIFICADO = OCP.NUM_CERTIFICADO " + 
				" AND OC.SEQ_OBJ_CERTIF = OCP.SEQ_OBJ_CERTIF " + 
				" AND OCP.NUM_CONTRATO = OP.NUM_CONTRATO " + 
				" AND OCP.NUM_PESSOA = OP.NUM_PESSOA " + 
				" AND OCP.SEQ_OBJETO = OP.SEQ_OBJETO " + 
				" AND OP.NUM_PESSOA = P.NUM_PESSOA" + 
				" AND PF.NUM_PESSOA = P.NUM_PESSOA" + 
				" AND OCP.NUM_CONTRATO = " +numContrato+ 
				" AND OC.NUM_CERTIFICADO = " + numCertificado+
				" AND OC.SEQ_OBJ_CERTIF = "+seqCertificado;
		
		 List<Segurado> seg = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Segurado.class));

		 return seg;
	}
	
	public PremioEndosso recuperarPremioEndosso(Integer numContrato) {
		
		String sql = "SELECT PRE.VLR_PARCELA,PRE.VLR_PREMIO, ENDO.NUM_ENDOSSO, EPARH.NUM_IDLG, EPARH.DTA_VENCIMENTO,END_PARC.DTA_QUITACAO  FROM SEGUROS.SX_PREMIO PRE" + 
				" INNER JOIN SEGUROS.SX_FATURA_PREMIO FP ON PRE.NUM_CONTRATO = FP.NUM_CONTRATO " + 
				"											AND PRE.SEQ_PREMIO = FP.SEQ_PREMIO" + 
				" INNER JOIN SEGUROS.SX_FATURA F ON FP.SEQ_FATURA = F.SEQ_FATURA " + 
				"											AND FP.NUM_ORI_CONTRATO = F.NUM_ORI_CONTRATO" + 
				" INNER JOIN SEGUROS.SX_EM_ENDOSSO_FATURA ENDFAT ON ENDFAT.NUM_ORI_CONTRATO = F.NUM_ORI_CONTRATO " + 
				"											AND ENDFAT.SEQ_FATURA = F.SEQ_FATURA" + 
				" LEFT JOIN SEGUROS.SX_EM_PROP_ENDOSSO PR_END ON PR_END.SEQ_APOLICE = ENDFAT.SEQ_APOLICE " + 
				"											AND PR_END.NUM_PROP_ENDOSSO = ENDFAT.NUM_PROP_ENDOSSO" + 
				" LEFT JOIN SEGUROS.SX_EM_ENDOSSO ENDO ON ENDO.SEQ_APOLICE = ENDFAT.SEQ_APOLICE " + 
				"											AND ENDO.NUM_PROP_ENDOSSO = ENDFAT.NUM_PROP_ENDOSSO" + 
				" LEFT JOIN SEGUROS.SX_EM_ENDOSSO_PARC END_PARC ON END_PARC.SEQ_APOLICE = ENDO.SEQ_APOLICE " + 
				"									 		AND END_PARC.NUM_ENDOSSO = ENDO.NUM_ENDOSSO" + 
				" LEFT JOIN SEGUROS.SX_EM_ENDOSSO_PARC_HIST EPARH ON EPARH.SEQ_APOLICE = END_PARC.SEQ_APOLICE " + 
				"											AND EPARH.NUM_ENDOSSO = END_PARC.NUM_ENDOSSO" + 
				"											AND EPARH.NUM_PARCELA = END_PARC.NUM_PARCELA" + 
				"											AND EPARH.COD_OPERACAO = 101" + 
				" WHERE ENDO.COD_ENDOSSO_MOTIVO = 102 AND PRE.NUM_CONTRATO = "+numContrato+" AND PRE.STA_PREMIO = 'A'" + 
				" AND PRE.SEQ_PREMIO IN (SELECT MIN(PREIN.SEQ_PREMIO) FROM SEGUROS.SX_PREMIO PREIN WHERE PREIN.NUM_CONTRATO = "+numContrato+" AND PREIN.STA_PREMIO = 'A')";
		
		List<PremioEndosso> preEndosso = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(PremioEndosso.class));
		if(preEndosso!= null) {
			return preEndosso.get(0);
		}else {
			return null;			
		}
	}
	
	private DadosBancariosDTO recuperarDadosBancarios(Integer numPessoa) {
		String sql = " SELECT PECB.COD_BANCO, PECB.COD_AGENCIA, PECB.NUM_CONTA, PECB.NUM_DV_CONTA, PECB.NUM_OPER_CONTA, BAN.NOME_BANCO "+ 
				" FROM SEGUROS.SX_PESSOA_CONTA_BANCO  PECB "+
				" LEFT JOIN SEGUROS.BANCOS BAN ON PECB.COD_BANCO = BAN.COD_BANCO  "+
				" where NUM_PESSOA =  "+numPessoa;
		
		List<DadosBancariosDTO> dadosBanc = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(DadosBancariosDTO.class));
		if(dadosBanc!= null) {
			return dadosBanc.get(0);
		}else {
			return null;			
		}
	}
	
	public List<Telefone> recuperarTelefones(Integer numPessoa) {
		String sql = " SELECT PT.NUM_DDD AS numDDD, PT.NUM_TELEFONE AS numTelefone, TPTEL.DES_TP_TELEFONE AS desTpTelefone FROM SEGUROS.SX_PESSOA_TELEFONE PT " + 
				"INNER JOIN SEGUROS.SX_TP_TELEFONE TPTEL ON PT.COD_TP_TELEFONE = TPTEL.COD_TP_TELEFONE " + 
				"WHERE PT.NUM_PESSOA = "+numPessoa;
		
		List<Telefone> tels = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Telefone.class));
		
		return tels;		
	}
	
	public List<String> recuperarEmails(Integer numPessoa){
		String sql = " SELECT PC.DES_EMAIL_CONTATO FROM SEGUROS.SX_PESSOA_CONTATO PC WHERE PC.NUM_PESSOA ="+numPessoa;
		List<String> emails = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(String.class));
		
		return emails;
	}
	
	
	public Integer recuperarRamo(Integer numRamo, Integer numCobertura) {
		String sql = "SELECT NUM_RAMO_CONTABIL FROM SEGUROS.SX_RAMO_COBER_CONTABIL "
				+" WHERE NUM_RAMO = "+numRamo
				+" AND NUM_COBERTURA = "+numCobertura;
		Integer ramo = simpleJdbcTemplate.queryForInt(sql);
		
		return ramo;
	}
	
	 public  List<Certificado> recuperarCertificado(Integer numContrato) {
		 String sql = "SELECT DISTINCT A.COD_PROC_SUSEP, A.NUM_APOLICE,OC.NUM_CERTIFICADO, CS.NUM_CONTRATO,OC.DTA_EMISSAO, OC.DTA_INI_VIGENCIA, OC.DTA_FIM_VIGENCIA,"+
		 " CT.NUM_CONTRATO_TERC, ct.NUM_DV_CONTR_TERC,"+
		 " ARP.NOM_RAZ_SOCIAL AS nomRemunerado, AR.COD_REMUNERADO, AR.COD_SUSEP, ARP.NUM_CPF_CNPJ as numCpfCnpjRemunerado, "+
		 " PE.NOM_RAZ_SOCIAL AS nomEstipulante, PE.NUM_CPF_CNPJ AS cpfCpnjEstip, ENDER.NOM_LOGRADOURO AS NOM_LOGRADOURO_ESTIP, ENDER.NUM_LOGRADOURO AS NUM_LOGRADOURO_ESTIP,"+
		 " ENDER.NOM_BAIRRO AS NOM_BAIRRO_ESTIP, ENDER.NOM_CIDADE AS NOM_CIDADE_ESTIP, ENDER.COD_CEP AS COD_CEP_ESTIP, ENDER.COD_UF AS COD_UF_ESTIP,"+
		 " E.NUM_ENDERECO AS NUM_ENDERECO_SEGURADO, E.NOM_LOGRADOURO AS NOM_LOGRADOURO_SEGURADO, E.NUM_LOGRADOURO AS NUM_LOGRADOURO_SEGURADO,"+
		 " E.NOM_BAIRRO AS NOM_BAIRRO_SEGURADO, E.NOM_CIDADE AS NOM_CIDADE_SEGURADO, E.COD_CEP AS COD_CEP_SEGURADO, E.COD_UF AS COD_UF_SEGURADO, 'IMOVEL' AS BEM_SEGURADO,"+
		 " OC.VLR_IMP_SEG_MIP, OC.VLR_IMP_SEG_DFI, OC.VLR_IMP_SEG_DFC, OC.VLR_PREMIO_MIP, OC.VLR_PREMIO_DFI,OC.VLR_PREMIO_DFC, OC.VLR_IOF_MIP, OC.VLR_IOF_DFI, OC.VLR_IOF_DFC,"+
		 " (OC.VLR_PREMIO_MIP + OC.VLR_PREMIO_DFI + OC.VLR_PREMIO_DFC + OC.VLR_IOF_MIP + OC.VLR_IOF_DFI + OC.VLR_IOF_DFC) AS PREMIO_TOTAL,"+
		 " OC.VLR_CESH,  OC.SEQ_OBJ_CERTIF,  DF.IND_TP_PAGAMENTO, DF.IND_PERIODICIDADE_COBR, CS.QTD_MESES_CONTRATO,"+
		 " RAMO.NUM_RAMO, FONTE.COD_FONTE,  CS.DTA_AVERBACAO, PE.STA_PESSOA,"+
		 " PROD.COD_PRODUTO as codProduto, PROD.DES_PRODUTO as desProduto , RAMO.NOM_RAMO AS nomRamo, PROD.COD_GRUPO_SUSEP AS codGrupoSusep,"+
		 " CT.NUM_DIA_VENCTO AS numDiaVencto, DF.QTD_PARCELA_PAGTO qtdParcelaPagto, O.NUM_PES_ESTIP as numPesEstip, "+
		 " FONTE.NOME_FONTE, FONTE.ORGAO_EMISSOR, TERC_HAB.COD_UNID_OPER "+
		 " FROM SEGUROS.SX_OBJ_CERTIF OC"+
		 " INNER JOIN SEGUROS.SX_CONTR_SEGURO CS ON OC.NUM_CONTRATO = CS.NUM_CONTRATO"+
		 " INNER JOIN SEGUROS.SX_CONTR_TERC CT ON CS.NUM_CONTRATO = CT.NUM_CONTRATO"+
		 " LEFT JOIN  SEGUROS.SX_CONTR_TERC_HAB TERC_HAB ON TERC_HAB.NUM_CONTRATO_TERC = CT.NUM_CONTRATO_TERC "+
		 " INNER JOIN SEGUROS.SX_ORIGEM_CONTRATO O ON CT.NUM_ORI_CONTRATO = O.NUM_ORI_CONTRATO"+
		 " INNER JOIN SEGUROS.SX_APOLICE A ON O.SEQ_APOLICE = A.SEQ_PROP_APOL"+
		 " INNER JOIN SEGUROS.SX_APOL_FINANC DF ON A.SEQ_PROP_APOL = DF.SEQ_APOLICE"+
		 " INNER JOIN SEGUROS.SX_PESSOA PE ON O.NUM_PES_ESTIP = PE.NUM_PESSOA"+
		 " INNER JOIN SEGUROS.SX_PESSOA_ENDERECO PEND ON PE.NUM_PESSOA = PEND.NUM_PESSOA AND PEND.COD_FIN_ENDERECO = 4 "+
		 " INNER JOIN SEGUROS.SX_ENDERECO ENDER ON ENDER.NUM_ENDERECO = PEND.NUM_ENDERECO "+
		 " INNER JOIN SEGUROS.SX_OBJ_CERTIF_PES OCP ON OC.NUM_CONTRATO = OCP.NUM_CONTRATO"+
											 " AND OC.NUM_CERTIFICADO = OCP.NUM_CERTIFICADO"+
											 " AND OC.SEQ_OBJ_CERTIF = OCP.SEQ_OBJ_CERTIF"+
		 " INNER JOIN SEGUROS.SX_OBJ_PESSOA OP ON OCP.NUM_CONTRATO = OP.NUM_CONTRATO AND OCP.NUM_PESSOA = OP.NUM_PESSOA AND OCP.NUM_PESSOA = OP.NUM_PESSOA"+
		 " INNER JOIN SEGUROS.SX_PESSOA P ON OP.NUM_PESSOA = P.NUM_PESSOA "+
		 " INNER JOIN SEGUROS.SX_OBJ_ENDERECO OE ON CS.NUM_CONTRATO = OE.NUM_CONTRATO AND OE.COD_TP_ENDERECO = 1 AND OE.STA_ENDERECO = 'A' "+
		 " INNER JOIN SEGUROS.SX_ENDERECO E ON E.NUM_ENDERECO = OE.NUM_ENDERECO "+
		 " INNER JOIN SEGUROS.SX_APOL_REMUNERA AR ON A.SEQ_PROP_APOL = AR.SEQ_APOLICE  AND AR.COD_TP_REMUNERA = 2 "+
		 " INNER JOIN SEGUROS.SX_PESSOA ARP ON AR.NUM_PES_REMUNERA = ARP.NUM_PESSOA "+
		 " INNER JOIN SEGUROS.SX_PRODUTO PROD ON O.COD_PRODUTO = PROD.COD_PRODUTO "+
		 " INNER JOIN SEGUROS.SX_RAMO RAMO ON PROD.NUM_RAMO = RAMO.NUM_RAMO "+
		 " INNER JOIN SEGUROS.FONTES FONTE ON  A.COD_FONTE = FONTE.COD_FONTE "+
		 " WHERE "+
		 " OC.STA_CERTIFICADO = 'A' "+
		 " AND OC.NUM_CONTRATO = "+numContrato;

		 List<Certificado> certificado = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Certificado.class));

		 for (Certificado cert : certificado) {
			 List<Segurado> segurados = recuperarSegurados(cert.getNumContrato(), cert.getNumCertificado(), cert.getSeqObjCertif());
			 for (Segurado seg : segurados) {
				 seg.setTelefones(recuperarTelefones(seg.getNumPessoa()));
				 seg.setEmails(recuperarEmails(seg.getNumPessoa()));
			 }
			 cert.setSegurados(segurados);
			 cert.setPremioEndosso(recuperarPremioEndosso(numContrato));  
			 cert.setBancariosEstip(recuperarDadosBancarios(cert.getNumPesEstip()));
			 
			 if((cert.getVlrImpSegDfc() == null || cert.getVlrImpSegDfc().compareTo(BigDecimal.ZERO) == 0)
			    && (cert.getVlrPremioDfc() == null || cert.getVlrPremioDfc().compareTo(BigDecimal.ZERO) == 0)
			     && (cert.getVlrIofDfc() == null || cert.getVlrIofDfc().compareTo(BigDecimal.ZERO) == 0)) {
				 System.out.println( "não é DFC");
			     cert.setCertificadoDFC(false);
			 }else {
				 System.out.println( "é DFC");
			     cert.setCertificadoDFC(true);
			 }
			 if(cert.isCertificadoDFC() == true) {
			     cert.setRamoDfc(14);
			 }else {
			     cert.setRamoMpi(recuperarRamo(cert.getNumRamo(), 1));
			     cert.setRamoDfi(recuperarRamo(cert.getNumRamo(), 2));
			     }
			 }

		 return certificado;
		 }	
	 
	 
}
