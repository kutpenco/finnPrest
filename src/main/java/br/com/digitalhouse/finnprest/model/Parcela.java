package br.com.digitalhouse.finnprest.model;

import java.time.LocalDate;

public class Parcela {
	
	private Integer id;
	private Double valor;
	private String numero;
	private LocalDate dataParcela;
	private Byte status;
	private Integer proposta_id;
	
	public Parcela(Integer id, Double valor, String numero, LocalDate dataParcela, Byte status, Integer proposta_id) {
		this.id = id;
		this.valor = valor;
		this.numero = numero;
		this.dataParcela = dataParcela;
		this.status = status;
		this.proposta_id = proposta_id;
	}
	
	public Integer getId() {
		return id;
	}
	public Double getValor() {
		return valor;
	}
	public String getNumero() {
		return numero;
	}
	public LocalDate getDataParcela() {
		return dataParcela;
	}
	public Byte getStatus() {
		return status;
	}
	public Integer getProposta_id() {
		return proposta_id;
	}
	
	
}
