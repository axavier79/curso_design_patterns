package strategy_exercicio;

public class TesteDeInvestimento {
	
	public static void main(String[] args) {
		TesteDeInvestimento testeDeInvestimentos = new TesteDeInvestimento();
		testeDeInvestimentos.executarTesteDeInvestimento();
	}

	public void executarTesteDeInvestimento() {

		ContaBancaria conta1 = new ContaBancaria(1000);

		TipoConservador conservador = new TipoConservador();
		TipoModerado moderado = new TipoModerado();
		TipoArrojado arrojado = new TipoArrojado();

		RealizaInvestimentos investir = new RealizaInvestimentos();

		System.out.println("Conservador");
		investir.realizarInvestimento(conta1.getSaldo(), conservador);

		System.out.println("Moderado");
		investir.realizarInvestimento(conta1.getSaldo(), moderado);

		System.out.println("Arrojado");
		investir.realizarInvestimento(conta1.getSaldo(), arrojado);

	}
}
