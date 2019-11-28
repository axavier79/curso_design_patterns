/*
 * Quando compomos comportamento, atrav�s de classes que 
 * recebem objetos do mesmo tipo que elas mesmas (nesse 
 * caso, ISS que � um Imposto, recebe em seu construtor 
 * outro Imposto) para fazerem parte de seu comportamento, 
 * de uma maneira que seu uso � definido a partir do que se 
 * passou para a instancia��o dos objetos, � o que caracteriza 
 * o Design Pattern chamado Decorator.
 * 
 * O Design Pattern DECORATOR serve para implementar a��es
 * onde uma Classe recebe objetos do mesmo tipo dela.
 * */

package decorator_alura;

import strategy_alura.Orcamento;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		TesteDeImpostosComplexos testeDeImpostosComplexos = new TesteDeImpostosComplexos();
		testeDeImpostosComplexos.executarTesteDeImpososComplexos();
	}
	
	public void executarTesteDeImpososComplexos() {
		Imposto iss = new ISS(new ICMS(new ICPP()));

		Orcamento orcamento = new Orcamento(500.0);

		double valor = iss.calcular(orcamento);

		System.out.println(valor);
	}
}
