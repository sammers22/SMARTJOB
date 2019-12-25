package br.com.caixaseguradora.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.caixaseguradora.vo.ContratosAverbados;

public class ContratosAverbadosRowMapper implements RowMapper<ContratosAverbados> {

	@Override
	public ContratosAverbados mapRow(ResultSet rs, int rowNum) throws SQLException {

		ContratosAverbados contrato = new ContratosAverbados();

		contrato.setNumContrato(rs.getInt("NUM_CONTRATO"));

		return contrato;
	}

}
