package br.com.poo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poo.entities.Funcionario;

public class MainFuncionario {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero de funcionarios a ser cadastrado");
		int n = sc.nextInt();

		List<Funcionario> funcis = new ArrayList<>();
		Funcionario fun = null;

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Fucionario #" + (i + 1) + ": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			//laço de repetição para não incluir um id que já esteja na lista
			while(hasId(funcis, id)) {
				System.out.println("Id already taken! try again: ");
				id = sc.nextInt();//vai ler o id 
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			fun = new Funcionario(id, nome, salario);//instancia o objeto passando os argumento para o construtor.
			
			funcis.add(fun);//esse processo a cada interação do for será adicionado o objeto fun na lista. 

		}
		
		System.out.println();
		System.out.println("Digite o id do funcionario que ira ganhar o aumento de salario: ");
		int idSalary = sc.nextInt();
		Integer pos = fun.position(funcis, idSalary);
		
		//Funcionario fun = funcis.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if(fun == null) {
			System.out.println("This id not exist!");
		}else {
			System.out.println("Enter the percetage: ");
			double percent = sc.nextDouble();
			fun.aumento(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Funcionario f : funcis) {
			System.out.println(f);
		}
		
		
		sc.close();
	}
	
	//funçao utilizada para procurar o id na lista.
//	public static Integer position(List<Funcionario> list, int id) {
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).getId() == id) {
//				return i;
//			}
//		}
//		return null;
//	}
	
	//funçao para procurar o id utilizando lambda
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}

}
