import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atividade02.Pessoa;

public class Programa {

	private static Scanner scanner = new Scanner(System.in);
	private static List<Matricula> listaMatricula = new ArrayList<>();
	public static void main(String[] args) {
		
		
		int opcao; 
		
		do {
			System.out.println("Menu: ");
			System.out.println(" 1 - Cadastrar Matricula: ");
			System.out.println(" 2 - Imprimir Matriculas: ");
			System.out.println(" 3 - Encerrar: ");
			System.out.println("Escolha uma opcao: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch(opcao) {
			case 1:
				cadastroMatricula();
				break;
			case 2: 
				imprimirMatriculas();
				break;
			case 3:
				System.out.println("Fechando programa");
			default:
				System.out.println("Opcao invalida! Digite novamente uma opcao");
			}
			
		} while (opcao != 4);
		
	}
	
	private static void cadastroMatricula() {
		
		System.out.println("Digite o codigo do curso");
		int codigo = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o nome do curso");
		String nomeCurso = scanner.nextLine();
		
		System.out.println("Digite a data de inicio do curso: 'Data ano-mes-dia'");
		String inicioCurso = scanner.nextLine();
	
		Curso c1 = new Curso(codigo, nomeCurso, LocalDate.parse(inicioCurso));
		
		System.out.println("Digite a matricula do aluno");
		String matricula = scanner.nextLine();
		
		System.out.println("Digite o nome da aluno");
		String nomeAluno = scanner.nextLine();
		
		System.out.println("Digite a data de nascimento: 'Data ano-mes-dia'");
		String data = scanner.nextLine();
		
		Aluno a1 = new Aluno(matricula, nomeAluno, LocalDate.parse(data));
		
		
		try {
			Matricula m1 = new Matricula(a1, c1);
			listaMatricula.add(m1);
			System.out.println("Matricula feita!");
		} catch (IdadeMatriculaException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void imprimirMatriculas() {
		System.out.println(listaMatricula.toString());
	}

}
