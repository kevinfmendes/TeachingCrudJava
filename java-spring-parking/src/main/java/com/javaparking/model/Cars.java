package com.javaparking.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "cars")
public class Cars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
    
	@Column(name = "ano_fabricacao")
	private LocalDate anoFabricacao;
	
	@Column(name = "ano_modelo")
    private LocalDate anoModelo;
	
	@Column(name = "valor")
    private Double valor;
	
	@Column(name = "descricao")
    private String descricao;
    
    public Cars(){
    	
    }
    
	public Cars(String marca, String modelo, LocalDate anoFabricacao, LocalDate anoModelo, Double valor,
			String descricao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.descricao = descricao;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDate getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(LocalDate anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public LocalDate getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(LocalDate anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    
    
}
