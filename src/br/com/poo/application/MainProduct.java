package br.com.poo.application;

import java.util.Scanner;

import br.com.poo.entities.Product;

public class MainProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
//		System.out.print("Estoque maximo:");
//		p.estoqueMaximo = sc.nextInt();
//		System.out.print("Estoque minimo:");
//		p.estoqueMinimo = sc.nextInt();
		
		System.out.println("Informe o nome do produto: ");
		String nomeProduto = sc.next();
		
		System.out.println("Informe o valor do produto: ");
		double preco = sc.nextDouble();
		
		System.out.println("Informe a quantidade inserida no estoque: ");
		int quantidade = sc.nextInt();
		
		Product p = new Product(nomeProduto, preco, quantidade);//foi utilizado o construtor da classe Produto, onde foi passado por parametro os valores dos atributos
				
		System.out.println();
		System.out.println(p);		
		
		System.out.println("Informe a quantidade inserida no estoque: ");
		//p.quantidade = sc.nextInt();
		int quantity = sc.nextInt();
		//p.addProdutos(quantity);//essa linha faz a atualização da quantidade em estoque do objeto product
		
		
		System.out.println("update dos " + p);
		
		
		System.out.print("tirar produto do estoque: ");
		quantity = sc.nextInt();
		p.removeProdutos(quantity);
		
		System.out.println();
		System.out.println(p);
		
		
		//System.out.println(p + " -- " + p.totalValorEmEstoque());
		
		//System.out.println("Adicionar mais produto: ");
		//p.quantidade = sc.nextInt(); aqui temos uma inserção normal de valores no atributo (seria somente jogar o valor para detro do atributo)
		
		//aqui temos uma outra forma de inserir mais valor ao atributo por meio de um método que soma o que já tem dentro do atributo com o que esta recebendo pelo sc.nextInt();
		//p.addProdutos(sc.nextInt());
		
		//System.out.println("quantidade: " + p.quantidade);//aqui temos uma forma de mostrar somento a quantidade de produtos do estoque
		
//		System.out.print("tirar produto do estoque: ");
//		p.removeProdutos(sc.nextInt());
//		
//		System.out.println("quantidade: " + p.quantidade);
//		
//		System.out.print(p + " --- valor total em estoque: " + p.totalValorEmEstoque());//aqui ira mostrar o objeto com todos os seus atributos
		

	}

}
