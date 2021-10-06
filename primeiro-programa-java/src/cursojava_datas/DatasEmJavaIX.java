package cursojava_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJavaIX {

	public static void main(String[] args)throws ParseException, InterruptedException {
		
		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		
		LocalDate dataNova = LocalDate.of(2021, 10, 6);
		
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é anterior que data nova: " + dataAntiga.isBefore(dataNova));
		System.out.println("Data antiga é igual que data nova: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("Quantos Dias: " + periodo.getDays());
		System.out.println("Quantos Meses: " + periodo.getMonths());
		System.out.println("Quantos Anos: " + periodo.getYears());
	}

}
