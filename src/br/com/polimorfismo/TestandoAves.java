package br.com.polimorfismo;


public class TestandoAves {

	public static void main(String[] args) {

		Ave beijaFlor = new Ave("Beija-Flor-de-Peito-Azul", new VooBatido("vôo que as asas não param de bater!"));
		Ave picaPau = new Ave("Pica-Pau-de-Testa-Amarela",
				new VooBatidoComPlaneio("vôo alternando o batimento das asas para ganhar altitude com o planeio!"));
		Ave pato = new Ave("Pato-Real", new VooMigratorio("vôo de migração de territórios longo e duradouro!"));
		Ave urubu = new Ave("Urubu", new VooPlanadoTermico(
				"vôo que usa as correntes térmicas ascendentes para subir. Deixa asas abertas. Faz manobras para não sair da bolha de ar quente!"));

		System.out.println(beijaFlor.voar());
		System.out.println(picaPau.voar());
		System.out.println(pato.voar());
		System.out.println(urubu.voar());

	}
}
