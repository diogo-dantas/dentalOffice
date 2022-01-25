package br.com.dentalOffice.test;

import br.com.dentalOffice.model.AssistenteAdministrativo;
import br.com.dentalOffice.model.Dentista;
import br.com.dentalOffice.model.SistemaInterno;

public class Teste {

	public static void main(String[] args) {

		/*
		 * antes do encapsulamento
		 * 
		 * Dentista beatriz = new Dentista(); beatriz.nome = "Beatriz Fonseca";
		 * beatriz.cpf = "123.456.789-0"; beatriz.id_dentista = 1234;
		 * 
		 * beatriz.mostraDados(); beatriz.recebeValor(500); beatriz.resgateSaldo(150);
		 * 
		 * boolean consultaOperacao = beatriz.resgateSaldo(150);
		 * System.out.println("O procedimento foi efetuado? " + consultaOperacao);
		 * 
		 */

		/*
		 * Com encapsulamento - antes de aplicar construtores:
		 * 
		 * Dentista beatriz = new Dentista(); beatriz.setId_dentista(1234);
		 * beatriz.setNome("Beatriz Fonseca"); beatriz.setCpf("123.456.789-00");
		 * 
		 * beatriz.mostraDados();
		 * 
		 */
		Dentista beatriz = new Dentista(1234, "Beatriz Fonseca", "123.456.789-00");
		beatriz.mostraDados();

		beatriz.setSenha(1111);

		SistemaInterno si = new SistemaInterno();

		si.autentica(beatriz);

		beatriz.setSenha(5789);

		si.autentica(beatriz);

		AssistenteAdministrativo ad = new AssistenteAdministrativo("Tania Morales", "345.647.389-30", 3500.0);
		ad.setSenha(5789);

		si.autentica(ad);

		System.out.println(beatriz);

		// método equals sobrescrito para a classe Dentista.

		Dentista pietro = new Dentista(1234, "Pietro Alencar", "222.222.222-22");

		System.out.println("\n O id de Pietro é inválido? " + pietro.equals(beatriz));

	}

}
