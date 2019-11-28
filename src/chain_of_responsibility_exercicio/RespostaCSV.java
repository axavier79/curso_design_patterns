package chain_of_responsibility_exercicio;

public class RespostaCSV implements Resposta {

	Resposta proximaResposta;

	@Override
	public void responder(Requisicao requisicao, ContaBancaria conta) {
		if (requisicao.getFormato().equals(Formato.CSV)) {
			System.out.println("Escolhido Formato CSV:");
			System.out.println("Titular,Saldo");
			System.out.println(conta.getTitular()+","+conta.getSaldo() + "\n");
		} else {
			proximaResposta.responder(requisicao, conta);			
		}

	}

	@Override
	public void setProximaResposta(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}

}
