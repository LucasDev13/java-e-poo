package br.com.poo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.poo.utils.CalculoExemploStatic;

public class MainExemploStatic {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		
		double c = circunferencia(radius);
		double v = volume(radius);
		
		
		System.out.printf("Circunferencia: %.2f%n", c );
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", CalculoExemploStatic.PI);

		sc.close();
		
	}
	
	public static double circunferencia(double radius) {
		return 2.0 * CalculoExemploStatic.PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * CalculoExemploStatic.PI * radius * radius * radius / 3.0;
	}

}
