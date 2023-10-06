package br.com.livraria.produtos;
import br.com.livraria.externos.*;

public class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private double valorComDesconto;
	private String isbn;
	private Autor autor;
	private Editora editora;
	private double desconto;
	

	public Livro(String isbn, Autor autor, Editora editora) {
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorComDesconto() {
		return valorComDesconto;
	}
	public Autor getAutor() {
		return autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String getIsbn() {
		return isbn;
	}
	
	private boolean aplicaDescontoDe(double desconto){
		if(desconto > 20.0 || desconto <= 0)
			return false;
		else
			return true;
	}
	
	private double calcularDesconto(double valor, double desconto) {
		double valorDesconto = 0;
		if(aplicaDescontoDe(desconto)) {
			valorDesconto = valor-(valor*desconto/100);
		}else {
			System.out.println("Sem desconto");
		}
		return valorDesconto;
	}
	
	public void exibirDadosDoLivro() {
		System.out.println("");
		System.out.println("Livro: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
		if(aplicaDescontoDe(desconto)) {
			System.out.println("Valor com desconto: R$" + calcularDesconto(valor, desconto));
		}else {
		}
		System.out.println("ISBN: " + isbn);
		
		System.out.println("");
		autor.exibirDadosDoAutor();
		
		System.out.println("");
		editora.exibirDadosDaEditora();
		
	}
	
}
