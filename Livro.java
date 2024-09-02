package khawan.livraria;

public abstract class Livro {
	private	String titulo ;
	private String autor;
	private Double preco;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPreco() {
		return preco;
	}
	 public void setPreco(double preco) {
	        if (preco < 0) {
	            throw new PrecoInvalidoException("O preço não pode ser negativo.");
	        }
	        this.preco = preco;
	    }	
	 
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}
	public Livro(String titulo, String autor, Double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		 setPreco(preco);
	}
	
	

}
