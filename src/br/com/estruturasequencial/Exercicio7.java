package br.com.estruturasequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/**
		 *	fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
			mostre:
			a) a área do triângulo retângulo que tem A por base e C por altura. area = b.h/2
			b) a área do círculo de raio C. (pi = 3.14159) area = π . r2
			c) a área do trapézio que tem A e B por bases e C por altura. area = (B + b)/2 * h , onde (b) é a base menor, (B) base maior e (h) a altura 
			d) a área do quadrado que tem lado B. area = b.h, multiplicar a medida dos dois lados.
			e) a área do retângulo que tem lados A e B. area = b.h A área do retângulo corresponde ao produto da medida da base pela altura.
		 */
		
		double a, b, c, area1, area2, area3, area4, area5;
		double pi = 3.14159;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		a = sc.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		b = sc.nextDouble();
		
		System.out.println("Informe o terceiro valor: ");
		c = sc.nextDouble();
		
		//area do triangulo
		area1 = (a * c) /2.0;
		System.out.println("area do triangulo retangulo: " + area1);
		
		//area do circulo de raio C
		area2 = pi * Math.pow(c, 2.0);
		System.out.println("area do circulo: " + area2);
		
		//area do trapezio
		area3 = (a + b) / 2.0 * c;
		System.out.println("area do trapezio: " + area3);
		
		//area do quadrado
		area4 = b * b;
		System.out.println("area do quadrado: " + area4);
		
		//area do retangulo
		area5 = a * b;
		System.out.println("area do retangulo: " + area5);
		
	}

}
