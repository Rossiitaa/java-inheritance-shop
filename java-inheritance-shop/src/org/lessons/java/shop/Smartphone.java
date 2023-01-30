package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	private String codiceImei;
	private int memoria;

	Smartphone(int codice, String nome, String marca, double prezzo, int iva, String codiceImei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}

	public String getCodiceImei() {
		return codiceImei;
	}

	public void setCodiceImei(String codiceImei) {
		this.codiceImei = codiceImei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCodice IMEI: " + getCodiceImei() + "\nmemoria: " + getMemoria() + " GB";
	}

}
