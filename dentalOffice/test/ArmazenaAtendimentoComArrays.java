package br.com.dentalOffice.test;

import br.com.dentalOffice.model.Atendimento;

public class ArmazenaAtendimentoComArrays {
	
	// Classe base para pratica de arrays

	private Atendimento[] consultas;
	private int posicaoLivre;

	public ArmazenaAtendimentoComArrays() {
		this.consultas = new Atendimento[3];
		this.posicaoLivre = 0;
	}

	public void adiciona(Atendimento consulta) {
		consultas[posicaoLivre] = consulta;
		this.posicaoLivre++;

	}

	public int getConsultas() {
		return this.posicaoLivre;
	}

	public Atendimento getReferencia(int i) {
		return this.consultas[i];
	}
}
