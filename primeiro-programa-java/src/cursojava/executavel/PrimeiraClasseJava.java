package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
		
		Secretario secretario = new Secretario(); /*Interface diretamente com objeto*/
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if(secretario.autenticar()) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*HashMap é uma lista que dentro tem uma chave que identifica uma sequencia de valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		

		for (int qtd = 1; qtd <= 3; qtd++) {

			/* new Aluno() é uma instancia (Criação de Objeto) */
			/* aluno1 é um referencia para o objeto Aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Qual a data de nascimento do aluno?"); String rg
			 * = JOptionPane.showInputDialog("Qual o RG do aluno?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF do aluno?"); String nomeMae =
			 * JOptionPane.showInputDialog("Qual o nome da mãe do aluno?"); String nomePai =
			 * JOptionPane.showInputDialog("Qual o nome do pai do aluno?"); String
			 * dataMatriucula =
			 * JOptionPane.showInputDialog("Qual a data da matricula do aluno?"); String
			 * serie = JOptionPane.showInputDialog("Qual o a serie do aluno?"); String
			 * escola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCPF(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatriucula);
			 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

			if (escolha == 0) { /* Opção SIM é zero */

				int contiarRemover = 0;
				int posicao = 1;
				while (contiarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					contiarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
				}
			}

			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);; /*Reprovado*/
			}
		}
		
		System.out.println("------------------- Lista dos aprovados -------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com médida: " + aluno.getMediaNota());
		}
		
		System.out.println("------------------- Lista dos Recuperação -------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com médida: " + aluno.getMediaNota());
		}
		
		System.out.println("------------------- Lista dos Reprovados -------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com médida: " + aluno.getMediaNota());
		}
	}
		else {
			JOptionPane.showMessageDialog(null,"login ou senha errado");
	}
	}
}
