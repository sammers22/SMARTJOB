package br.com.caixaseguradora.writer;

import java.util.List;

import org.springframework.batch.item.ItemStreamSupport;
import org.springframework.batch.item.ItemWriter;

import com.mkyong.Pessoa;

import br.com.caixaseguradora.dao.PessoaDAO;

public class PessoaWriter extends ItemStreamSupport implements ItemWriter<Pessoa> {

	private PessoaDAO dao;
	  
	  public void write(List<? extends Pessoa> pessoas) {
	    for (Pessoa pessoa : pessoas) {
	      dao.atualizarPessoa(pessoa);
	    }
	    System.out.println("->>>> Foram atualizadas " + pessoas.size() + " tarifa(s).");
	  }
	  
	  public void setDao(PessoaDAO dao) {
	    this.dao = dao;
	  }
}
