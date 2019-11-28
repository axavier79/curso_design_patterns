package chain_of_responsibility_exercicio;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		TesteContaBancaria testeContaBancaria = new TesteContaBancaria();
		testeContaBancaria.executarTesteContaBancaria();
	}

	public void executarTesteContaBancaria() {

		CorrenteDeRespostas corrente = new CorrenteDeRespostas();

		Requisicao requisicao1 = new Requisicao(Formato.CSV);
		ContaBancaria conta1 = new ContaBancaria("001", "Anderson Xavier", 500.0, "24/04/2000");

		Requisicao requisicao2 = new Requisicao(Formato.XML);
		ContaBancaria conta2 = new ContaBancaria("002", "Luciana Paula", 600.0, "24/04/2000");

		Requisicao requisicao3 = new Requisicao(Formato.PORCENTO);
		ContaBancaria conta3 = new ContaBancaria("003", "Alice Xavier", 700.0, "29/12/2017");

		Requisicao requisicao4 = new Requisicao(Formato.PORCENTO);
		ContaBancaria conta4 = new ContaBancaria("004", "Matheus Tadeu", 700000.0, "12/10/2019");

		Requisicao requisicao5 = new Requisicao(Formato.PORCENTO);
		ContaBancaria conta5 = new ContaBancaria("005", "Nathalia Cristina", 700.0, "12/11/2019");

		Requisicao requisicao6 = new Requisicao(Formato.VAZIO);
		ContaBancaria conta6 = new ContaBancaria("000", "Qualquer", 1.0, "1/1/2001");

		corrente.responder(requisicao1, conta1);
		corrente.responder(requisicao2, conta2);
		corrente.responder(requisicao3, conta3);
		corrente.responder(requisicao4, conta4);
		corrente.responder(requisicao4, conta5);
		corrente.responder(requisicao4, conta6);
	}

}
