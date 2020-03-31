package br.com.variaveisecontrolefluxo;

import java.util.Scanner;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a idade:");
		
		/**
		 * declaração de variável e atribuição de valores 
		 */
		int idade = scan.nextInt();
		//idade = 27;
		
		System.out.println(idade);
		
		/**
		 * utilizando os operadores matemáticos
		 */
		int quatro = 2 + 2; //declaração da varialvel e atribuição do valor junto com a operação
		int tres = 5 - 3;
		int oito = 4 * 2;
		int dezesseis = 64 / 4;
		int um = 5 % 2;//utilização do operador % que pega o resto da divisão
				
		System.out.println(quatro + ", " + tres + ", " + oito + ", " + dezesseis + ", " + um + " .");
		
		/**
		 * Soma idade do ano que vem
		 */
		
		int idadeNoAnoQueVem;
		idadeNoAnoQueVem = idade + 1;
		
		System.out.println(idadeNoAnoQueVem);
		
		/**
		 * Trabalhando com o pi
		 */
		
		double pi = 3.14;
		double x = 5 * 10;
		double resultadoPi = pi * x;
		
		System.out.println(pi);
		System.out.println(resultadoPi);
		
		/**
		 * Utilizando boolean
		 */
		
		int idadex = 30;
		boolean menorDeIdade = idade < 18;
		System.out.println(menorDeIdade);
		
		/**
		 * Utilizando o char
		 */
		
		char letra = 'a';
		System.out.println(letra);
		
		
		/**
		 * tipos primitivos e valores
		 */
		System.out.println("++++++++++++++++++++++++");
		
		int i = 4;
		System.out.println("valore do i: " + i);
		int j = i;
		i = i +1;
		System.out.println("valore do j: " + j);
		System.out.println("valore do i + 1: " + i);
		
	}
}
