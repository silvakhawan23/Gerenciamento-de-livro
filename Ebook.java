package khawan.livraria;

public class Ebook extends Livro implements Vender{
	Double tamanho ;
	String formato;
	
	public Ebook(String titulo, String autor, Double preco, Double tamanho, String formato) {
		super(titulo, autor, preco);
		this.tamanho = tamanho;
		this.formato = formato;
	}

	@Override
	public boolean vender( ) {
		
		return true;
		
		
	}

	@Override
	public String toString() {
		return "Ebook [tamanho=" + tamanho + ", formato=" + formato + ", getTitulo()=" + getTitulo() + ", getAutor()="
				+ getAutor() + ", getPreco()=" + getPreco() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
