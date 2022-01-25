package br.com.dentalOffice.test;

import br.com.dentalOffice.model.Atendimento;
import br.com.dentalOffice.model.Cliente;
import br.com.dentalOffice.model.Conveniado;
import br.com.dentalOffice.model.Dentista;
import br.com.dentalOffice.model.Particular;

public class TesteAssociacao {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * processo antes do encapsulamento
		 * 
		 * Dentista beatriz = new Dentista(); beatriz.nome = "Beatriz Fonseca";
		 * beatriz.cpf = "123.456.789-0"; beatriz.id_dentista = 1234;
		 * 
		 * Cliente cliente1 = new Cliente(); cliente1.nome = "Arnaldo José Farias";
		 * cliente1.matricula = 1; cliente1.cpf = "111.111.111-11"; cliente1.particular
		 * = true;
		 * 
		 * Atendimento consulta1 = new Atendimento(); consulta1.cliente = cliente1;
		 * consulta1.dentista = beatriz; consulta1.descricao = "Avaliação inicial";
		 * consulta1.protocolo = 1; consulta1.valor = 50;
		 * 
		 * consulta1.consultaAtendimento(); consulta1.atribuiValorConsulta(beatriz);
		 * beatriz.mostraDados();
		 * 
		 */

		// Após o encapsulamento...

		Dentista beatriz = new Dentista(1234, "Beatriz Fonseca", "123.456.789-00");
		beatriz.mostraDados();

		Cliente cliente1 = new Particular(1, "Arnaldo José Farias", "111.111.111-11");

		Atendimento consulta1 = new Atendimento(1, beatriz, cliente1, 50.0);
		consulta1.setDescricao("Avaliação inicial");

		Atendimento consulta2 = new Atendimento(2, beatriz, cliente1, 300.0);
		consulta2.setDescricao("Extração de Siso");
		
		System.out.println(consulta2);

		Conveniado cliente3 = new Conveniado(3, "Cleiton Aguiar", "333.333.333-33");
		cliente3.setEmpresa("Amil");
		
		System.out.println(cliente3);

		Atendimento consulta3 = new Atendimento(3, beatriz, cliente3, 50.0);
		consulta3.setDescricao("Avaliação inicial");

		consulta1.consultaAtendimento();
		System.out.println(" ");
		consulta2.consultaAtendimento();
		System.out.println(" ");
		consulta3.consultaAtendimento();
		System.out.println(" ");
		System.out.println("Quantidade atual de atendimentos: " + Atendimento.getTotal());
		System.out.println(" ");

		consulta1.cobraCliente(cliente1);
		consulta2.cobraCliente(cliente1);
		cliente1.pagaDentista(beatriz);

		beatriz.resgateSaldo(25);
		consulta3.cobraCliente(cliente3);

		cliente3.pagaDentista(beatriz);
		cliente3.formaDePagamento();
		beatriz.resgateSaldo(1000);

		System.out.println("Com a realização da consulta, o novo saldo da Dra. " + beatriz.getNome() + " é de: "
				+ beatriz.getSaldo());

	}

}
