/*
 * Quando temos classes que serão notificadas sobre alguma 
 * coisa (no nosso caso, notificadas sobre a geração de uma 
 * nota fiscal) e um notificador que, assim que executa uma 
 * ação, notifica todos que estão na lista sobre o evento 
 * ocorrido, implementamos o padrão de projeto conhecido 
 * por Observer.
 * 
 * O Design Pattern OBSERVER serve para 
 * */

package observer_alura;

import java.util.ArrayList;
import java.util.List;

import builder_alura.ItemDaNota;
import builder_alura.NotaFiscal;
import builder_alura.NotaFiscalBuilder;

public class TesteDeAcoes {

	public static void main(String[] args) {
		TesteDeAcoes testeDeAcoes = new TesteDeAcoes();
		testeDeAcoes.executarTesteDeAcoes();
	}

	public void executarTesteDeAcoes() {
//		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder();
//		nfBuilder.adicionarAcao(new EnviadorDeEmail());
//		nfBuilder.adicionarAcao(new NotaFiscalDAO());
//		nfBuilder.adicionarAcao(new EnviadorDeSMS());
//		nfBuilder.adicionarAcao(new Impressora());

		List<AcaoAposGerarNota> listaDeAcoes = new ArrayList<AcaoAposGerarNota>();
		listaDeAcoes.add(new EnviadorDeEmail());
		listaDeAcoes.add(new NotaFiscalDAO());
		listaDeAcoes.add(new EnviadorDeSMS());
		listaDeAcoes.add(new Impressora());
		
		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder(listaDeAcoes);
		
		NotaFiscal nf = nfBuilder.paraEmpresa("Teste").comCNPJ("123.456.789/0001-23")
				.comItem(new ItemDaNota("item 1", 100.0)).comObservacoes("observacao").naDataAtual().construir();

		System.out.println("\nValor da nf = " + nf.getValorBrtuto());
	}

}
