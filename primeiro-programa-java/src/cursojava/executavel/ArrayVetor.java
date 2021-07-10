package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {10.0, 9.7, 8.6, 6.9};
		double[] notas2 = {9.0, 7.7, 8.9, 7.9};
		
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
		
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("------Discilplinas do aluno--------");
		for(Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println("Notas da disciplina: ");
			for(int pos = 0; pos < disc.getNota().length; pos++) {
				System.out.println("Nota " + pos + " = " + disc.getNota()[pos]);
			}
		}
	}

}
