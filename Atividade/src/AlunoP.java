import java.util.Scanner;

public class AlunoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Aluno aluno1 = new Aluno();
	        aluno1.setNome("Mariana");
	        aluno1.setIdade(17);

	        System.out.println("Nome: " + aluno1.getNome());
	        System.out.println("Idade: " + aluno1.getIdade());
	    }

	}


