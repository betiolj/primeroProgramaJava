package cursojava_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DatasEmJavaVI {
	
	public static void main(String[] args) throws ParseException{
	
		/*Nova API de data a partir do Java **/
		
		LocalDate dataAtudal = LocalDate.now();
		System.out.println("Data atual: " + dataAtudal);
		
		LocalTime horaAtudal = LocalTime.now();
		System.out.println("Hora atual: " + horaAtudal);
		
		LocalDateTime dataHoraAtudal = LocalDateTime.now();
		System.out.println("Data e Hora atual: " + dataHoraAtudal);
		
		
	}

}
