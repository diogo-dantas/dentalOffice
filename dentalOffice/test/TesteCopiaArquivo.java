package br.com.dentalOffice.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/br/com/dentalOffice/files/normaAnvisa.txt");
		// System.in; e System.out; grava ou mostra no console (read or write).
		InputStreamReader ist = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(ist);

		FileOutputStream fos = new FileOutputStream("src/br/com/dentalOffice/files/normaAnvisa_versao2.txt");
		OutputStreamWriter ost = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ost);

		String linha = br.readLine();

		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close();
		bw.close();

	}
}
