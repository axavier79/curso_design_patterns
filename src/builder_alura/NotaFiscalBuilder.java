/*
 * Aqui se aplica as interfaces fluentes, fazendo com que cada
 * método retorne a própria classe (return this). 
 * */
package builder_alura;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import observer_alura.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	// public NotaFiscalBuilder() {
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		this.data = Calendar.getInstance();
		// this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
		this.todasAcoesASeremExecutadas = acoes;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;

		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;

		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);

		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;

		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();

		return this;
	}

	public NotaFiscal construir() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executar(nf);
		}

		return nf;
	}

	public void naData(Calendar novaData) {
		this.data = novaData;
	}

	// public void adicionarAcao (AcaoAposGerarNota acao) {
	// this.todasAcoesASeremExecutadas.add(acao);
	// }

}
