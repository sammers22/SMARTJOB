package com.mkyong;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PessoaRowMapper implements RowMapper<Pessoa> {

	@Override
	public Pessoa mapRow(ResultSet rs, int rowNum) throws SQLException {

		Pessoa pess = new Pessoa();

		pess.setNumPessoa(rs.getInt("NUM_PESSOA"));
		pess.setNumCpfCnpj(rs.getLong("NUM_CPF_CNPJ"));
		pess.setNomRazSocial(rs.getString("NUM_CPF_CNPJ"));
		pess.setIndTpPessoa(rs.getString("IND_TP_PESSOA"));
		pess.setStaPessao(rs.getString("STA_PESSOA"));
		pess.setCodExterno(rs.getInt("COD_EXTERNO"));
		pess.setCodIntegracao(rs.getInt("COD_INTEGRACAO"));
		pess.setDtaCadastramento(rs.getDate("DTA_CADASTRAMENTO"));
		
		return pess;
	}

}