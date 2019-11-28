package strategy_exercicio;

public class TipoConservador implements Investimento{

	@Override
	public double calcularInvestimento(double saldo) {
		
		return saldo * 0.08;
		
	}

	

}
