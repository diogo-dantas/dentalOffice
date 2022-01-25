package br.com.dentalOffice.model;

public abstract class Cliente {

	private int matricula;
	private String nome;
	private String cpf;
	protected double valor;

	public Cliente(int matricula, String nome, String cpf) {

		if (matricula <= 0) {
			throw new IllegalStateException("Matrícula Inválida");
		}

		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;

	}
	
	@Override
	public String toString() {
		return "Matricula: " + this.matricula + "\nNome: " + this.nome + "\nCPF: " + this.cpf;
	}

	public abstract void formaDePagamento();

	public boolean pagaDentista(Dentista dentista) {
		if (this.valor > 0) {
			dentista.recebeValor(this.valor);
			System.out.println("Pagamento realizado com sucesso!");
			this.valor = 0;
			return true;
		} else {
			System.out.println("Não há débitos pendentes para  " + this.nome);
			return false;
		}

	}

	// getters and setters

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor += valor;
	}

}
