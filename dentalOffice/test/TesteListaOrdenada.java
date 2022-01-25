package br.com.dentalOffice.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.dentalOffice.model.Atendimento;
import br.com.dentalOffice.model.Conveniado;
import br.com.dentalOffice.model.Dentista;

public class TesteListaOrdenada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dentista beatriz = new Dentista(1234, "Beatriz Fonseca", "123.456.789-00");
		Conveniado batista = new Conveniado(3333, "Claudio Batista Lovineo", "123.634.894-82");

		Atendimento consulta1 = new Atendimento(1, beatriz, batista, 200.0);
		consulta1.setDescricao("Limpeza");

		Dentista adrian = new Dentista(2222, "Adrian Morales", "555.555.555-55");
		Conveniado cleiton = new Conveniado(3, "Cleiton Aguiar", "333.333.333-33");
		Atendimento consulta2 = new Atendimento(2, adrian, cleiton, 50.0);
		consulta2.setDescricao("Avaliação Inicial");

		Dentista pietro = new Dentista(2222, "Pietro Alencar", "222.222.222-22");
		Conveniado otavio = new Conveniado(3, "Otavio Estrela", "322.546.652-33");
		Atendimento consulta3 = new Atendimento(3, pietro, otavio, 150.0);
		consulta3.setDescricao("Limpeza");

		List<Atendimento> dia240122 = new ArrayList<Atendimento>();

		dia240122.add(consulta3);
		dia240122.add(consulta1);
		dia240122.add(consulta2);

		System.out.println("-----Teste de Ordenação por Integer-----");

		Collections.sort(dia240122);

		for (Atendimento ref0 : dia240122) {
			ref0.consultaAtendimento();
		}

		System.out.println("\n-----Teste de Ordenação por String-----\n");

		List<Dentista> profissionais = new ArrayList<Dentista>();

		profissionais.add(pietro);
		profissionais.add(beatriz);
		profissionais.add(adrian);

//		Function object - Desconsiderada com a aplicação da expressão lambda abaixo.

//		package br.com.dentalOffice.test;
//
//		import java.util.Comparator;
//
//		import br.com.dentalOffice.model.Dentista;
//
//
//		public class ListaOrdemAlfabetica implements Comparator <Dentista> {
//
//			@Override
//			public int compare(Dentista d1, Dentista d2) {
//				String nomeD1 = d1.getNome();
//				String nomeD2 = d2.getNome();
//				return nomeD1.compareTo(nomeD2);
//			}
//			
//			
//
//		}

//		Expressões lambda

		profissionais.sort((d1, d2) -> {
			String nomeD1 = d1.getNome();
			String nomeD2 = d2.getNome();
			return nomeD1.compareTo(nomeD2);
		});

		profissionais.forEach((dentista) -> dentista.mostraDados());

		System.out.println("\n-----Teste de Ordenação (lista profissionais) por Integer ----\n");

		profissionais.sort((id1, id2) -> Integer.compare(id1.getId_dentista(), id2.getId_dentista()));

		// Pratica 1

//		for (int i = 0; i < profissionais.size(); i++) {
//			Dentista ref1 = profissionais.get(i);
//			ref1.mostraDados();
//		}

		// Pratica 2

//		for (Dentista dentista2 : profissionais) {
//			dentista2.mostraDados();
//		}

		// Pratica 3

		profissionais.forEach((dentista) -> dentista.mostraDados());

	}

}
