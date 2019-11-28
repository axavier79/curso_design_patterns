package template_method_exercicio;

public abstract class TemplateDeRelatorio {

	protected abstract void cabecalho(DadosBanco dadosBanco);

	protected abstract void rodape(DadosBanco dadosBanco);

	protected abstract void corpo(DadosBanco dadosBanco);

	public void imprimirRelatorio(DadosBanco dadosBanco) {
		cabecalho(dadosBanco);
		corpo(dadosBanco);
		rodape(dadosBanco);
	}

}
