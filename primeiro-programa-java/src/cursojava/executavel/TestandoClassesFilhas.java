package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jose");
		aluno.setNomeEscola("JDEV");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1567465r5ew4ew5");
		diretor.setNome("João");
		
		Secretario secretatrio = new Secretario();
		secretatrio.setExperiecnia("Administração");
		secretatrio.setNome("Marco");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretatrio);
	}
}
