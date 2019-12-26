package br.com.caixaseguradora.dao;

import java.util.List;

import br.com.caixaseguradora.vo.Certificado;
import br.com.caixaseguradora.vo.PremioEndosso;
import br.com.caixaseguradora.vo.Segurado;
import br.com.caixaseguradora.vo.Telefone;

public interface CertificadoDAO {

	public List<Segurado> recuperarSegurados(Integer numContrato, Long numCertificado, Integer seqCertificado);
	public Integer recuperarRamo(Integer numRamo, Integer numCobertura);
	public  List<Certificado> recuperarCertificado(Integer numContrato);
	public List<Telefone> recuperarTelefones(Integer numPessoa);
	public List<String> recuperarEmails(Integer numPessoa);
	public PremioEndosso recuperarPremioEndosso(Integer numContrato);
	
}
