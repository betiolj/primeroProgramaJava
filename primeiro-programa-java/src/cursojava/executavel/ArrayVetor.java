package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		/* Array pode ser de todos os tipos de dados e objetos */

		String[] valores = 	{"jose", "90","java","contado@com.br"};
		
		for(int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valor na posição " +pos+ " = "+ valores[pos]);
		}
		
	}

}
