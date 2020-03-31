package br.com.exercicios;

import java.util.Scanner;

public class ImprimeNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o numero 150:");
		int num = scanner.nextInt();
		
		for(int i = num; i <= 300; i++) {
			System.out.println("Numero: " + i);
		}
	}
}
