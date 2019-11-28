package chain_of_responsibility_exercicio;

public class CorrenteDeRespostas {

	public void responder(Requisicao requisicao, ContaBancaria conta) {

		Resposta respCSV = new RespostaCSV();
		Resposta respXML = new RespostaXML();
		Resposta respPORCENTO = new RespostaPORCENTO();
		Resposta respVAZIA = new RespostaVAZIA();
		
		respCSV.setProximaResposta(respXML);
		respXML.setProximaResposta(respPORCENTO);
		respPORCENTO.setProximaResposta(respVAZIA);

		respCSV.responder(requisicao, conta);
	}
}
