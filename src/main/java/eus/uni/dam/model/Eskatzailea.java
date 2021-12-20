package eus.uni.dam.model;

import java.util.ArrayList;
import java.util.List;

public class Eskatzailea {

	String izena;
	List<Oparia> opariak;
	
	

	public Eskatzailea() {
		super();
	}
	public Eskatzailea(String izena, List<Oparia> opariak) {
		super();
		this.izena = izena;
		this.opariak = opariak;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public List<Oparia> getOpariak() {
		return opariak;
	}
	public void setOpariak(List<Oparia> opariak) {
		this.opariak = opariak;
	}
	@Override
	public String toString() {
		return "Eskatzailea [izena=" + izena + ", opariak=" + opariak + "]";
	}
	
	
}
