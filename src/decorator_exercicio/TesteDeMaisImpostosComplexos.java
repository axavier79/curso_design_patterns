package decorator_exercicio;

import chain_of_responsibility_alura.Item;
import decorator_alura.Imposto;
import strategy_alura.Orcamento;

public class TesteDeMaisImpostosComplexos {
	
	public static void main(String[] args) {
		TesteDeMaisImpostosComplexos testeDeMaisImpostosComplexos = new TesteDeMaisImpostosComplexos();
		testeDeMaisImpostosComplexos.executarTesteDeMaisImpososComplexos();
	}

	public void executarTesteDeMaisImpososComplexos() {

		Imposto ikcp = new IKCP(new IHIT());
		Imposto ima = new IMA(new IKCP());

		Orcamento orcamento = new Orcamento(501.0);
		Item item1 = new Item("caneta", 402.0);
		Item item2 = new Item("lapis", 99.0);
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);

		double valorIKCP = ikcp.calcular(orcamento);
		System.out.println("IKCP + IHIT = " + valorIKCP);

		double valorIMA = ima.calcular(orcamento);
		System.out.println("IMA + IKCP = " + valorIMA);
	}

}
