/*
 * Esses descontos formam como se fosse uma "corrente", ou seja, 
 * um ligado ao outro. Daí o nome do padrão de projeto: Chain of 
 * Responsibility. A ideia do padrão é resolver problemas como esses: 
 * de acordo com o cenário, devemos realizar alguma ação. Ao invés de 
 * escrevermos código procedural, e deixarmos um único método descobrir 
 * o que deve ser feito, quebramos essas responsabilidades em várias 
 * diferentes classes, e as unimos como uma corrente.
 * 
 * O Deseign Pattern CHAIN OF RESPONSIBILITY serve para criarmos uma
 * "corrente" com várias ações a serem realizadas e, assim que uma
 * delas é executada, as outras não serão mais executadas.
 * */

package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		TesteDeDescontos testeDeDescontos = new TesteDeDescontos();
		testeDeDescontos.executarTesteDeDescontos();
	}

	public void executarTesteDeDescontos() {
		CorrenteDeDescontos descontos = new CorrenteDeDescontos();

		Orcamento orcamento = new Orcamento(400);
		orcamento.adicionaItem(new Item("CANETA", 200));
		orcamento.adicionaItem(new Item("LAPIS", 200));

		double descontoFinal;

		descontoFinal = descontos.calcular(orcamento);

		System.out.println(descontoFinal);
	}
}
