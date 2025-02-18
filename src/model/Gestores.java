package model;

public class Gestores {
	private String tipagem;
	private String fatorRH;

	public Gestores () {
		
	}

	public String getTipagem() {
		return tipagem;
	}

	public void setTipagem(String tipagem) {
		this.tipagem = tipagem;
	}

	public String getFatorRH() {
		return fatorRH;
	}

	public void setFatorRH(String fatorRH) {
		this.fatorRH = fatorRH;
	}
	

	@Override
	public String toString() {
		return "Tipagem: " + getTipagem() + "\n" + "FatorRH: " + getFatorRH();
	}
	
	
	
}
