package decorator_exercicio;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public abstract class Filtro {
	Filtro outroFiltro;

	public Filtro() {
		outroFiltro = null;
	}

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public abstract List<ContaBancaria> filtrar(List<ContaBancaria> contas);

	protected List<ContaBancaria> usarOutroFiltro(List<ContaBancaria> contas) {
		if (outroFiltro == null)
			return new ArrayList<ContaBancaria>();
		else
			return outroFiltro.filtrar(contas);
	}
}
