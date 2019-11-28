/*
 * Esses descontos formam como se fosse uma "corrente", ou seja, 
 * um ligado ao outro. Da� o nome do padr�o de projeto: Chain of 
 * Responsibility. A ideia do padr�o � resolver problemas como esses: 
 * de acordo com o cen�rio, devemos realizar alguma a��o. Ao inv�s de 
 * escrevermos c�digo procedural, e deixarmos um �nico m�todo descobrir 
 * o que deve ser feito, quebramos essas responsabilidades em v�rias 
 * diferentes classes, e as unimos como uma corrente.
 * 
 * O Deseign Pattern CHAIN OF RESPONSIBILITY serve para criarmos uma
 * "corrente" com v�rias a��es a serem realizadas e, assim que uma
 * delas � executada, as outras n�o ser�o mais executadas.
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
