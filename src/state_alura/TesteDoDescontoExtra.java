/*
 * A principal situa��o que faz emergir o Design Pattern State � a 
 * necessidade de implementa��o de uma m�quina de estados. Geralmente, 
 * o controle das poss�veis transi��es s�o v�rios e complexos, fazendo 
 * com que a implementa��o n�o seja simples. O State auxilia a manter o 
 * controle dos estados simples e organizados atrav�s da cria��o de 
 * classes que representem cada estado e saiba controlar as transi��es.
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
