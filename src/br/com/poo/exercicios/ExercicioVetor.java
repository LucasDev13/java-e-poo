package br.com.poo.exercicios;

import java.util.Scanner;

import br.com.poo.entities.Estudante;

public class ExercicioVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();//guarda o tamanho do vetor
		Estudante[] vect = new Estudante[10];// a variavel vect recebe a instancia do novo vetor de estudante

		for (int i = 0; i < vect.length; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			if(i != n) {
				vect[n] = new Estudante(nome, email);
			}else {
				System.out.println("são iguais!");
			}
			
		}

	}

}
