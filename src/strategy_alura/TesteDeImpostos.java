/*
 * Quando utilizamos uma hierarquia, como fizemos com a 
 * interface Imposto e as implementações ICMS e ISS, e 
 * recebemos o tipo mais genérico como parâmetro, para 
 * ganharmos o polimorfismo na regra que será executada, 
 * simplificando o código e sua evolução, estamos usando 
 * o Design Pattern chamado Strategy.
 * 
 * O Design Pattern STRATEGY serve para possibilitar a flexibilização de um algoritmo, trocando partes do mesmo.
 * */

package strategy_alura;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		TesteDeImpostos testeDeImpostos = new TesteDeImpostos();
		testeDeImpostos.executarTesteDeImpostos();
	}

	public void executarTesteDeImpostos() {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto icpp = new ICPP();

		Orcamento orcamento = new Orcamento(3001);

		CalculaImpostos calculador  = new CalculaImpostos();

		System.out.println("Valor ISS: ");
		calculador.realizarCalculo(orcamento, iss);
		System.out.println("Valor ICMS: ");
		calculador.realizarCalculo(orcamento, icms);
		System.out.println("Valor ICPP: ");
		calculador.realizarCalculo(orcamento, icpp);
	}

}
