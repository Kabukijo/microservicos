package br.com.fiap.paymentservice.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.paymentservice.dto.PaymentDTO;

@Component
public class PaymentBusiness {

	private List<PaymentDTO> paymentList = new ArrayList<>();

	public PaymentDTO findById(Long idTransacao) {
		for (PaymentDTO payment : paymentList) {
			if (payment.getIdTransacao() == idTransacao)
				return payment;
		}
		return null;
	}

	public String save(PaymentDTO payment) {
		paymentList.add(payment);
		return getUrl(payment.getIdTransacao());
	}

	public void update(PaymentDTO payment) {
		for (int i = 0; i < paymentList.size(); i++) {
			if (paymentList.get(i).getIdTransacao() == payment.getIdTransacao()) {
				paymentList.set(i, payment);
			}
		}
	}

	public void delete(PaymentDTO payment) {
		for (int i = 0; i < paymentList.size(); i++) {
			if (paymentList.get(i).getIdTransacao() == payment.getIdTransacao()) {
				paymentList.remove(i);
			}
		}
	}
	
	private String getUrl(Long idPedido) {
		return "http://localhost:8080/findById/" + idPedido;
	}
}
