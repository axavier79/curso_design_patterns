/*
 * A principal situação que faz emergir o Design Pattern State é a 
 * necessidade de implementação de uma máquina de estados. Geralmente, 
 * o controle das possíveis transições são vários e complexos, fazendo 
 * com que a implementação não seja simples. O State auxilia a manter o 
 * controle dos estados simples e organizados através da criação de 
 * classes que representem cada estado e saiba controlar as transições.
 * 
 * O Design Pattern STATE serve para gerenciar estados de um objeto.
 * */

package state_alura;

import strategy_alura.Orcamento;

public class TesteDoDescontoExtra {
	
	public static void main(String[] args) {
		TesteDoDescontoExtra testeDoDescontoExtra = new TesteDoDescontoExtra();
		testeDoDescontoExtra.executarTesteDoDescontoExtra();
	}
	
	public void executarTesteDoDescontoExtra() {
		Orcamento reforma = new Orcamento(500.0);

		reforma.aplicarDescontoExtra();
		System.out.println("Desconto 1 = " + reforma.getValor());
		try {
			reforma.aplicarDescontoExtra();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		reforma.aprovar();
		System.out.println("\n");
		reforma.aplicarDescontoExtra();
		System.out.println("Desconto de Aprovado = " + reforma.getValor());
		try {
			reforma.aplicarDescontoExtra();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		reforma.finalizar();
		System.out.println("\n");
		reforma.aplicarDescontoExtra();
		System.out.println("Desconto de Finalizado = " + reforma.getValor());
	}
}
