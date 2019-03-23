package br.com.fiap.orderservice.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.orderservice.dto.OrderDTO;

@Component
public class OrderBusiness {

	private List<OrderDTO> orderList = new ArrayList<>();

	public OrderDTO findById(Long idPedido) {
		for (OrderDTO order : orderList) {
			if (order.getIdPedido() == idPedido)
				return order;
		}
		return null;
	}

	public String save(OrderDTO order) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getIdPedido() == order.getIdPedido()) {
				return null;
			}
		}
		orderList.add(order);
		order.setIdPedido(Long.valueOf(orderList.size()));
		return getUrl(order.getIdPedido());
	}

	public String update(OrderDTO order) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getIdPedido() == order.getIdPedido()) {
				orderList.set(i, order);
				return getUrl(order.getIdPedido());
			}
		}
		return null;
	}

	public void delete(Long idPedido) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getIdPedido() == idPedido) {
				orderList.remove(i);
			}
		}
	}
	
	private String getUrl(Long idPedido) {
		return "http://localhost:8080/findById/" + idPedido;
	}
}
