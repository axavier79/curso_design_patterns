package strategy_exercicio;

public class RealizaInvestimentos {

	public void realizarInvestimento(double saldoAtual, Investimento tipoInvestimento) {

		double investimento = tipoInvestimento.calcularInvestimento(saldoAtual);
		
		System.out.println("Retorno Investimento = " + investimento);
		
		double porcentagemInvestimento = investimento * 0.75;
		System.out.println("75% do Retorno = " + porcentagemInvestimento);
		
		System.out.println("Saldo atualizado = " + (saldoAtual + porcentagemInvestimento) + "\n");
	}
}
