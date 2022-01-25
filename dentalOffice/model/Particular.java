package br.com.dentalOffice.model;

public class Particular extends Cliente {
	
	/**
	 * Classe filha de Cliente que representa pacientes sem plano odontológico.
	 * 
	 * @author Diogo Dantas
	 *@version 1.0
	 *
	 */

	public Particular(int matricula, String nome, String cpf){
		super(matricula,nome,cpf);
	}
	
	@Override
	public String toString() {
		return "Particular:\n" + super.toString();
	}

	public void formaDePagamento() {

		System.out.println("Clientes particulares realizam o pagamento à vista, ou parcelado em 3 vezes.");

	}

}
