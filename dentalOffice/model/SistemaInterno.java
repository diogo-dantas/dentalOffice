package br.com.dentalOffice.model;

public class SistemaInterno {

	private int senha = 5789;

	public void autentica(Autenticavel aut) {
		
		boolean autenticou = aut.autentica(this.senha);

		if (autenticou == true) {
			System.out.println(aut.getNome() + ", bem vindo ao sistema!");
		} else {
			System.out.println("Senha incorreta, por favor verifique os dados corretos.");
		}

	}

}
