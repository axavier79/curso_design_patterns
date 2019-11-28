package chain_of_responsibility_exercicio;

public interface Resposta {
	void responder(Requisicao reqisicao, ContaBancaria conta);

	void setProximaResposta(Resposta proximaResposta);
}
