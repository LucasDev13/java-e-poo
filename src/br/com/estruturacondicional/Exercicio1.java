package br.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		int var1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor negativo ou positivo: ");
		var1 = sc.nextInt();
		
		if (var1 < 0) {
			System.out.println("NEGATIVO " + var1);
		}else {
			System.out.println("POSITIVO " + var1);
		}

	}

}
