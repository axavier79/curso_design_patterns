package builder_exercicio;

import builder_alura.ItemDaNota;

public class ItemDaNotaBuilder {

	private String nomeItem;
	private double valorItem;

	public ItemDaNotaBuilder comNome (String nomeItem) {
		this.nomeItem = nomeItem;
		
		return this;
	}
	
	public ItemDaNotaBuilder comValor (double valorItem) {
		this.valorItem = valorItem;
		
		return this;
	}
	
	public ItemDaNota construir() {
		return new ItemDaNota(nomeItem, valorItem);
	}
}
