package cursojava_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJavaX {

	public static void main(String[] args) throws ParseException, InterruptedException  {

		LocalDate dataBase = LocalDate.parse("2020-02-07");
		
		System.out.println("mais 5 dias " + dataBase.plusDays(5));
		System.out.println("mais 5 semanas " + dataBase.plusMonths(5));
		System.out.println("mais 5 Anos " + dataBase.plusYears(5));
		System.out.println("menos 1 Ano " + dataBase.minusYears(1));
		
		for (int mes = 1; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data do vencimento do Boleto: " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}

}
