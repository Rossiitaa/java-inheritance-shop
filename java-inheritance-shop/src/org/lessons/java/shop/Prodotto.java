package org.lessons.java.shop;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;

	public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {

		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getIvaPrezzo() {
		double ivaPrezzo = prezzo + (prezzo * iva / 100);
		return ivaPrezzo;
	}

	@Override
	public String toString() {
		return "codice: " + getCodice() + "\nnome: " + getNome() + "\nmarca: " + getMarca() + "\nprezzo: " + getPrezzo()
				+ "€ \niva: " + getIva() + "% \nprezzo con iva: " + getIvaPrezzo() + "€";
	}

}
