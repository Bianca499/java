import java.util.Scanner;

public class avaliaçãoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 avaliação av = new avaliação();

	        av.setNome("Bianca");
	        av.setNota1(9.0);
	        av.setNota2(8.5);

	        System.out.println("Aluno: " + av.getNome());
	        System.out.println("Média final: " + av.calcularMedia());
	    }
	

	}


