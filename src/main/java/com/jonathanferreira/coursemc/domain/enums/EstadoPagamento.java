package com.jonathanferreira.coursemc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1,"Pendente"),
	QUITADO(2, "Quiitado"),
	CANCELADO(3, "Cancelado");

	
	private int cod;
	private String decricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.decricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDecricao() {
		return decricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for (EstadoPagamento x :EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido:" + cod);
	}

	
}
