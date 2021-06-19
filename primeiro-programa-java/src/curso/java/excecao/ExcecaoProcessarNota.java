package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Erro ao processar notas do aluno " + erro);
	}

}
