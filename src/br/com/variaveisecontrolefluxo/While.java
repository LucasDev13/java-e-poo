package br.com.variaveisecontrolefluxo;

public class While {
	public static void main(String[] args) {
		
		//utilizando o while
		int idade = 12;
		while(idade < 18) {
			System.out.println(idade);
			idade = idade +1;
		}
		
		int i = 0;
		while(i < 10) {
			System.out.println("numero: " + i);
			i = i + 1;
		}
		
		
		//EXERCICIOS DE WHILE
		
		//Pós incremento
		int x = 100;
		
		System.out.println("Valor1: " + x++);
		System.out.println("Valor2: " + x);
		
		//pré incremento
		
		int y = 200;
		System.out.println("Valor3: " + y);
		System.out.println("Valor4: " + ++y);
	}
}
