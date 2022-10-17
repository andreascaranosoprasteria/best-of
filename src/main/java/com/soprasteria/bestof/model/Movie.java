package com.soprasteria.bestof.model;

import java.util.ArrayList;
import java.util.Date;


public class Movie {

	private String titolo;
	private Date anno;
	private String regista;
	private ArrayList<String>cast = new ArrayList<String>();
	
	public Movie() {
		titolo = "The rise of Gru";
		anno = new Date(2022,12,12);
		regista = "Totti";
		cast.add("Gorini");
		cast.add("Scarano");
		cast.add("Mauro");
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getAnno() {
		return anno;
	}

	public void setAnno(Date anno) {
		this.anno = anno;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public ArrayList<String> getCast() {
		return cast;
	}

	public void setCast(ArrayList<String> cast) {
		this.cast = cast;
	}
}
