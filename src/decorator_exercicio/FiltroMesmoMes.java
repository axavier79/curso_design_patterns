package decorator_exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMesmoMes() {
		super();
	}

	@Override
	public List<ContaBancaria> filtrar(List<ContaBancaria> contas) {
		List<ContaBancaria> novaLista = new ArrayList<ContaBancaria>();

		for (ContaBancaria contaBancaria : contas) {
			Calendar cal = Calendar.getInstance();
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				cal.setTime(sdf.parse(contaBancaria.getMesAberturaDaConta()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			if (cal.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
					&& cal.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				novaLista.add(contaBancaria);
			}
		}

		novaLista.addAll(usarOutroFiltro(contas));

		return novaLista;
	}

}
