package khawan.livraria;

public class TestaLivro {
	static Livro[] listaLivro = new Livro[10];
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
	
	public static void menu() {
		int opcao = Teclado.lerInteiro(" 1-Cadastrar\n 2-Vender\n 3-Consultar\n 4-Sair ");
		switch (opcao) {
		case 1:
			cadastrar();
			break;
		
		case 2:
			vender();
			break;
		case 3:
			consultar();
			break;
		case 4:
			System.out.println("Logout");
			System.exit(0);
			break;
	
		}
	}
	
	public static void cadastrar() {
		Livro livrofisico = null;
		Livro ebook = null;
		 
		String titulo = Teclado.lerString("Titulo:");
		String autor = Teclado.lerString("autor:");
		Double preco = Teclado.lerDouble("Preco:");
		int tipoLivro = Teclado.lerInteiro("Tipo do livro: 1- fisico 2-ebook");
		try {
		if (tipoLivro == 1) {
			Double peso = Teclado.lerDouble("Peso");
			int estoque= Teclado.lerInteiro("estoque");
			
			livrofisico = new LivroFisico(titulo,autor,preco,peso,estoque);
		} if(tipoLivro == 2) {
			Double tamanho = Teclado.lerDouble("tamanho");
			String formato= Teclado.lerString("formato");
		ebook  = new Ebook(titulo,autor,preco,tamanho,formato);
		System.out.println("AQUI PASSOU");
		}
		
		
		for (int i = 0; i < listaLivro.length; i++) {
			if(listaLivro[i] == null) {
				listaLivro[i] =(livrofisico== null) ?  ebook:livrofisico ;
				System.out.println("Livro cadastrado");
				break;
				
			}
		}
		
		}catch(PrecoInvalidoException E) {
			 System.out.println("Erro: " + E.getMessage());
		}
	}
	
	/*public static void alterar() {
		String modelo = Teclado.lerString("Informe o modelo:");
		
		for (int i = 0; i < listaLivro.length; i++) {
			if(listaLivro[i] != null && listaLivro[i].getModelo().equals(modelo)) {
				String marca = Teclado.lerString("Nova marca:");
				int ano = Teclado.lerInteiro("Novo ano:");
				Double preco = Teclado.lerDouble("Novo preco:");
				
				if(listaLivro[i] instanceof Carro) {
					int numeroDePortas = Teclado.lerInteiro("Novo numeroDePortas:");
					String tipoDeCombustivel = Teclado.lerString("Novo tipoDeCombustivel:");
					listaLivro[i] = new Carro(marca,modelo,ano,preco,numeroDePortas,tipoDeCombustivel);
				} else {
					//Moto
					int cilindradas = Teclado.lerInteiro("Nova cilindradas:");
					listaLivro[i] = new Moto(marca,modelo,ano,preco,cilindradas);
				}
			}
		}
	}
	*/
	public static void vender() {
		String titulo = Teclado.lerString("Informe o titulo");
		
		for (int i = 0; i < listaLivro.length; i++) {
			if( listaLivro[i].getTitulo().equals(titulo)&&listaLivro[i] instanceof LivroFisico ) {
				LivroFisico livro ;
				livro= (LivroFisico)listaLivro[i];
				livro.vender();
			break;
			}else {
				Ebook livro;
				livro=(Ebook)listaLivro[i];
				livro.vender();
				
			}
			
		}
	}
	public static void consultar() {
		for (int i = 0; i < listaLivro.length; i++) {
			if(listaLivro[i] != null) {
				System.out.println(listaLivro[i].toString());
			}
		}
	}
	

}
