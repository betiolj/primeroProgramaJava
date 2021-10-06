package cursojava_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJavaVII {
	
	public static void main(String[] args) throws ParseException{
		
		LocalDate dataAtudal = LocalDate.now();
		System.out.println("Data atual: " + dataAtudal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Dia da semana: " + dataAtudal.getDayOfWeek().name());
		System.out.println("Dia do mes: " + dataAtudal.getDayOfMonth());
		System.out.println("Dia do ano: " + dataAtudal.getYear());
	}

}
