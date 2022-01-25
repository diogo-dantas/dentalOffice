package br.com.dentalOffice.test;

import br.com.dentalOffice.model.Atendimento;
import br.com.dentalOffice.model.Conveniado;
import br.com.dentalOffice.model.Dentista;

public class TesteSaldoInsulficiente {

	public static void main(String[] args) {

		// EXCEPTION TYPE CHECKED
		// public static void main(String[] args) throws SaldoException {
		// se o bloco try/catch não tratar a exceção

		// Conveniado

		Dentista adrian = new Dentista(2222, "Adrian Morales", "555.555.555-55");
		adrian.mostraDados();
		Conveniado batista = new Conveniado(3333, "Claudio Batista Lovineo", "123.634.894-82");
		Atendimento a1 = new Atendimento(12, adrian, batista, 150.0);
		a1.setDescricao("Avaliação");
		System.out.println(a1.getClass());
		a1.consultaAtendimento();

		a1.cobraCliente(batista);
		System.out.println(batista.getValor());
		batista.formaDePagamento();
		batista.pagaDentista(adrian);
		System.out.println("Saldo Claudio: " + batista.getValor());
		System.out.println("Saldo Adrian: " + adrian.getSaldo());
		adrian.resgateSaldo(500.0);

//		try {
//			adrian.resgateSaldo(50.0);
//		} catch (SaldoException se) {
//			System.out.println("Solicitação inválida, " + adrian.getNome() + " verifique novamente seu saldo.");
//
//		} finally {
//			System.out.println(adrian.getNome() + ", procedimento realizado!");
//		}

	}
}
