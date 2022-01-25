package br.com.dentalOffice.model;

public class Atendimento implements Comparable <Atendimento> {

	private int protocolo;
	private Dentista dentista;
	private Cliente cliente;
	private double valorAtendimento;
	private String descricao;
	private static int total = 0;

	public Atendimento(int protocolo, Dentista dentista, Cliente cliente, Double valor) {

		if (protocolo < 0) {
			throw new IllegalArgumentException("Protocolo inválido");
		}

		this.protocolo = protocolo;
		this.dentista = dentista;
		this.cliente = cliente;
		this.valorAtendimento = valor;
		Atendimento.total++;
	}

	@Override
	public String toString() {
		return "Protocolo: " + this.protocolo + "\nDentista responsável: " + this.dentista + "\nDescrição: "
				+ this.descricao;
	}

	public void consultaAtendimento() {

		System.out.println("\nDados do atendimento: ");
		System.out.println("Protocolo:  " + this.protocolo);
		System.out.println("Dentista responsável: " + this.dentista.getNome());
		System.out.println("Cliente : " + this.cliente.getNome());
		System.out.println("Motivo da consulta: " + this.descricao);
		System.out.println(" Valor da consulta " + this.valorAtendimento);
		System.out.println(" ");

	}

	// polimorfismo

	public void cobraCliente(Cliente cliente) {
		cliente.setValor(this.valorAtendimento);

	}

	// getters and setters

	public int getProtocolo() {
		return this.protocolo;
	}

	public Dentista getDentista() {
		return dentista;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return this.valorAtendimento;
	}

	public void setValor(double valor) {
		this.valorAtendimento = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static int getTotal() {
		return Atendimento.total;
	}

	@Override
	public int compareTo(Atendimento outro) {
		return Integer.compare(this.protocolo, outro.protocolo);
	}
}
