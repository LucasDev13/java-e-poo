package br.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		int n, p;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("PAR");
		}else {
			if(n % 2 != 0)
			System.out.println("IMPAR");
		}
		
		
	}

}
