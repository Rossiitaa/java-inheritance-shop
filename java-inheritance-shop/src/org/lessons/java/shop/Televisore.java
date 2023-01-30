package org.lessons.java.shop;

public class Televisore extends Prodotto {
	private int dimensioniTv;
	private boolean smart;

	Televisore(int codice, String nome, String marca, double prezzo, int iva, int dimensioniTv, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioniTv = dimensioniTv;
		this.smart = smart;
	}

	public int getDimensioniTv() {
		return dimensioniTv;
	}

	public void setDimensioniTv(int dimensionsioniTv) {
		this.dimensioniTv = dimensionsioniTv;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDimensioni schermo: " + getDimensioniTv() + "''\nsmart tv: " + isSmart();
	}
}
