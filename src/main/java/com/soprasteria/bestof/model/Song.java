package com.soprasteria.bestof.model;

import java.util.Date;

public class Song {
	private String titolo;
	private Date anno;
	private String genere;
	private String autore;
	private String performer;
	
	public Song() {
		titolo = "Marco";
		anno = new Date(2022,12,12);
		genere = "pop";
		autore = "BTS";
		performer = "BTS";
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
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getPerformer() {
		return performer;
	}
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	

}
