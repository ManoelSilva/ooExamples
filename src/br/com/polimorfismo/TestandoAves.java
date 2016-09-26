package br.com.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class TestandoAves {

	public static void main(String[] args) {

		System.out.println("Criando Collection do tipo Ave...");
		List<Ave> avesCollection = new ArrayList<>();
		System.out.println("Collection criada!");

		System.out.println("\nCriando aves de diferentes tipos...");
		BeijaFlor beijaFlor = new BeijaFlor("Beija-Flor-de-Peito-Azul", "Diferentes tons de azul", "Vôo Batido");
		Pato pato = new Pato("Pato-Real", "Pelagem da cabeça verde com dorso em diferentes tons de cinza",
				"Vôo Migratório");
		PicaPau picaPau = new PicaPau("Pica-Pau-de-Testa-Amarela", "Diferentes tons de azul com cabeça amarela",
				"Vôo Batido alterando com Planeio");
		Urubu urubu = new Urubu("Urubú-de-Cabeça-Preta", "Preta", "Vôo Planado Térmico");

		System.out.println("\nAdicionando diferentes tipos de aves na Collection do tipo Ave...");
		avesCollection.add(beijaFlor);
		avesCollection.add(pato);
		avesCollection.add(picaPau);
		avesCollection.add(urubu);

		System.out.println("\nFazendo uso do Polimorfismo...");
		for (int i = 0; i < avesCollection.size(); i++) {
			System.out.println(avesCollection.get(i).voar());
		}
	}

}
