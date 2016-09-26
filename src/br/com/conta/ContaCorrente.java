package br.com.conta;

public class ContaCorrente extends Conta {

	double limiteChequeEspecial;

	public ContaCorrente(String titular, String numero, double limite) {
		super(titular, numero);
		this.limiteChequeEspecial = limite;

	}

	public void sacar(double valor) {
		if (valor <= limiteChequeEspecial) {
			super.sacar(valor);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

}
