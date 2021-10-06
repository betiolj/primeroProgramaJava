package cursojava_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJavaIV {
	
	public static void main(String[] args) throws ParseException{
		
		/*saber o total de dias de uma data até a data atual*/
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Possui " + dias + " dias entre a faixa de datas");
	}

}
