package decorator_exercicio;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class FiltroMaisDe500MilReais extends Filtro{
	
	public FiltroMaisDe500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroMaisDe500MilReais() {
		super();
	}

	@Override
	public List<ContaBancaria> filtrar(List<ContaBancaria> contas) {
		List<ContaBancaria> novaLista = new ArrayList<ContaBancaria>();
		
		for (ContaBancaria contaBancaria : contas) {
			if(contaBancaria.getSaldo() > 500000.0) {
				novaLista.add(contaBancaria);
			}
		}
		
		novaLista.addAll(usarOutroFiltro(contas));
		
		return novaLista;
	}

}
