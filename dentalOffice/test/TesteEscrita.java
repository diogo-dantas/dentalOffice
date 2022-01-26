package br.com.dentalOffice.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("src/br/com/dentalOffice/files/protocoloCovid.txt");
		OutputStreamWriter ost = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ost);

		bw.write("Protocolo sobre os atendimentos odontológicos " + "atuais segundo CDC");

		bw.newLine();
		bw.newLine();

		bw.write("Com a pandemia do SARS-CoV-2 diversos novos protocolos oficiais de biossegurança, que recebiam "
				+ "tutela de instituições de respeito, elaborados por profissionais exímios, foram publicados para"
				+ " a consulta de cirurgiões-dentistas. Por isso a FOUSP resolveu conversar um pouco mais com o "
				+ "Prof. Dr. Claudio Mendes Pannuti, que ministra aulas na Disciplina de Periodontia no Departamento "
				+ "de Estomatologia, para entender um pouco melhor a dinâmica dos atendimentos odontológicos atuais.");

		bw.newLine();

		bw.close();
	}
}
