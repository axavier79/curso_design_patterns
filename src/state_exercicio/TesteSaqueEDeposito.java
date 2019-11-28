package state_exercicio;

import chain_of_responsibility_exercicio.ContaBancaria;

public class TesteSaqueEDeposito {
	
	public static void main(String[] args) {
		TesteSaqueEDeposito testeSaqueEDeposito = new TesteSaqueEDeposito();
		testeSaqueEDeposito.executarTesteSaqueEDeposito();
	}

	public void executarTesteSaqueEDeposito() {
		ContaBancaria conta = new ContaBancaria("001", "Anderson Xavier", 100.0, "19/11/2019");

		try {
			conta.sacar(150.0);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());

		try {
			conta.sacar(50.0);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());

		try {
			conta.depositar(100.0);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());

		try {
			conta.depositar(100.0);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
	}

}
