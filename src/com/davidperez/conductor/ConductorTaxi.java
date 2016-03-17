package com.davidperez.conductor;

import com.davidperez.vehiculo.Taxi;

public class ConductorTaxi extends Conductor{
	
	private Taxi taxi;

	public ConductorTaxi(String nombre, String tipoLicencia, Taxi taxi) {
		super(nombre, tipoLicencia);
		this.setTaxi(taxi);
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getTaxi().getMatricula());
	}
	
	
	
	
	

}
