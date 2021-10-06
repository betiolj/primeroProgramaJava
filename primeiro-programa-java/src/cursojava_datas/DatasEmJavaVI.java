package cursojava_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DatasEmJavaVI {
	
	public static void main(String[] args) throws ParseException{
	
		/*Nova API de data a partir do Java **/
		
		LocalDate dataAtudal = LocalDate.now();
		System.out.println("Data atual: " + dataAtudal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtudal = LocalTime.now();
		System.out.println("Hora atual: " + horaAtudal.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataHoraAtudal = LocalDateTime.now();
		System.out.println("Data e Hora atual: " + dataHoraAtudal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
	}

}
