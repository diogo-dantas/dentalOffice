package br.com.dentalOffice.test;

import java.util.ArrayList;

import br.com.dentalOffice.model.Atendimento;
import br.com.dentalOffice.model.Conveniado;
import br.com.dentalOffice.model.Dentista;

public class TesteControleDiario {

	public static void main(String[] args) {

		ArmazenaAtendimentoComArrays dataExemplo = new ArmazenaAtendimentoComArrays();

		Dentista beatriz = new Dentista(1234, "Beatriz Fonseca", "123.456.789-00");
		Conveniado batista = new Conveniado(3333, "Claudio Batista Lovineo", "123.634.894-82");

		Atendimento consulta1 = new Atendimento(1, beatriz, batista, 200.0);
		consulta1.setDescricao("Limpeza");

		dataExemplo.adiciona(consulta1);

		Dentista adrian = new Dentista(2222, "Adrian Morales", "555.555.555-55");
		Conveniado cleiton = new Conveniado(3, "Cleiton Aguiar", "333.333.333-33");
		Atendimento consulta2 = new Atendimento(2, adrian, cleiton, 50.0);
		consulta2.setDescricao("Avaliação Inicial");

		dataExemplo.adiciona(consulta2);

		int tamanho = dataExemplo.getConsultas();

		Atendimento ref = dataExemplo.getReferencia(0);
		System.out.println(ref);
		System.out.println(tamanho);

		for (int i = 0; i < tamanho; i++) {
			System.out.println(dataExemplo.getReferencia(i) + "\n");
		}

		System.out.println("\n----------Trabalhando com listas----------\n");

		// adicionando generics à list para evitar excesso de casts

		ArrayList<Atendimento> diaExemplo2 = new ArrayList<Atendimento>();

		diaExemplo2.add(0, consulta1);
		diaExemplo2.add(consulta2);

		int quantidadeAtendimentos = diaExemplo2.size();
		System.out.println(quantidadeAtendimentos);

		Atendimento refPrimeiraConsulta = diaExemplo2.get(0);
		refPrimeiraConsulta.consultaAtendimento();

		diaExemplo2.remove(1);

		diaExemplo2.add(1, consulta2);

		for (int i = 0; i < diaExemplo2.size(); i++) {

			Atendimento refO = diaExemplo2.get(i);
			refO.consultaAtendimento();
		}

		// modo simplificado

		for (Atendimento ref0 : diaExemplo2) {
			ref0.consultaAtendimento();
		}

	}

}
