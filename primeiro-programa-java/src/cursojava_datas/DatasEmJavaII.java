package cursojava_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJavaII {
	
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtual = simpleDateFormat.parse("05/10/2021");
		
		/* Se a data 1 é maior que a data 2 */
		if(dataVencimentoBoleto.after(dataAtual)) {
			System.out.println("after Boleto não vencido");
		}else
		{
			System.out.println(" after Boleto vencido");
		}
		
		/* Se a data 1 é menor que a data 2 */
		if(dataVencimentoBoleto.before(dataAtual)) {
			System.out.println("before Boleto vencido");
		}else
		{
			System.out.println("before Boleto não vencido");
		}
		
	}

}
