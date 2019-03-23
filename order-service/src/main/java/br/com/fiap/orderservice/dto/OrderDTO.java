package br.com.fiap.orderservice.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrderDTO {

	private Long idPedido;

	private String email;
	private String nomeCompleto;
	private String shippingAddress;
	private String descricaoItemPedido;
	private int quantidadedeItensPedido;
	private BigDecimal precoUnitarioItem;
	private BigDecimal totalPagamento;
	private String formaPagamento;
	private LocalDate dataPedido;
	private String statusPedido;

	private String idTransacao;
	private String numeroCartao;
	private String validadeCartao;
	private String bandeira;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getDescricaoItemPedido() {
		return descricaoItemPedido;
	}

	public void setDescricaoItemPedido(String descricaoItemPedido) {
		this.descricaoItemPedido = descricaoItemPedido;
	}

	public int getQuantidadedeItensPedido() {
		return quantidadedeItensPedido;
	}

	public void setQuantidadedeItensPedido(int quantidadedeItensPedido) {
		this.quantidadedeItensPedido = quantidadedeItensPedido;
	}

	public BigDecimal getPrecoUnitarioItem() {
		return precoUnitarioItem;
	}

	public void setPrecoUnitarioItem(BigDecimal precoUnitarioItem) {
		this.precoUnitarioItem = precoUnitarioItem;
	}

	public BigDecimal getTotalPagamento() {
		return totalPagamento;
	}

	public void setTotalPagamento(BigDecimal totalPagamento) {
		this.totalPagamento = totalPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = LocalDate.now();
		this.dataPedido.parse(dataPedido, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

}
