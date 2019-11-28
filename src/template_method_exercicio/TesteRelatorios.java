package template_method_exercicio;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class TesteRelatorios {
	
	public static void main(String[] args) {
		TesteRelatorios testeRelatorios = new TesteRelatorios();
		testeRelatorios.executarTesteRelatorios();
	}

	public void executarTesteRelatorios() {
		List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

		ContaBancaria conta001 = new ContaBancaria("001", "Anderson Xavier", 500, "24/04/2000");
		ContaBancaria conta002 = new ContaBancaria("002", "Luciana Paula", 1000, "24/04/2000");
		ContaBancaria conta003 = new ContaBancaria("003", "Alice Xavier", 1500, "29/12/2017");

		contas.add(conta001);
		contas.add(conta002);
		contas.add(conta003);

		DadosBanco banco = new DadosBanco("Banco01", "001", "Rua 1, Nº 0", "11 4444-5555", "banco@banco.com.br",
				contas);

		System.out.println("----------");
		System.out.println("Relatório Simples:\n");
		RelatorioSimples relSimples = new RelatorioSimples();
		relSimples.imprimirRelatorio(banco);

		System.out.println("\n----------");
		System.out.println("Relatório Complexo:\n");
		RelatorioComplexo relComplexo = new RelatorioComplexo();
		relComplexo.imprimirRelatorio(banco);
	}

}
