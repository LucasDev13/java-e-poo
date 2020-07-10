package br.com.poo.utils;

public class CalculoExemploStatic {
	
	//declarando um membro estatico e utilizando o a palavra final(indica que o valor nao vai mudar)
		//o padrao para nomear constantes é sempre com letra maiuscula
		public static final double PI = 3.14159;
	
	public static double circunferencia(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
