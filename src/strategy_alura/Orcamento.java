package strategy_alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chain_of_responsibility_alura.Item;
import state_alura.Aprovado;
import state_alura.EmAprovacao;
import state_alura.EstadoDeUmOrcamento;

public class Orcamento {

	private double valor;
	private final List<Item> itens;
	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean contemItemDeNome(String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public void aplicarDescontoExtra() {
		estadoAtual.aplicarDescontoExtra(this);
	}
	
	public void aprovar() {
		estadoAtual.aprovar(this);
	}

	public void reprovar() {
		estadoAtual.reprovar(this);
	}
	
	public void finalizar() {
		estadoAtual.finalizar(this);
	}
}
