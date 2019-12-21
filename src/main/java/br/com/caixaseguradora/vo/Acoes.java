package br.com.caixaseguradora.vo;

import java.io.Serializable;

public class Acoes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6095156956909963501L;
	private boolean enviaEmail;
	private boolean enviaSMS;
	private boolean enviaImpresso;
	private boolean enviaPush;
	private boolean assina;
	private boolean geraPDF;
	private boolean armazenaHCP;
	private boolean emailComProva;

	public Acoes() {
		super();
	}

	public Acoes(boolean enviaEmail, boolean enviaSMS, boolean enviaImpresso, boolean enviaPush, boolean assina,
			boolean geraPDF, boolean armazenaHCP, boolean emailComProva) {
		super();
		this.enviaEmail = enviaEmail;
		this.enviaSMS = enviaSMS;
		this.enviaImpresso = enviaImpresso;
		this.enviaPush = enviaPush;
		this.assina = assina;
		this.geraPDF = geraPDF;
		this.armazenaHCP = armazenaHCP;
		this.emailComProva = emailComProva;
	}

	public boolean isEnviaEmail() {
		return enviaEmail;
	}

	public void setEnviaEmail(boolean enviaEmail) {
		this.enviaEmail = enviaEmail;
	}

	public boolean isEnviaSMS() {
		return enviaSMS;
	}

	public void setEnviaSMS(boolean enviaSMS) {
		this.enviaSMS = enviaSMS;
	}

	public boolean isEnviaImpresso() {
		return enviaImpresso;
	}

	public void setEnviaImpresso(boolean enviaImpresso) {
		this.enviaImpresso = enviaImpresso;
	}

	public boolean isEnviaPush() {
		return enviaPush;
	}

	public void setEnviaPush(boolean enviaPush) {
		this.enviaPush = enviaPush;
	}

	public boolean isAssina() {
		return assina;
	}

	public void setAssina(boolean assina) {
		this.assina = assina;
	}

	public boolean isGeraPDF() {
		return geraPDF;
	}

	public void setGeraPDF(boolean geraPDF) {
		this.geraPDF = geraPDF;
	}

	public boolean isArmazenaHCP() {
		return armazenaHCP;
	}

	public void setArmazenaHCP(boolean armazenaHCP) {
		this.armazenaHCP = armazenaHCP;
	}

	public boolean isEmailComProva() {
		return emailComProva;
	}

	public void setEmailComProva(boolean emailComProva) {
		this.emailComProva = emailComProva;
	}

}
