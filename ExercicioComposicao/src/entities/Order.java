package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private LocalDate momento;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(LocalDate momento, OrderStatus status) {
		this.momento = momento;
		this.status = status;
	}

	public LocalDate getMomento() {
		return momento;
	}

	public void setMomento(LocalDate momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);		
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);		
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem c : items) {
			total += c.subTotal();
		}
		return total;
	}
	
	
	
	

}
