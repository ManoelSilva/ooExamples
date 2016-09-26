package br.com.conta;

public class Conta {

	String numero;
	String titular;
	double saldo;
	String[] logOperacoes = new String[10];

	public Conta(String titular, String numero) {

		this.titular = titular;
		this.numero = numero;
	}

	public void registrarOperacao(String operacao) {
		if (logOperacoes[0] == null) {
			logOperacoes[0] = operacao;
		} else {
			for (int i = 1; i < logOperacoes.length; i++) {
				if (logOperacoes[i] == null) {
					logOperacoes[i] = operacao;
					i = logOperacoes.length;
				}
			}
		}
	}

	public void sacar(double valor) {
		if (saldo != 0 && saldo >= valor) {
			saldo = saldo - valor;
			registrarOperacao("Operação de Saque. Valor: " + valor);
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Impossível sacar!");
		}
	}

	public void depositar(double valor) {
		if(valor>0){
			saldo = saldo + valor;
			System.out.println("Deposito efetuado com sucesso!");
			registrarOperacao("Operação de Depósito. Valor: " + valor);
		}
		else{
			System.out.println("Valor inválido!");
		}
	}

	public void visualizarSaldo() {
		System.out.println("Seu saldo é: " + saldo);
	}

	public void visualizarExtrato() {
		for (int i = 0; i < logOperacoes.length; i++) {

			System.out.println("Operação " + i + " - " + logOperacoes[i]);
		}

	}
}
