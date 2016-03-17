package com.davidperez.vehiculo;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int año;
	
	public Vehiculo(String matricula, String marca){
		super();
		this.matricula = matricula;
		this.marca = marca;
	}
	
		
	public Vehiculo(String matricula, String marca, String modelo, int año) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}



	//Seccion de getters y setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	//Metodos
	
	public void arrancar(){
		System.out.println("Arrancando");
	}
	
	public void frenar(){
		System.out.println("Frenando");
	}
	
	public void marchaAtras(){
		System.out.println("Marcha atrás");
	}
	
	
}
