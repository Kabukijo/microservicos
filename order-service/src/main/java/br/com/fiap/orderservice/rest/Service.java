package br.com.fiap.orderservice.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.orderservice.business.OrderBusiness;
import br.com.fiap.orderservice.dto.OrderDTO;
import br.com.fiap.orderservice.exception.specifics.InvalidOrderException;
import br.com.fiap.orderservice.exception.specifics.OrderNotFoundException;

@RestController
public class Service {

	@Autowired
	OrderBusiness orderBusiness;

	@RequestMapping(value = "findById/{idPedido}", method = RequestMethod.GET)
	public OrderDTO findById(@PathVariable(value = "idPedido") Long idPedido) {

		OrderDTO order = orderBusiness.findById(idPedido);
		if (order == null) {
			throw new OrderNotFoundException(String.valueOf(idPedido));
		}
		return order;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestBody OrderDTO order) {
		
		if (order.getIdPedido() == null) {
			throw new InvalidOrderException("Invalid Order!");
		}
		return orderBusiness.save(order);
	}

	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public String update(@Valid @RequestBody OrderDTO order) {

		if (order.getIdPedido() == null) {
			throw new InvalidOrderException("Invalid Order!");
		}
		return orderBusiness.update(order);
	}

	@RequestMapping(value = "delete/{idPedido}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "idPedido") Long idPedido) {
		orderBusiness.delete(idPedido);
	}
}
