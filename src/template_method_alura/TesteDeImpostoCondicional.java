/*
 * Veja que ambas as classes de impostos só implementam as 
 * partes "que faltam" do algoritmo! A classe TemplateDeImpostoCondicional 
 * possui um método que funciona como um template, ou seja, um molde,
 * para as classes filhas. Daí o nome do padrão de projeto: 
 * Template Method.
 * 
 * O Design Pattern TEMPLATE serve para se criar a "estrutura" da Classe
 * e esta seja reutilizada nas implementações específicas de outras Classes.
 * */

package template_method_alura;

import chain_of_responsibility_alura.Item;
import strategy_alura.CalculaImpostos;
import strategy_alura.Imposto;
import strategy_alura.Orcamento;

public class TesteDeImpostoCondicional {
	
	public static void main(String[] args) {
		TesteDeImpostoCondicional testeDeImpostoCondicional = new TesteDeImpostoCondicional();
		testeDeImpostoCondicional.executarTesteDeImpostoCondicional();
	}

	public void executarTesteDeImpostoCondicional() {
		Imposto icpp = new ICPP();
		Imposto ikcp = new IKCP();
		Imposto ihit = new IHIT();

		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("CANETA", 200));
		orcamento.adicionaItem(new Item("LAPIS", 200));
		orcamento.adicionaItem(new Item("CANETA", 200));

		CalculaImpostos calcula = new CalculaImpostos();
		calcula.realizarCalculo(orcamento, icpp);
		calcula.realizarCalculo(orcamento, ikcp);
		calcula.realizarCalculo(orcamento, ihit);
	}
}
