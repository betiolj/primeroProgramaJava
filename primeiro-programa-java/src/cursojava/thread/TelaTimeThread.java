package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{ /*jDialog SWING tela*/

	/*Construtor*/
	public TelaTimeThread() {
		setTitle("Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*primeira parte concluida*/
		
		
		/*sempre sera o ultimo comando*/
		setVisible(true); /*torna a tela visivel*/
	}
}
