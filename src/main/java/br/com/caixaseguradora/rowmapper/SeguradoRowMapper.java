package br.com.caixaseguradora.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import br.com.caixaseguradora.vo.Segurado;

public class SeguradoRowMapper implements RowMapper<Segurado> , ParameterizedRowMapper<Segurado> {

	@Override
	public Segurado mapRow(ResultSet rs, int rowNum) throws SQLException {

		Segurado seg = new Segurado();

		seg.setNomRazSocial(rs.getString(1));
		seg.setCpfCnpjSegurado(rs.getLong(2));
		seg.setPctPactuacao(rs.getBigDecimal(3));

		
		return seg;
	}

}
