package cursojavaTxtExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws Exception{ 
		
		File file = new File("C:\\Users\\klebe\\git\\primeroProgramaJava\\primeiro-programa-java\\src\\cursojavaTxtExcel\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prapara a entrada do arquivo xls excel*/
		
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pegando a planilha*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) { /*Enquanto tiver linha*/
			Row linha = linhaIterator.next(); /*Dados das pessoas na linha*/
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*quantidade de celula*/
			
			Cell cell = linha.createCell(numeroCelulas); /*Cria nova celula na linha*/
			cell.setCellValue("2,444.44");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("planilha atualizada");
	}
}
