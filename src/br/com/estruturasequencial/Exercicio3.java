package br.com.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio 2
		Considere o valor de π = 3.14159*/
		
		double area;
		double pi;//sera informado pelo usuario
		double raio;
		double r;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo: ");
		r = sc.nextDouble();
		
		System.out.println("Informe o numero pi: ");
		pi = sc.nextDouble();
		
		area = pi * (raio = Math.pow(r, 2.0));
		
		System.out.printf("A área deste círculo é: %.4f", area);

		sc.close();
	}

}
