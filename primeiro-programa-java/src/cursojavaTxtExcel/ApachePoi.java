package cursojavaTxtExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\klebe\\git\\primeroProgramaJava\\primeiro-programa-java\\src\\cursojavaTxtExcel\\arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
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
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /*Objeto Usado para escrever a planilha*/
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento");/* Criar a planilha*/
		
		int  numeroLinha = 0;
		
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++); /* Criando a linha na planilha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula ++); /*Celula 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula ++); /*Celula 2*/
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula ++); /*Celula 3*/
			celIdade.setCellValue(p.getIdade());
		}/* Termino de montar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); /*Escreve a planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("A planilha foi criada");
		
	}

}
