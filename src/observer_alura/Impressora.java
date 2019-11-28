package observer_alura;

import builder_alura.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{
	
	public void executar (NotaFiscal nf) {
		System.out.println("NF impressa.");
	}

}
