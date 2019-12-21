package br.com.caixaseguradora.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.mkyong.Pessoa;

import br.com.caixaseguradora.dao.PessoaDAO;

@SuppressWarnings("deprecation")
public class PessoaDAOImpl implements PessoaDAO{

	private static final String INSERT_TRADE_RECORD = " UPDATE SEGUROS.SX_PESSOA SET NOM_RAZ_SOCIAL = ? WHERE NUM_PESSOA = ?";
		  
		  private SimpleJdbcTemplate simpleJdbcTemplate;    
		  
		  public void setDataSource(DataSource dataSource) {
		    this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
		  }
		     
		  public void atualizarPessoa(Pessoa pessoa) {      
			  System.out.println("update");
			  simpleJdbcTemplate.update(INSERT_TRADE_RECORD, pessoa.getNomRazSocial(), pessoa.getNumPessoa());
		              
		  }
}
