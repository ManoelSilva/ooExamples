package br.com.polimorfismo;

public class Ave {

	private String tipo;
	private Voo tipoDeVoo;

	public Ave(String tipo, Voo tipoDeVoo) {
		this.tipo = tipo;
		this.tipoDeVoo = tipoDeVoo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String voar() {
		return this.getTipo() + " voando um " + this.tipoDeVoo.getTipoDeVoo();
	}
}
