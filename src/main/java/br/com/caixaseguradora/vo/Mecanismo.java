package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Mecanismo implements Serializable {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 7532839252977089405L;
	private String tipo;
	private Dados dados;


	 // Getter Methods 

	  public String getTipo() {
	    return tipo;
	  }

	  public Dados getDados() {
	    return dados;
	  }

	 // Setter Methods 

	  public void setTipo( String tipo ) {
	    this.tipo = tipo;
	  }

	  public void setDados( Dados dados ) {
	    this.dados = dados;
	  }

}
