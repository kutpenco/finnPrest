package br.com.digitalhouse.finnprest.model;

import java.time.LocalDate;

public class Proposta {

	
	private Integer id ;
	private Double valor;
	private Double taxaJuros;
	private Integer qtdadeParcelas;		
	private LocalDate dataContratacao;

	private Cliente cliente;

	public Proposta(Double valor, Double taxaJuros, Integer qtdadeParcelas, LocalDate dataContratacao,
			Cliente cliente) {
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.qtdadeParcelas = qtdadeParcelas;
		this.dataContratacao = dataContratacao;
		this.cliente = cliente;
	}
	
	public Integer getId() {
		return id;
	}

	public Double getValor() {
		return valor;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public Integer getQtdadeParcelas() {
		return qtdadeParcelas;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	
	
}
