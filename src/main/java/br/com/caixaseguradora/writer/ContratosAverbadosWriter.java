package br.com.caixaseguradora.writer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemStreamSupport;
import org.springframework.batch.item.ItemWriter;

import br.com.caixaseguradora.dao.CertificadoDAO;
import br.com.caixaseguradora.json.EventoCertificado;
import br.com.caixaseguradora.util.Util;
import br.com.caixaseguradora.vo.Beneficiarios;
import br.com.caixaseguradora.vo.Cabecalho;
import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.Clientes;
import br.com.caixaseguradora.vo.Cobertura;
import br.com.caixaseguradora.vo.ContratosAverbados;
import br.com.caixaseguradora.vo.DadosFinanciamento;
import br.com.caixaseguradora.vo.DadosHabitacional;
import br.com.caixaseguradora.vo.Empresa;
import br.com.caixaseguradora.vo.Endereco;
import br.com.caixaseguradora.vo.EnderecoQualificador;
import br.com.caixaseguradora.vo.EstruturaComercial;
import br.com.caixaseguradora.vo.Franquia;
import br.com.caixaseguradora.vo.IdentificacaoExterna;
import br.com.caixaseguradora.vo.Imovel;
import br.com.caixaseguradora.vo.Instituicao;
import br.com.caixaseguradora.vo.ItensSegurado;
import br.com.caixaseguradora.vo.LimiteIndenizacao;
import br.com.caixaseguradora.vo.Mensagem;
import br.com.caixaseguradora.vo.MensagemDados;
import br.com.caixaseguradora.vo.MensagemId;
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
public class ContratosAverbadosWriter extends ItemStreamSupport implements ItemWriter<ContratosAverbados> {

	private CertificadoDAO dao;
	  
	  public void write(List<? extends ContratosAverbados> contratos) {
	    for (ContratosAverbados contr : contratos) {
	    	System.out.println(contr.getNumContrato());
	    	List<Certificado> certificados =  dao.recuperarCertificado(contr.getNumContrato());
	    	for (Certificado certificado : certificados) {
	    		
	    		System.out.println(certificado);		    		
	    		String certJson = EventoCertificado.eventoCertificadoMipDfi(certificado);
	    		System.out.println(certJson);
			}
	    }
	  }
	  
	  public void setDao(CertificadoDAO dao) {
	    this.dao = dao;
	  }
	  

}
