package observer_exercicio;

import builder_alura.NotaFiscal;
import observer_alura.AcaoAposGerarNota;

public class Multiplicador implements AcaoAposGerarNota {

	private final double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executar(NotaFiscal nf) {
		System.out.println("Valor com Multiplicador (" + fator + ") = " + nf.getValorBrtuto() * this.fator);
	}
}
