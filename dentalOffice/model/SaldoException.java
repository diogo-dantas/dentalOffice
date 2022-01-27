package br.com.dentalOffice.model;

public class SaldoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	// CHECKED
	// public class SaldoException extends Exception

	public SaldoException(String msg) {
		super(msg);
	}

}
