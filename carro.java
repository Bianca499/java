 
public class carro {
	 private String modelo;
	    private int ano;
	    private int velocidadeAtual = 0; // velocidade inicial

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public void setAno(int ano) {
	        this.ano = ano;
	    }

	    public int getVelocidadeAtual() {
	        return velocidadeAtual;
	    }

	    public void acelerar(int valor) {
	        velocidadeAtual += valor;
	    }

	    public void frear(int valor) {
	        velocidadeAtual -= valor;
	        if (velocidadeAtual < 0) {
	            velocidadeAtual = 0;
	        }
	    }
	}

