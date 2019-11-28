package chain_of_responsibility_exercicio;

public class RespostaVAZIA implements Resposta{

	Resposta proximaResposta;

	@Override
	public void responder(Requisicao requisicao, ContaBancaria conta) {
		System.out.println("Sem Formato escolhido.");
	}

	@Override
	public void setProximaResposta(Resposta proximaResposta) {
		//SEM PRÓXIMA RESPOSTA - FINAL DO CHAIN OF RESPONSIBILITY
	}

}
