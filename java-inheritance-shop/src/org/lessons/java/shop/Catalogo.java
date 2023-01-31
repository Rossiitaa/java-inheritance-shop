package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Prodotto[] catalogo = new Prodotto[1];

		for (int i = 0; i < catalogo.length; i++) {
			System.out.println("digitare tipo prodotto: ");
			String categoria = s.next().toLowerCase();

			System.out.println("digitare codice prodotto: ");
			int codice = s.nextInt();

			System.out.println("digitare nome prodotto: ");
			String nome = s.next();

			System.out.println("digitare marca prodotto: ");
			String marca = s.next();

			System.out.println("digitare prezzo prodotto: ");
			double prezzo = s.nextDouble();

			System.out.println("digitare iva prodotto: ");
			int iva = s.nextInt();

			if (categoria.equals("smartphone")) {

				System.out.println("digitare codice imei prodotto: ");
				String codiceImei = s.next();

				System.out.println("digitare memoria prodotto: ");
				int memoria = s.nextInt();

				catalogo[i] = new Smartphone(codice, nome, marca, prezzo, iva, codiceImei, memoria);
			} else if (categoria.equals("tv")) {

				System.out.println("digitare pollici prodotto: ");
				int dimensioniTv = s.nextInt();

				System.out.println("indicare se il prodotto è smart: ");
				boolean smart = s.nextBoolean();

				catalogo[i] = new Televisore(codice, nome, marca, prezzo, iva, dimensioniTv, smart);
			} else if (categoria.equals("cuffie")) {

				System.out.println("digitare colore prodotto: ");
				String colore = s.next();

				System.out.println("indicare se il prodotto è wireless: ");
				boolean wireless = s.nextBoolean();

				catalogo[i] = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);
			}

		}

		s.close();

		System.out.println("Catalogo: ");
		for (int i = 0; i < catalogo.length; i++) {
			System.out.println(catalogo[i]);
			System.out.println("---");
		}
	}
}
