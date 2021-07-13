package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 9.0, 9.7, 10.0, 6.9 };
		double[] notas2 = { 9.0, 7.7, 9.9, 7.9 };

		Aluno aluno = new Aluno();
		aluno.setNome("jose");
		aluno.setNomeEscola("escola tal");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("banco");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina2);

		//-----------------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length ; pos ++) {			
			System.out.println("Nome: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Disciplina: " + d.getDisciplina());
				
				for(int pnota = 0 ; pnota < d.getNota().length; pnota++) {
					System.out.println("Nota " + pnota + " : " + d.getNota()[pnota]);
				}
			}
		}
	}

}
