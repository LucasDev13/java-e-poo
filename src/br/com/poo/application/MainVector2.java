package br.com.poo.application;

import java.util.Scanner;

import br.com.poo.entities.Product;

public class MainVector2 {

	public static void main(String[] args) {
		// exemplo de vetor tipo classe
		
		Scanner sc = new Scanner(System.in);
		
		//criar uma varial que vai ser utilizada para definir o tamanho do vetor
		System.out.print("numero do indice: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];//definindo um vetor do tipo classe
		Product p = new Product();
		//percorrer o vetor guardando os valore de nome, preco do produto
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("preco: ");
			double price = sc.nextDouble();
			System.out.print("quantidade: ");
			int quant = sc.nextInt();
			//e instanciado o produto passando por parametro para o construtor de Product, onde o vetor ira receber esses valores e guardar nas posições
			//vect[i]  = new Product(name, price);
			
			p.addProdutos(vect, i, quant, name, price);//chama o método para adicionar os produtos.
			
		}
		
		
		//leitura do for
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Vetor: " + vect[i]);
		}
		
		
		
		//somar o valores a fazer a media.
		//double sum = 0.0;
		///percorrer o vetor lendo os dados 
		//for(int i = 0; i < vect.length; i++) {
		//	sum += vect[i].getPreco();
		//}("");
		
		//pega a soma e divide pelo tamanho do vetor utilizando o 'vect.length'
		//double avg = sum / vect.length;
		
	//	System.out.printf("average price= %.2f%n", avg);

	}

}
