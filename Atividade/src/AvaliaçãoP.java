import java.util.Scanner;

public class AvaliaçãoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Avaliação aluno1 = new Avaliação();

	        aluno1.setNome("Julia");
	        aluno1.setNota1(8.5);
	        aluno1.setNota2(9.0);

	        System.out.println("Aluno: " + aluno1.getNome());
	        System.out.println("Média final: " + aluno1.calcularMedia());
	    }
	

	}


