package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jose");
		aluno.setNomeEscola("JDEV");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1567465r5ew4ew5");
		diretor.setNome("Jo�o");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiecnia("Administra��o");
		secretario.setNome("Marco");
		secretario.setIdade(45);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno � = "+ aluno.salario());
		System.out.println("Salario do diretor � = "+ diretor.salario());
		System.out.println("Salario do secretario � = "+ secretario.salario());
	}
}
