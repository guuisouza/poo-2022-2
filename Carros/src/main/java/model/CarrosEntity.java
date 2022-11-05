package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //Dizendo que é uma entidade do banco de dados
@Table(name="carros") //Criando uma tabela no postgre

public class CarrosEntity {
	@Id //PrimaryKey
	@GeneratedValue(strategy=GenerationType.AUTO)//Campo auto incremento
	private Long id;
	@Column(name="marca")
	private String marca;
	@Column(name="modelo")
	private String modelo;
	@Column(name="ano")
	private int ano;
	@Column(name="potencia")
	private float potencia;
	
	public CarrosEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "CarrosEntity [id=" + id +
				", marca=" + marca + 
				", modelo=" + modelo + 
				", ano=" + ano + 
				", potencia=" + potencia + "]";
	}
}
