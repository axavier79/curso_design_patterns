package observer_exercicio;

import java.util.ArrayList;
import java.util.List;

import builder_alura.ItemDaNota;
import builder_alura.NotaFiscal;
import builder_alura.NotaFiscalBuilder;
import observer_alura.AcaoAposGerarNota;
import observer_alura.EnviadorDeEmail;
import observer_alura.EnviadorDeSMS;
import observer_alura.Impressora;
import observer_alura.NotaFiscalDAO;

public class TesteDoMultiplicador {

	public static void main(String[] args) {
		TesteDoMultiplicador testeDoMultiplicador = new TesteDoMultiplicador();
		testeDoMultiplicador.executarTesteDoMultiplicador();
	}

	public void executarTesteDoMultiplicador() {
//		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder();
//		nfBuilder.adicionarAcao(new EnviadorDeEmail());
//		nfBuilder.adicionarAcao(new NotaFiscalDAO());
//		nfBuilder.adicionarAcao(new EnviadorDeSMS());
//		nfBuilder.adicionarAcao(new Impressora());
//		nfBuilder.adicionarAcao(new Multiplicador(2.5));
//		nfBuilder.adicionarAcao(new Multiplicador(1.7));
		
		List<AcaoAposGerarNota> listaDeAcoes = new ArrayList<AcaoAposGerarNota>();
		listaDeAcoes.add(new EnviadorDeEmail());
		listaDeAcoes.add(new NotaFiscalDAO());
		listaDeAcoes.add(new EnviadorDeSMS());
		listaDeAcoes.add(new Impressora());
		listaDeAcoes.add(new Multiplicador(2.5));
		listaDeAcoes.add(new Multiplicador(1.7));
		
		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder(listaDeAcoes);
		
		NotaFiscal nf = nfBuilder.paraEmpresa("Teste").comCNPJ("123.456.789/0001-23")
				.comItem(new ItemDaNota("item 1", 100.0)).comItem(new ItemDaNota("item 2", 222.0))
				.comObservacoes("observacao").naDataAtual().construir();

	}

}
