package br.com.dentalOffice.model;

public class AssistenteAdministrativo implements Autenticavel {

	private String nome;
	private String cpf;
	private double salario;
	private SubmeteAutenticação autenticador;

	/**
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public AssistenteAdministrativo(String nome, String cpf, double salario) {

		if (salario <= 1000) {
			throw new IllegalArgumentException("O salário deve ser maior que o mínimo permitido por lei");
		}

		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.autenticador = new SubmeteAutenticação();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Assistente Administrativa: " + this.nome + "\nCPF: " + this.cpf;
	}

	public void consultaDados() {

		System.out.println("\nDados em consulta: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Salário Bruto: " + this.salario);
		System.out.println(" ");
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		System.out.println("\nOlá " + this.nome + " sua senha foi alterada com sucesso!");
	}

	@Override
	public boolean autentica(int senha) {

		return this.autenticador.autentica(senha);
	}

	// getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
