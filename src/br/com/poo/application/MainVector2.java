package br.com.poo.application;

import java.util.Scanner;

import br.com.poo.entities.Product;

public class MainVector2 {

	public static void main(String[] args) {
		// exemplo de vetor tipo classe
		
		Scanner sc = new Scanner(System.in);
		
		//criar uma varial que vai ser utilizada para definir o tamanho do vetor
		int n = sc.nextInt();
		Product[] vect = new Product[n];//definindo um vetor do tipo classe
		
		//percorrer o vetor guardando os valore de nome, preco do produto
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			//e instanciado o produto passando por parametro para o construtor de Product, onde o vetor ira receber esses valores e guardar nas posições
			vect[i]  = new Product(name, price);
		}
		
		//somar o valores a fazer a media.
		double sum = 0.0;
		//percorrer o vetor lendo os dados 
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		
		//pega a soma e divide pelo tamanho do vetor utilizando o 'vect.length'
		double avg = sum / vect.length;
		
		System.out.printf("average price= %.2f%n", avg);

	}

}
