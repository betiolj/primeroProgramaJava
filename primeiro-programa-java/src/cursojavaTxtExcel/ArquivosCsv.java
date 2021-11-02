package cursojavaTxtExcel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivosCsv {
	
	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Jose Silva");
		pessoa1.setEmail("jose@email.com");
		pessoa1.setIdade(40);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maria Santos");
		pessoa2.setEmail("maria@email.com");
		pessoa2.setIdade(30);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Pedro Prado");
		pessoa3.setEmail("pedro@email.com");
		pessoa3.setIdade(50);
		
		/*Essa lista pode vir de um banco de dados*/
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		
		File arquivo = new File("C:\\Users\\klebe\\git\\primeroProgramaJava\\primeiro-programa-java\\src\\cursojavaTxtExcel\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" +p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
