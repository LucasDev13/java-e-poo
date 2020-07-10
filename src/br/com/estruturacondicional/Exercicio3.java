package br.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/**
		 *	Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
			Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
			ordem crescente ou decrescente.
			
			m   = n  . k
			110 = 11 · 10
			
		 */
		
		int m, n;
		int multi = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		m = sc.nextInt();
		
		System.out.println("Informe o segundo numero");
		n = sc.nextInt();
		
		System.out.println("vai comecar!");
		
		for(int i = 1; i <= m; i++) {
			multi = n * i;//multiplicando pelo resultado da multiplicação, e nao pode.
			if(multi == m) {
				System.out.println("Sao Multiplos!" + multi);
			}else {
				System.out.println("Nao sao	Multiplos!" + multi);
			}
		}
		
		
		//nao tenho certeza se esta correto.		
//		if( A % B == 0 || B % A == 0) {
//			System.out.println("sao multiplos.");
//		}else {
//			System.out.println("nao sao multiplos.");
//		}
		
		
		
		
		
		//System.out.println(multi);
	}
	
}
