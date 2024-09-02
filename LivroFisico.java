package khawan.livraria;

public class LivroFisico extends Livro implements Vender{
	Double peso;
	int estoque ;
	


	

	public LivroFisico(String titulo, String autor, Double preco, Double peso, int estoque) {
		super(titulo, autor, preco);
		this.peso = peso;
		this.estoque = estoque;
	}





	public Double CaulcularDesconto (double peso, double preco) {
		return preco-(peso*0.2);
		
		
	
		
	}

@Override
public String toString() {
    
    return super.toString() + ", LivroFisico [peso=" + peso + ", estoque=" + estoque + "]";
}


@Override
public boolean vender() {
	System.out.println("passou por aqui");
    if (this.estoque > 0) {
        this.estoque -= 1;
        System.out.println("deu certo");
        return true;
    } else {
        System.out.println("deu ruim");
        return false;
    }
}
	

}
