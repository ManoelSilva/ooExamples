package br.com.polimorfismo;

public class Ave {

	private String tipo;
	private String corDaPelagem;
	private String tipoDeVoo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCorDaPelagem() {
		return corDaPelagem;
	}

	public void setCorDaPelagem(String corPelagem) {
		this.corDaPelagem = corPelagem;
	}

	public void setTipoDeVoo(String tipoDeVoo) {
		this.tipoDeVoo = tipoDeVoo;
	}

	public String voar() {
		return "Ave do tipo ' " + this.getTipo() + " ' da pelagem de cor " + this.getCorDaPelagem() + " realizando um "
				+ this.tipoDeVoo;
	}
}
