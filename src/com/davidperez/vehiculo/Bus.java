package com.davidperez.vehiculo;

import java.util.ArrayList;

public class Bus extends Vehiculo{
	
	private ArrayList<String> estaciones;

	
	public Bus(String matricula, String marca, String modelo, int a�o) {
		super(matricula, marca, modelo, a�o);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(ArrayList<String> estaciones) {
		this.estaciones = estaciones;
	}
	

}
