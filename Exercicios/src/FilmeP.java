import java.util.Scanner;

public class FilmeP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Filme f1 = new Filme();
	        f1.titulo = "Inception";
	        f1.genero = "Ficção Científica";
	        f1.duracao = 148;

	        Filme f2 = new Filme();
	        f2.titulo = "Titanic";
	        f2.genero = "Romance";
	        f2.duracao = 195;

	        Filme f3 = new Filme();
	        f3.titulo = "Matrix";
	        f3.genero = "Ação";
	        f3.duracao = 136;

	        f1.assistir();
	        f1.mostrarInformacoes();
	        f2.assistir();
	        f3.assistir();
	    }
	

	}


