package br.com.livraria.produtos;
import br.com.livraria.externos.*;

public class Livros {

	public static void main(String[] args) {
		
	Autor a1 = new Autor("22344566789");
	Editora e1 = new Editora("EDITORA INTRINSECA LTDA.", "05.660.045/0003-78");
	
	a1.setNome("Holly Jackson");
	a1.setEmail("hollyjackson@gmail.com");
	e1.setNomeFantasia("Intrínseca");
	
	Livro l1 = new Livro("978-65-5560-490-0", a1, e1);

	l1.setNome ("Manual de Assassinato para Boas Garotas");
	l1.setDescricao("Quando alguem pergunta o que aconteceu com Andie Bell, as \npessoas daqui respondem, sem hesitar: 'Ela  foi assassinada por Sal Singh.");
	l1.setValor(38.50);
	l1.setDesconto(10);
	
	l1.exibirDadosDoLivro();
	
	}

}
