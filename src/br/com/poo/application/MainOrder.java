package br.com.poo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.poo.entities.Client;
import br.com.poo.entities.Order;
import br.com.poo.entities.OrderItem;
import br.com.poo.entities.Product;
import br.com.poo.entities.enums.OrderStatus;

public class MainOrder {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//vai pegar os dados do cliente por primeiro
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (dd/MM/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		//instanciar a classe client e passar os dados capturados
		Client client = new Client(name, email, birthDate);//passado por parametro os dados para o construtor da classe
		
		//pegar os dados do pedido
		System.out.println("Enter order date: ");
		System.out.println("Status: ");
		//instanciar a classe enum de OrderItem
		OrderStatus status = OrderStatus.valueOf(sc.next());//captura o valor para o enum
		
		//instanciar um unico pedido	
		Order order = new Order(new Date(), status, client);
		
		//informar quantos items ira neste pedidos
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		
		//fazer um for para pegar os dados dos itens com base no n passado
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.println("Product name: ");
			sc.nextLine();//criado para comsumir a quebra de linha do nextInt()
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			
			//instancia o produto e passa os valores capturados
			Product product = new Product(productName, productPrice);
			
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);//adiciona na lista do pedido o item de pedido
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
		
		sc.close();

	}

}
