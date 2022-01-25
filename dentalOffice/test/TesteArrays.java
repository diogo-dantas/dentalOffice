package br.com.dentalOffice.test;

import br.com.dentalOffice.model.Atendimento;
import br.com.dentalOffice.model.Dentista;
import br.com.dentalOffice.model.Particular;
import br.com.dentalOffice.model.Conveniado;

public class TesteArrays {

	public static void main(String[] args) {

		// FORMA CLÁSSICA - array instanciada pela classe acima da hierarquia
		// type cast explícito utilizado

		Object[] dia010121 = new Object[3];

		Dentista alvaro = new Dentista(1111, "Alvaro Menezes", "111.111.111-11");
		Particular sergio = new Particular(1, "Sergio Ribeiro", "255.432.359-25");
		Atendimento consulta01 = new Atendimento(1, alvaro, sergio, 500.0);
		consulta01.setDescricao("Canal");

		dia010121[0] = consulta01;

		Atendimento ref = (Atendimento) dia010121[0];

		System.out.println("O primeiro tratamento do dia foi um " + ref.getDescricao() + "\n");

		Particular patrick = new Particular(2, "Patrick Ribeiro", "240.652.489-05");
		Atendimento consulta02 = new Atendimento(2, alvaro, patrick, 50.0);
		consulta02.setDescricao("Avaliação inicial");

		dia010121[1] = consulta02;

		Dentista pietro = new Dentista(2222, "Pietro Alencar", "222.222.222-22");
		Conveniado otavio = new Conveniado(3, "Otavio Estrela", "322.546.652-33");
		Atendimento consulta03 = new Atendimento(3, pietro, otavio, 150.0);
		consulta03.setDescricao("Limpeza");

		dia010121[2] = consulta03;

		System.out.println(
				"A quantidade de atendimento no dia 01/01/2021 foi de " + dia010121.length + " atendimentos.\n");

		for (int i = 0; i < dia010121.length; i++) {

			System.out.println("O doutor " + ((Atendimento) dia010121[i]).getDentista() + ", atendeu o paciente "
					+ ((Atendimento) dia010121[i]).getCliente() + " e realizou o seguinte tratamento:\n"
					+ ((Atendimento) dia010121[i]).getDescricao() + "\n");

		}

		// FORMA LITERAL - sem type cast

		Atendimento[] dia020121 = { consulta01, consulta02, consulta03 };

		for (int i = 0; i < dia020121.length; i++) {

			System.out.println("Consulta " + (i + 1) + "\nValor Recebido: " + dia020121[i].getValor());

		}
	}
}
