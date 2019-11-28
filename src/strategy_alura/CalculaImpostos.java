package strategy_alura;

public class CalculaImpostos {
	
	public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcular(orcamento);
		System.out.println(imposto);
	}
	
}
