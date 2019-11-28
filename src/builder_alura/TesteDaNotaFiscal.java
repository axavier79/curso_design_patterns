/*
 * Utilizando interfaces fluentes com method chain.
 * 
 * O Builder possibilita a separação da complexidade da criação de objetos 
 * em uma classe específica para isso, além de possibilitar a implementação 
 * de atributos opcionais mais facilmente.
 * 
 * O Design Pattern BUILDER serve para criar objetos complexos.
 * */

package builder_alura;

public class TesteDaNotaFiscal {
	
	public static void main(String[] args) {
		TesteDaNotaFiscal testeDaNotaFiscal = new TesteDaNotaFiscal();
		testeDaNotaFiscal.executarTesteDaNotaFiscal();
	}

	public void executarTesteDaNotaFiscal() {
		
//		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder();
		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder(null);
		nfBuilder.paraEmpresa("Empresa Teste")
			.comCNPJ("123.456.789/0001-23")
			.comItem(new ItemDaNota("item 1", 200.0))
			.comItem(new ItemDaNota("item 2", 300.0))
			.comItem(new ItemDaNota("item 3", 400.0))
			.comObservacoes("observacoes")
			.naDataAtual();
		
		NotaFiscal nf = nfBuilder.construir();
		System.out.println(nf.getValorBrtuto());
	}
}
