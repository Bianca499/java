import java.util.Scanner;

public class MUSICAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MUSICA m1 = new MUSICA();
	        m1.titulo = "Shape of You";
	        m1.artista = "Ed Sheeran";
	        m1.duracao = 4.2;

	        MUSICA m2 = new MUSICA();
	        m2.titulo = "Levitating";
	        m2.artista = "Dua Lipa";
	        m2.duracao = 3.5;

	        MUSICA m3 = new  MUSICA();
	        m3.titulo = "Blinding Lights";
	        m3.artista = "The Weeknd";
	        m3.duracao = 3.2;

	        m1.tocar();
	        m1.mostrarDetalhes();
	        m1.pausar();

	        System.out.println("---------------------");

	        m2.tocar();
	        m2.mostrarDetalhes();
	        m2.pausar();

	        System.out.println("----------------------------");

	        m3.tocar();
	        m3.mostrarDetalhes();
	        m3.pausar();
	    }

	}


