package br.com.estruturasequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/**
		 *	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
			código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
			
			neste exercicio nao esta se considerando a utilização de estruturas condicionais.
		 */
		
		int codigo1;
		int codigo2;
		int numPeca1;
		int numPeca2;
		double valorUni1;
		double valorUni2;
		double res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo da primeira peça: ");
		codigo1 = sc.nextInt();
		
		System.out.println("informe o numero de pecas a ser comprada: ");
		numPeca1 = sc.nextInt();
		
		System.out.println("informe o valor da peca: ");
		valorUni1 = sc.nextDouble();
		
		System.out.println("Informe o codigo da segunda peça: ");
		codigo2 = sc.nextInt();
		
		System.out.println("informe o numero de pecas a ser comprada: ");
		numPeca2 = sc.nextInt();
		
		System.out.println("informe o valor da peca: ");
		valorUni2 = sc.nextDouble();
	
		valorUni2 += valorUni2;
		
		res = valorUni1 + valorUni2;
		
		System.out.println("Valor a se pagar: R$" + res);
		
		sc.close();
	}
}
