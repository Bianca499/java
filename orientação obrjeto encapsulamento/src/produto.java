
public class produto {
	 private String nome;
	    private double preco;
	    private int estoque;

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        if (preco < 0) {
	            System.out.println("Preço não pode ser negativo!");
	        } else {
	            this.preco = preco;
	        }
	    }

	    public int getEstoque() {
	        return estoque;
	    }

	    public void setEstoque(int estoque) {
	        if (estoque < 0) {
	            System.out.println("Estoque não pode ser negativo!");
	        } else {
	            this.estoque = estoque;
	        }
	    }
	}

