package strategy_exercicio;

public class TipoArrojado implements Investimento {

	@Override
	public double calcularInvestimento(double saldo) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;

		if (escolhido) {
			return saldo * 0.07;
		} else {
			return saldo * 0.025;
		}
		
	}

}
