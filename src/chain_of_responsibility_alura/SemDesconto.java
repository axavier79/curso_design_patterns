package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double descontar(Orcamento orcamento) {
		System.out.println("Sem Desconto:");
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		// N�O TEM PR�XIMO, ESTE � O �LTIMO M�TODO
	}

}
