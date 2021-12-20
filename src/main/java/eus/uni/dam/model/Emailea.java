package eus.uni.dam.model;

public class Emailea {
	
	String izena;
	int adina;
	
	
	public Emailea() {
		super();
	}
	public Emailea(String izena, int adina) {
		super();
		this.izena = izena;
		this.adina = adina;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getAdina() {
		return adina;
	}
	public void setAdina(int adina) {
		this.adina = adina;
	}
	@Override
	public String toString() {
		return "Emailea [izena=" + izena + ", adina=" + adina + "]";
	}
	
	
}
