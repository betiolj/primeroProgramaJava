package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo*/
		new Thread() {
			
			public void run() {/* executa o que nós queremos*/
				/*codigo da rotina*/
				

				/*codigo da rotina que eu quero executar em paralelo*/
				for(int pos = 0; pos <  10; pos++) {			
				
					/*enviar com tempo de parada ou com um tempo determinado*/
					System.out.println("Executando rotina, envio de e-mail");
					
					/*Execução leva 1 segunda em cada execução*/
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				/*fim do codigo em paralelo*/
				
			};
			
		}.start();/*liga a Thread que fica processando paralelamente*/
			
		
		/*codigo do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("final do codigo de teste de Thread");
		/*fluxo do sistema,*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

}
