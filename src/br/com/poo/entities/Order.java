package br.com.poo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.poo.entities.enums.OrderStatus;

public class Order {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;//relação de associação de "tem um" entre cliente(Client) e pedido(Order)
	private List<OrderItem> items = new ArrayList<>(); //relação de associação de "tem-vários" entre pedido(Order) e itemPedido(OrderItem)
	
	public Order() {}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	
	public void addItem(OrderItem orderItem) {
		items.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		items.remove(orderItem);
	}
	
	public Double total() {
		double sum = 0.0;
		//percorre a lista somando na variavel sum o valor dela mesmo + o que esta vindo do calculo do metodo subtotal()
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Item: ");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("total items: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
