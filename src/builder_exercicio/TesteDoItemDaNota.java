package builder_exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import builder_alura.ItemDaNota;
import builder_alura.NotaFiscal;
import builder_alura.NotaFiscalBuilder;

public class TesteDoItemDaNota {

	public static void main(String[] args) {
		TesteDoItemDaNota testeDoItemDaNota = new TesteDoItemDaNota();
		testeDoItemDaNota.executarTesteDoItemDaNota();
	}

	public void executarTesteDoItemDaNota() {
		
		Calendar data = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data.setTime(sdf.parse("24/04/1979"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		ItemDaNotaBuilder itemDaNotaBuilder = new ItemDaNotaBuilder();
		itemDaNotaBuilder.comNome("Item 1").comValor(225.0);

		ItemDaNota itemDaNota = itemDaNotaBuilder.construir();

		System.out.println("Nome do Item = " + itemDaNota.getNome());
		System.out.println("Valor do Item = " + itemDaNota.getValor());
		
		System.out.println("");
		
//		NotaFiscalBuilder nfBuilder1 = new NotaFiscalBuilder();
		NotaFiscalBuilder nfBuilder1 = new NotaFiscalBuilder(null);
		nfBuilder1.paraEmpresa("Empresa Teste")
			.comCNPJ("123.456.789/0001-23")
			.comItem(new ItemDaNota("item 1", 200.0))
			.comItem(new ItemDaNota("item 2", 300.0))
			.comItem(new ItemDaNota("item 3", 400.0))
			.comObservacoes("observacoes")
			.naData(data);
		
		NotaFiscal nf1 = nfBuilder1.construir();
		System.out.println("NF 1 - " 
				+ nf1.getDataEmissao().get(Calendar.DAY_OF_MONTH) + "/"
				+ (nf1.getDataEmissao().get(Calendar.MONTH) + 1) + "/"
				+ nf1.getDataEmissao().get(Calendar.YEAR));
		
//		NotaFiscalBuilder nfBuilder2 = new NotaFiscalBuilder();
		NotaFiscalBuilder nfBuilder2 = new NotaFiscalBuilder(null);
		nfBuilder2.paraEmpresa("Empresa Teste")
			.comCNPJ("123.456.789/0001-23")
			.comItem(new ItemDaNota("item 1", 200.0))
			.comItem(new ItemDaNota("item 2", 300.0))
			.comObservacoes("observacoes");
		
		NotaFiscal nf2 = nfBuilder2.construir();
		System.out.println("NF 2 - " 
				+ nf2.getDataEmissao().get(Calendar.DAY_OF_MONTH) + "/"
				+ (nf2.getDataEmissao().get(Calendar.MONTH) + 1) + "/"
				+ nf2.getDataEmissao().get(Calendar.YEAR));
	}

}
