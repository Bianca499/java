
public class Avaliação {
	  private String nome;
	    private double nota1;
	    private double nota2;

	    // Setters com validação
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setNota1(double nota1) {
	        if (nota1 >= 0 && nota1 <= 10) {
	            this.nota1 = nota1;
	        } else {
	            System.out.println("Nota 1 inválida! Deve ser entre 0 e 10.");
	        }
	    }

	    public void setNota2(double nota2) {
	        if (nota2 >= 0 && nota2 <= 10) {
	            this.nota2 = nota2;
	        } else {
	            System.out.println("Nota 2 inválida! Deve ser entre 0 e 10.");
	        }
	    }

	    // Getters
	    public String getNome() {
	        return nome;
	    }

	    public double getNota1() {
	        return nota1;
	    }

	    public double getNota2() {
	        return nota2;
	    }

	    // Método para calcular a média
	    public double calcularMedia() {
	        return (nota1 + nota2) / 2;
	    }
	}


