package br.com.dentalOffice.test;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

//		----- proposta 1 -----
//		
//		FileOutputStream fos = new FileOutputStream("src/br/com/dentalOffice/files/protocoloCovid.txt");
//		OutputStreamWriter ost = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(ost);

//		----- proposta 2 -----
//
//		FileWriter fw = new FileWriter("src/br/com/dentalOffice/files/protocoloCovid.txt");
//
//		fw.write("Protocolo sobre os atendimentos odontológicos atuais segundo CDC");
//
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//
//		fw.write("Com a pandemia do SARS-CoV-2 diversos novos protocolos oficiais de biossegurança, que recebiam "
//				+ "tutela de instituições de respeito, elaborados por profissionais exímios, foram publicados para"
//				+ " a consulta de cirurgiões-dentistas. Por isso a FOUSP resolveu conversar um pouco mais com o "
//				+ "Prof. Dr. Claudio Mendes Pannuti, que ministra aulas na Disciplina de Periodontia no Departamento "
//				+ "de Estomatologia, para entender um pouco melhor a dinâmica dos atendimentos odontológicos atuais."
//				+ "A primeira preocupação permeia já no interesse, necessidade do paciente de estar comparecendo em "
//				+ "consultório odontológico para fazer o tratamento. O auxiliar ou o cirurgião-dentista deve fazer "
//				+ "esse primeiro contato de maneira não presencial, tendo como alternativa telefone, e-mail, mensagem "
//				+ "via WhatsApp. Neste momento é quando o paciente vai passar por uma espécie de pré-triagem.");
//				
//
//		fw.write(System.lineSeparator());
//
//		fw.close();
//	}
//}

//		----- proposta 3 -----
//
//		BufferedWriter bw = new BufferedWriter(new FileWriter("src/br/com/dentalOffice/files/protocoloCovid.txt"));
//
//		bw.write("Protocolo sobre os atendimentos odontológicos atuais segundo CDC");
//
//		bw.newLine();
//		bw.newLine();
//
//		bw.write("Com a pandemia do SARS-CoV-2 diversos novos protocolos oficiais de biossegurança, que recebiam "
//				+ "tutela de instituições de respeito, elaborados por profissionais exímios, foram publicados para"
//				+ " a consulta de cirurgiões-dentistas. Por isso a FOUSP resolveu conversar um pouco mais com o "
//				+ "Prof. Dr. Claudio Mendes Pannuti, que ministra aulas na Disciplina de Periodontia no Departamento "
//				+ "de Estomatologia, para entender um pouco melhor a dinâmica dos atendimentos odontológicos atuais."
//				+ "A primeira preocupação permeia já no interesse, necessidade do paciente de estar comparecendo em "
//				+ "consultório odontológico para fazer o tratamento.");
//		bw.newLine();
//
//		bw.close();

//		proposta 4

		PrintStream ps = new PrintStream("src/br/com/dentalOffice/files/protocoloCovid.txt");
		// também pode ser usado PrintWriter a sintaxe será a mesma.

		ps.println("Protocolo sobre os atendimentos odontológicos atuais segundo CDC");
		// também pode ser usado os métodos ps.write ou ps.print.

		ps.println();
		ps.println();

		ps.println("Com a pandemia do SARS-CoV-2 diversos novos protocolos oficiais de biossegurança,"
				+ " que recebiam tutela de instituições de respeito, elaborados por profissionais exímios,"
				+ " foram publicados para a consulta de cirurgiões-dentistas. Por isso a FOUSP resolveu "
				+ "conversar um pouco mais com o Prof. Dr. Claudio Mendes Pannuti, que ministra aulas na "
				+ "Disciplina de Periodontia no Departamento de Estomatologia, para entender um pouco melhor"
				+ " a dinâmica dos atendimentos odontológicos atuais.A primeira preocupação permeia já no "
				+ "interesse, necessidade do paciente de estar comparecendo em consultório odontológico para "
				+ "fazer o tratamento.");

		ps.println();

		ps.close();

	}

}
