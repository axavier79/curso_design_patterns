package decorator_exercicio;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class TesteDeFiltro {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria("001", "Anderson Xavier", 500.0, "24/04/2000");
		ContaBancaria conta2 = new ContaBancaria("002", "Luciana Paula", 600.0, "24/04/2000");
		ContaBancaria conta3 = new ContaBancaria("003", "Alice Xavier", 700.0, "29/12/2017");
		ContaBancaria conta4 = new ContaBancaria("004", "Matheus Tadeu", 700000.0, "12/10/2019");
		ContaBancaria conta5 = new ContaBancaria("005", "Nathalia Cristina", 700.0, "12/11/2019");
		ContaBancaria conta6 = new ContaBancaria("000", "Qualquer", 1.0, "1/1/2001");

		List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		contas.add(conta5);
		contas.add(conta6);
		
		Filtro filtro = new FiltroMenosDe100Reais(new FiltroMaisDe500MilReais(new FiltroMesmoMes()));
		
		List<ContaBancaria> contasFiltradas = filtro.filtrar(contas);
		
		for (ContaBancaria contaBancaria : contasFiltradas) {
			System.out.println(contaBancaria.getTitular());
		}
	}
}
