package chain_of_responsibility_exercicio;

public class RespostaXML implements Resposta{

	Resposta proximaResposta;

	@Override
	public void responder(Requisicao requisicao, ContaBancaria conta) {
		if (requisicao.getFormato().equals(Formato.XML)) {
			System.out.println("Escolhido Formato XML:");
			System.out.println("<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>" + "\n");
		} else {
			proximaResposta.responder(requisicao, conta);			
		}

	}

	@Override
	public void setProximaResposta(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}

}
