package cursojava.thread;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		for(int pos = 0; pos <  10; pos++) {
			
		
			/*enviar com tempo de parada ou com um tempo determinado*/
			System.out.println("Executando rotina, envio de e-mail");
			
			/*Execu��o leva 1 segunda em cada execu��o*/
			Thread.sleep(1000);
		}
		
		System.out.println("final do codigo de teste de Thread");
	}

}
