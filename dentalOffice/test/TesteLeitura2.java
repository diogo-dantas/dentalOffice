package br.com.dentalOffice.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("src/br/com/dentalOffice/files/tabelaBase.csv"), "UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tratamento = linhaScanner.next();
			String dentista = linhaScanner.next();
			double tabelaBase = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"), "%s - %s: %07.2f%n", tratamento, dentista, tabelaBase);

			linhaScanner.close();
		}

		scanner.close();
	}

}
