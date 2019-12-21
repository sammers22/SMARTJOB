package com.mkyong;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PessoaEnderecoRowMapper implements RowMapper<PessoaEndereco> {

	@Override
	public PessoaEndereco mapRow(ResultSet rs, int rowNum) throws SQLException {

		PessoaEndereco pess = new PessoaEndereco();

		pess.setNumPessoa(rs.getInt("NUM_PESSOA"));
		pess.setNumEndereco(rs.getInt("NUM_ENDERECO"));
		pess.setCodFinEndereco(rs.getInt("COD_FIN_ENDERECO"));

		
		return pess;
	}

}