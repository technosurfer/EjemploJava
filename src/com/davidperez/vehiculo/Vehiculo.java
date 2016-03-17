package com.davidperez.vehiculo;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int a�o;
	
	public Vehiculo(String matricula, String marca){
		super();
		this.matricula = matricula;
		this.marca = marca;
	}
	
		
	public Vehiculo(String matricula, String marca, String modelo, int a�o) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	//Metodos
	
	public void arrancar(){
		System.out.println("Arrancando");
	}
	
	public void frenar(){
		System.out.println("Frenando");
	}
	
	public void marchaAtras(){
		System.out.println("Marcha atr�s");
	}
	
	
}
