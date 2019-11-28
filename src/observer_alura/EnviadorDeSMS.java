package observer_alura;

import builder_alura.NotaFiscal;

public class EnviadorDeSMS implements AcaoAposGerarNota{
	
	public void executar (NotaFiscal nf) {
		System.out.println("SMS enviado.");
	}

}
