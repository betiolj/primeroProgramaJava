package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		/* Array pode ser de todos os tipos de dados e objetos */

		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

		/* Array sempre deve ter a quantidade de posições definidas */
		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da nota = " + pos);
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Notas " + (pos + 1) + " = " + notas[pos]);
		}
	}

}
