package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	List<OrderItem> listProduct = new ArrayList<>();

	public Order() {}
	
	public Order(Date moment, OrderStatus status, Client client){
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment(){
		return moment;
	}

	public void setMoment(Date moment){
		this.moment = moment;
	}

	public OrderStatus getStatus(){
		return status;
	}

	public void setStatus(OrderStatus status){
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getListProduct(){
		return listProduct;
	}

	public void addItem(OrderItem item) {
		listProduct.add(item);
	}
	
	public void removeItem(OrderItem item) {
		listProduct.remove(item);
	}
	
	public double total() {
		double sum = 0;
		
		for(OrderItem itens: listProduct) {
			sum += itens.subTotal();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");

		for(OrderItem item : listProduct) {
			sb.append(item + "\n");
		}

		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();
	}
}
