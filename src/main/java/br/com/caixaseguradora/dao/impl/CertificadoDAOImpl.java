package br.com.caixaseguradora.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import br.com.caixaseguradora.dao.CertificadoDAO;
import br.com.caixaseguradora.vo.Segurado;

@SuppressWarnings("deprecation")
public class CertificadoDAOImpl implements CertificadoDAO {

	private SimpleJdbcTemplate simpleJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	public List<Segurado> recuperarSegurados(Integer numContrato, Long numCertificado, Integer seqCertificado) {
		String sql = " SELECT P.NOM_RAZ_SOCIAL, P.NUM_CPF_CNPJ AS cpfCnpjSegurado, OP.PCT_PACTUACAO FROM " + 
				" SEGUROS.SX_OBJ_CERTIF OC, SEGUROS.SX_OBJ_CERTIF_PES OCP, " + 
				" SEGUROS.SX_OBJ_PESSOA OP, SEGUROS.SX_PESSOA P" + 
				" WHERE OC.NUM_CONTRATO = OCP.NUM_CONTRATO " + 
				" AND OC.NUM_CERTIFICADO = OCP.NUM_CERTIFICADO " + 
				" AND OC.SEQ_OBJ_CERTIF = OCP.SEQ_OBJ_CERTIF " + 
				" AND OCP.NUM_CONTRATO = OP.NUM_CONTRATO " + 
				" AND OCP.NUM_PESSOA = OP.NUM_PESSOA " + 
				" AND OCP.SEQ_OBJETO = OP.SEQ_OBJETO " + 
				" AND OP.NUM_PESSOA = P.NUM_PESSOA" + 
				" AND OCP.NUM_CONTRATO = " +numContrato+ 
				" AND OC.NUM_CERTIFICADO = " + numCertificado+
				" AND OC.SEQ_OBJ_CERTIF = "+seqCertificado;
		
		 List<Segurado> seg = simpleJdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Segurado.class));

		 return seg;

	}
	
	public Integer recuperarRamo(Integer numRamo, Integer numCobertura) {
		String sql = "SELECT NUM_RAMO_CONTABIL FROM SEGUROS.SX_RAMO_COBER_CONTABIL "
				+" WHERE NUM_RAMO = "+numRamo
				+" AND NUM_COBERTURA"+numCobertura;
		Integer ramo = simpleJdbcTemplate.queryForInt(sql);
		
		return ramo;
	}
}
