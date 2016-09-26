package br.com.conta;

public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1 = new Conta("123", "iago");
		Conta c2 = new ContaCorrente("456", "hiago", 500);
		Conta c3 = new ContaPoupanca("789", "iargo");
		
		c1.depositar(1000);
		c1.sacar(100);
		c1.sacar(50);
		//c1.visualizarSaldo();
		
		c2.depositar(400);
		c2.sacar(300);
		c2.sacar(100);
		c2.sacar(299);
		c2.visualizarExtrato();
	}
}
