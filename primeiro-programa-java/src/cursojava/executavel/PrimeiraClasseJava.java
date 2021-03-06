package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		try {

			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o Login");
			String senha = JOptionPane.showInputDialog("Informe a Senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { /* vou travar o contrato para quem realmente tem o contrato */

				// List<Aluno> alunos = new ArrayList<Aluno>();
				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * HashMap ? uma lista que dentro tem uma chave que identifica uma sequencia de
				 * valores
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					/* new Aluno() ? uma instancia (Cria??o de Objeto) */
					/* aluno1 ? um referencia para o objeto Aluno */

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
					/*
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Qual a data de nascimento do aluno?"); String rg
					 * = JOptionPane.showInputDialog("Qual o RG do aluno?"); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF do aluno?"); String nomeMae =
					 * JOptionPane.showInputDialog("Qual o nome da m?e do aluno?"); String nomePai =
					 * JOptionPane.showInputDialog("Qual o nome do pai do aluno?"); String
					 * dataMatriucula =
					 * JOptionPane.showInputDialog("Qual a data da matricula do aluno?"); String
					 * serie = JOptionPane.showInputDialog("Qual o a serie do aluno?"); String
					 * escola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
					 */

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					/*
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
						//disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

					if (escolha == 0) { /* Op??o SIM ? zero */

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
						maps.get(StatusAluno.REPROVADO).add(aluno);
						; /* Reprovado */
					}
				}

				System.out.println("------------------- Lista dos aprovados -------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " com m?dida: " + aluno.getMediaNota());
				}

				System.out.println("------------------- Lista dos Recupera??o -------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " com m?dida: " + aluno.getMediaNota());
				}

				System.out.println("------------------- Lista dos Reprovados -------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " com m?dida: " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "login ou senha errado");
			}
		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); /* imprime erro no console Java */

			/* Mensagem do erro ou causa */
			System.out.println("Mensagem:  " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro de convers?o de numero" + saida.toString());

			/*
			 * sempre ? usando quando se precisar executar um processo acontecendo erro ou
			 * n?o
			 */
			JOptionPane.showMessageDialog(null, "Este ? o bloco Finally");

		}

	}

	public static void lerArquivo() throws FileNotFoundException {

		File fil = new File("C:\\Users\\klebe\\Desktop\\lines.txt");
		//Scanner scanner = new Scanner(fil);
	}

}
