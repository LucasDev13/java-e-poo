package br.com.poo.application;

import java.util.Scanner;

public class MainVector {

	public static void main(String[] args) {
		
		//exemplo de uso do vetor com tipo valor.
		
		Scanner sc = new Scanner(System.in);
		
		//criar um numero que vai definir o tamanho do vetor
		int n =  sc.nextInt();
		
		//instanciar o vetor com o numero do tamanho do vetor
		double[] vect = new double[n];
		
		//fazer um for para percorrer todo vetor guardando os valores
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}

		//somar os numeros
		//precisa percorrer o vetor lendo os valores e somando
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		//Fazer a media entre eles
		double avg = sum / vect.length;
		
		System.out.printf("average height; %.2f%n ", avg);
	}

}
