package com.jonathanferreira.coursemc.domain;

import javax.persistence.Entity;

import com.jonathanferreira.coursemc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeDeParcelas;
	
	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numDeParcelas) {
		super(id, estado, pedido);
		this.numeDeParcelas = numDeParcelas;
	}

	public Integer getNumeDeParcelas() {
		return numeDeParcelas;
	}

	public void setNumeDeParcelas(Integer numeDeParcelas) {
		this.numeDeParcelas = numeDeParcelas;
	}
}
