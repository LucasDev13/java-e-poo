package br.com.aula14;

import java.util.Scanner;

public class IfeElse {
	public static void main(String[] args) {
		//Sintaxe do if e else 
		
	/**
		if (condicaoBooleana) {
			//codigo
		}else {
			//codigo
		}*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Informe o mes: ");
		int mes = scanner.nextInt();
		
		
		
		if (idade < 18) {
			System.out.println("Não pode entrar");
		}
		
		//Utilizando o else
		//int idades = 18;
		if (idade < 18) {
			System.out.println("Não pode entrar");
		} else {
			System.out.println("Pode entrar");
		}
		
		//utilizando os operadores lógicos
		boolean amigoDoDono = true;
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("Não pode entrar.");
		} else {
			System.out.println("Pode entrar.");
		}
		
		//utilizando o operador de negação !
		if (idade < 18 && !amigoDoDono) {
			System.out.println("Não pode entrar.");
		} else {
			System.out.println("Pode entrar.");
		}
		
		//comparando duas variáveis com o operador ==
		
		if (mes == 1) {
			System.out.println("Você deveria estar de férias");
		}else {
			System.out.println("volte a trabalhar.");
		}
		
		/**
		 * EXEMPLO DOS OVOS E DAS BATATAS
		 */
		
		System.out.println("EXEMPLO DOS OVOS E DAS BATATAS");
		
		
		boolean temBatata = false;
		int ovos = 6;
		
		//pode trocar o valor da variavel temBatata para visualizar os resultados
		if(temBatata) {
			ovos = 9;
		}
		
		System.out.println("Compre " + ovos + " ovos.");
		
		
		/**
		 * IF E ELSE ANINHADOS
		 */
		
		//exercicio de valor de um item
		//item < 10 == barato
		//item > 10 && <=15 == pode pedir desconto
		//item >15 && <=17 == item muito caro
		//item >17 == pode procurar outro produto
		
		Scanner scaner = new Scanner(System.in);
		System.out.println("Infome o valor do item: ");
		int valor = scaner.nextInt();
		
		if(valor <= 10) {
			System.out.println("O item esta barato.");
		}else if(valor > 10 && valor <= 15) {
			System.out.println("Pode pedir um desconto.");
		}else if(valor > 15 && valor <= 17) {
			System.out.println("O item esta muito caro.");
		}else if(valor > 17) {
			System.out.println("Pode procurar outro item.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
