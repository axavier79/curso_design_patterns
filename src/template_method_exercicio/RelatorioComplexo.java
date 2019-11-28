package template_method_exercicio;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class RelatorioComplexo extends TemplateDeRelatorio {

	@Override
	protected void cabecalho(DadosBanco dadosBanco) {
		System.out.println("Nome Banco: " + dadosBanco.getNomeBanco());
		System.out.println("Endereço Banco: " + dadosBanco.getEnderecoBanco());
		System.out.println("Telefone Banco: " + dadosBanco.getTelefoneBanco() + "\n");
	}

	@Override
	protected void rodape(DadosBanco dadosBanco) {
		Date data = new Date();
		System.out.println("E-mail Banco: " + dadosBanco.getEmailBanco());
		System.out.println("Data: " + data + "\n");
	}

	@Override
	protected void corpo(DadosBanco dadosBanco) {
		int num = 1;
		for (ContaBancaria conta : dadosBanco.getContas()) {
			System.out.println("Índice: " + num++);
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Agência: " + dadosBanco.getAgencia());
			System.out.println("Conta: " + conta.getNumeroConta());
			System.out.println("Saldo: " + conta.getSaldo() + "\n");
		}
	}

}
