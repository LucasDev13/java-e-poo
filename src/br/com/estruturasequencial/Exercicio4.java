package br.com.estruturasequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, produto;
		
		
		System.out.println("Informe o primeiro numero: ");
		a = sc.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("Informe o terceiro numero: ");
		c = sc.nextInt();
		
		System.out.println("Informe o quarto numero: ");
		d = sc.nextInt();
		
		produto = a * b - c * d;
		
		System.out.println("A diferença do produto AB pelo produto CD é: " + produto);
	}

}
