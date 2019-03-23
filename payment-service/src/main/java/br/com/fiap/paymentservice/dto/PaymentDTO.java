package br.com.fiap.paymentservice.dto;

import java.time.YearMonth;

public class PaymentDTO {

	private Long idTransacao;
	private Long numeroCartao;
	private YearMonth validadeCartao;
	private String bandeira;

	public Long getIdTransacao() {
		return idTransacao;
	}

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public YearMonth getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(YearMonth validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public void setIdTransacao(Long idTransacao) {
		this.idTransacao = idTransacao;
	}

}
