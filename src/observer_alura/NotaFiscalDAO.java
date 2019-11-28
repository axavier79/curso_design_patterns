package observer_alura;

import builder_alura.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota{
	
	public void executar (NotaFiscal nf) {
		System.out.println("NF salva no BD.");
	}

}
