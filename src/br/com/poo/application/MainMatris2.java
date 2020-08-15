package br.com.poo.application;

import java.util.Scanner;

public class MainMatris2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//pegar o tamnho da linha e colunas
		System.out.println("Quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.println("Quantidade de colunas: ");
		int n = sc.nextInt();
		
		//instanciar uma matris int
		int[][] mat = new int [m][n];
		
		//ler a matris nas linhas e coluna para inserir os valores nela
		
		System.out.println("Informe os numero da matris: ");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//mostrar o todos os elementos da matris
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j] + " ");
			}
		}
		
		System.out.println("Informe um numero da matris: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]==x) {
					//mostrar a posicao do x
					System.out.println("Position: " + i + ", " + j + ":");
					if(j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j<mat.length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i<mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();

	}

}
