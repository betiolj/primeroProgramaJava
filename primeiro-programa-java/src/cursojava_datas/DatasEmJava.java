package cursojava_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do mes: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("minutos do dia: " + date.getMinutes());
		System.out.println("Ano : " + (date.getYear() + 1900));
		
		/*-------------------Simple Date Format---------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");		
		System.out.println("Data atual em formato padrão e string: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data atual em formato para banco de dados: " + simpleDateFormat.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1984-08-13"));
	}

}
