package decorator_exercicio;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class FiltroMenosDe100Reais extends Filtro{
	
	public FiltroMenosDe100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroMenosDe100Reais() {
		super();
	}

	@Override
	public List<ContaBancaria> filtrar(List<ContaBancaria> contas) {
		List<ContaBancaria> novaLista = new ArrayList<ContaBancaria>();
		
		for (ContaBancaria contaBancaria : contas) {
			if(contaBancaria.getSaldo() < 100.0) {
				novaLista.add(contaBancaria);
			}
		}
		
		novaLista.addAll(usarOutroFiltro(contas));
		
		return novaLista;
	}

}
