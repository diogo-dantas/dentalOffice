package br.com.dentalOffice.model;

public interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract String getNome();

	public abstract boolean autentica(int senha);

}
