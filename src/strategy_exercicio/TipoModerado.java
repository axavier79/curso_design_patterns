package strategy_exercicio;

public class TipoModerado implements Investimento {

	@Override
	public double calcularInvestimento(double saldo) {
		double escolhido = new java.util.Random().nextDouble();

		if (escolhido <= 0.20) {
			return saldo * 0.05;
		} else if (escolhido <= 0.30) {
			return saldo * 0.03;
		}else {
			return saldo * 0.006;
		}
		
	}

}
