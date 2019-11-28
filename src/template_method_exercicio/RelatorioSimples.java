package template_method_exercicio;

import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class RelatorioSimples extends TemplateDeRelatorio {

	@Override
	protected void cabecalho(DadosBanco dadosBanco) {
		System.out.println("Nome Banco: " + dadosBanco.getNomeBanco() + "\n");
	}

	@Override
	protected void rodape(DadosBanco dadosBanco) {
		System.out.println("Tel. Banco: " + dadosBanco.getTelefoneBanco() + "\n");
	}

	@Override
	protected void corpo(DadosBanco dadosBanco) {
		int num = 1;
		for (ContaBancaria conta : dadosBanco.getContas()) {
			System.out.println("Índice: " + num++);
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Saldo: " + conta.getSaldo() + "\n");
		}
	}

}
