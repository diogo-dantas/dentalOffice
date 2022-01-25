package br.com.dentalOffice.model;

public class Conveniado extends Cliente {

	/**
	 * Classe filha de Cliente que representa pacientes com plano odontológico.
	 * 
	 * @author Diogo Dantas
	 * @version 1.0
	 *
	 */

	public Conveniado(int matricula, String nome, String cpf) {
		super(matricula, nome, cpf);
	}

	private String empresa;

	@Override
	public String toString() {
		return "Conveniado:\n" + super.toString();
	}

	public void formaDePagamento() {

		System.out.println("Mediante regra da empresa " + this.empresa
				+ ", o pagamento será efetuado em 30 dias após o atendimento.");

	}

	// método específico - sobrescrito

	@Override
	public boolean pagaDentista(Dentista dentista) {
		super.valor *= 0.9;
		return super.pagaDentista(dentista);
	}

	// getters and setters

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
