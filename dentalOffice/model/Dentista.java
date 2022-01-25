package br.com.dentalOffice.model;


/**
 * 
 * @author Diogo Dantas
 * @version 1.0
 *
 */

public class Dentista implements Autenticavel {

	private int id_dentista;
	private String nome;
	private String cpf;
	private double saldo = 0;
	private SubmeteAutenticação autenticador;

	public Dentista(int cro, String nome, String cpf) {
		if (cro <= 0) {
			throw new IllegalArgumentException("CRO inválido");
		}

		this.cpf = cpf;
		this.id_dentista = cro;
		this.nome = nome;
		this.autenticador = new SubmeteAutenticação();

	}

	@Override
	public boolean equals(Object obj) {

		Dentista dentista = (Dentista) obj;

		if (this.id_dentista != dentista.id_dentista) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CRO: " + this.id_dentista + "\nNome: " + this.nome + "\nCPF: " + this.cpf;
	}

	public void mostraDados() {

		System.out.println("Dados em consulta: ");
		System.out.println("CRO: " + this.id_dentista);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Saldo Atual: " + this.saldo);
		System.out.println(" ");

	}

	public void recebeValor(double valor) {

		this.saldo += valor;
		System.out.println("Contabilizado o valor " + valor + " com sucesso.");

	}

	public void resgateSaldo(double valor) {

		// com exception checked resgateSaldo(double valor) throws SaldoException {

		if (valor > this.saldo) {

			throw new SaldoException("Valor a regastar: " + valor + "/n Saldo Disponível: " + this.saldo);
		}

		this.saldo -= valor;
		System.out.println("Valor pago com sucesso!");
		System.out.println("Saldo atual: " + this.saldo);

	}

	// getters and setters

	public int getId_dentista() {
		return this.id_dentista;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;

	}

	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		System.out.println("Olá " + this.nome + " sua senha foi alterada com sucesso!");
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}



}
