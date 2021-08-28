package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) { /* bloquear o acesso a esta lista por outros porcessos */

			while (iteracao.hasNext()) { /* Enquanto conter dados na lista ele ira processar */

				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				/* aqui você chama os processo demorados do java */
				/* Processar 10 mil notas fiscal */
				
				System.out.println("---------------------------------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail()); 
				iteracao.remove();

				try {
					Thread.sleep(100); /* tempo para descarga de memoria */
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

		try {
			Thread.sleep(1000);/* processou toda a lista, dar um tempo para limpesa de memoria */
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
