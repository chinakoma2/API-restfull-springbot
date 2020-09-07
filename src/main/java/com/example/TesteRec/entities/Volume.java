package com.example.TesteRec.entities;

public class Volume {
	private int mois;
	private int valeur;
	
	public Volume(int mois, int valeur) {
		super();
		this.mois = mois;
		this.valeur = valeur;
	}
	
	public Volume() {
		super();
	}



	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
}
