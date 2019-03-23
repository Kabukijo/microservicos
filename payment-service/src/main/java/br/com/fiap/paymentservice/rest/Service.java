package br.com.fiap.paymentservice.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.paymentservice.business.PaymentBusiness;
import br.com.fiap.paymentservice.dto.PaymentDTO;

@RestController
public class Service {
	
	@Autowired
	PaymentBusiness orderBusiness;
	
	@RequestMapping(value="findById/{idTransacao}", method = RequestMethod.GET)
	public PaymentDTO findById(@PathVariable(value="idTransacao") Long idTransacao) {
		return orderBusiness.findById(idTransacao);
	}
	
	@RequestMapping(value="save", method = RequestMethod.POST)
	public String save(@Valid @RequestBody PaymentDTO payment) {
		return orderBusiness.save(payment);
	}
	
	@RequestMapping(value="update", method = RequestMethod.PUT)
	public void update(@Valid @RequestBody PaymentDTO payment) {
		orderBusiness.update(payment);
	}
	
	@RequestMapping(value="delete", method = RequestMethod.DELETE)
	public void delete(@Valid @RequestBody PaymentDTO payment) {
		orderBusiness.delete(payment);
	}
}
