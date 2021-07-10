package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {10.0, 9.7, 8.6, 6.9};
		double[] notas2 = {9.0, 9.9, 8.9, 7.9};
		
		Aluno aluno = new Aluno();
		aluno.setNome("jose");
		aluno.setNomeEscola("escola tal");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina.setDisciplina("banco");
		disciplina.setNota(notas2);
		
		aluno.getDisciplinas().add(disciplina2);
		
	}

}
