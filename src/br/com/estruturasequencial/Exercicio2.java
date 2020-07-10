package br.com.estruturasequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa.*/
		int var1;
		int var2;
		int rest;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		var1 = scanner.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		var2 = scanner.nextInt();
		
		rest = var1 + var2;
		
		System.out.println("A soma é: " + rest);
		
		scanner.close();

	}

}
