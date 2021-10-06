package cursojava_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJavaIII {
	
	public static void main(String[] args)  throws ParseException{
		
		Calendar calendar = Calendar.getInstance();/* Pega a data atual*/
		
		/*simular que a data vem do banco de dados*/
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("05-10-2021"));/*Definindo uma data qualquer*/
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);/*adicionar 5 dias*/		
		System.out.println("Somando dia do mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, -2);
		System.out.println("Subtraindo mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 3);
		System.out.println("Somando ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
	}

}
