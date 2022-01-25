package br.com.dentalOffice.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/br/com/dentalOffice/files/normaAnvisa.txt");
		InputStreamReader ist = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(ist);

		String linha = br.readLine();

		while (linha != null) {

			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
