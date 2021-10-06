package cursojava_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJavaV {

	public static void main(String[] args) throws ParseException{
		
	Date dataInicial = new SimpleDateFormat("dd/MM/yyy").parse("05/10/2021");
	
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(dataInicial);
	
	for (int parcela = 1 ; parcela <= 12; parcela ++) {
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Parcela numero "+ parcela + " vencimento em:  "+ new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
	}
	}
}
