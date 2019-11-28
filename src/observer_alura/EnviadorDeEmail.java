package observer_alura;

import builder_alura.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	
	public void executar (NotaFiscal nf) {
		System.out.println("E-mail enviado.");
	}

}
