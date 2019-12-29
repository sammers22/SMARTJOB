package br.com.caixaseguradora.writer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemStreamSupport;
import org.springframework.batch.item.ItemWriter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.caixaseguradora.dao.CertificadoDAO;
import br.com.caixaseguradora.util.Util;
import br.com.caixaseguradora.vo.Beneficiarios;
import br.com.caixaseguradora.vo.Cabecalho;
import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.Clientes;
import br.com.caixaseguradora.vo.Cobertura;
import br.com.caixaseguradora.vo.DadosFinanciamento;
import br.com.caixaseguradora.vo.DadosHabitacional;
import br.com.caixaseguradora.vo.Empresa;
import br.com.caixaseguradora.vo.Endereco;
import br.com.caixaseguradora.vo.EnderecoQualificador;
import br.com.caixaseguradora.vo.EstruturaComercial;
import br.com.caixaseguradora.vo.FormaPagamento;
import br.com.caixaseguradora.vo.Franquia;
import br.com.caixaseguradora.vo.IdentificacaoExterna;
import br.com.caixaseguradora.vo.Imovel;
import br.com.caixaseguradora.vo.Instituicao;
import br.com.caixaseguradora.vo.ItensSegurado;
import br.com.caixaseguradora.vo.LimiteIndenizacao;
import br.com.caixaseguradora.vo.MapaDados;
import br.com.caixaseguradora.vo.Mensagem;
import br.com.caixaseguradora.vo.MensagemDados;
import br.com.caixaseguradora.vo.MensagemId;
import br.com.caixaseguradora.vo.ObjetoEnvio;
import br.com.caixaseguradora.vo.Oferta;
import br.com.caixaseguradora.vo.Periodicidade;
import br.com.caixaseguradora.vo.Pessoa;
import br.com.caixaseguradora.vo.PessoaId;
import br.com.caixaseguradora.vo.Premio;
import br.com.caixaseguradora.vo.RamoCaixaSeguradora;
import br.com.caixaseguradora.vo.Segurado;
import br.com.caixaseguradora.vo.Tributacao;
import br.com.caixaseguradora.vo.VigenciaContrato;

@SuppressWarnings("unused")
public class CertificadoWriter extends ItemStreamSupport implements ItemWriter<Certificado> {

	private CertificadoDAO dao;
	  
	  public void write(List<? extends Certificado> certificados) {
    	
	    for (Certificado cert : certificados) {
	    	if((cert.getVlrImpSegDfc() == null || cert.getVlrImpSegDfc().compareTo(BigDecimal.ZERO) == 0)
	    			&& (cert.getVlrPremioDfc() == null || cert.getVlrPremioDfc().compareTo(BigDecimal.ZERO) == 0)
	    					&& (cert.getVlrIofDfc() == null || cert.getVlrIofDfc().compareTo(BigDecimal.ZERO) == 0)) {
	    		cert.setCertificadoDFC(false);
	    	}else {
	    		cert.setCertificadoDFC(true);
	    	}
	    	if(cert.isCertificadoDFC() == true) {
	    		cert.setRamoDfc(14);
	    	}else {
		    	cert.setRamoMpi(dao.recuperarRamo(cert.getNumRamo(), 1));
		    	cert.setRamoDfi(dao.recuperarRamo(cert.getNumRamo(), 2));
	    	}
	    	
	    	List<Segurado> segurados = dao.recuperarSegurados(cert.getNumContrato(), cert.getNumCertificado(), cert.getSeqObjCertif());
	    	cert.setSegurados(segurados);
	    	System.out.println(cert);
	    	

	    	

	    }
	  }
	  
	  public void setDao(CertificadoDAO dao) {
	    this.dao = dao;
	  }
	  

}
