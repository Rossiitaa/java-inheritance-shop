package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto pr1 = new Prodotto(1, "Ferro da stiro", "Bosch", 50, 20);
		System.out.println(pr1);
		System.out.println("-----------------");

		Smartphone sp1 = new Smartphone(2, "Pixel 7", "Google", 550, 19, "358793373841551", 128);
		System.out.println(sp1);
		System.out.println("-----------------");

		Televisore tv1 = new Televisore(3, "Odyssey Nero G9", "Samsung", 1500, 22, 49, false);
		System.out.println(tv1);
		System.out.println("-----------------");

		Cuffie cf1 = new Cuffie(4, "Studio Buds", "Beats", 155, 18, "black", true);
		System.out.println(cf1);
	}
}
