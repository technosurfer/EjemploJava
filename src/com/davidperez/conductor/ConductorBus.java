package com.davidperez.conductor;

import com.davidperez.vehiculo.Bus;

public class ConductorBus extends Conductor {
	
	private Bus bus;

	public ConductorBus(String nombre, String tipoLicencia, Bus bus) {
		super(nombre, tipoLicencia);
		this.setBus(bus);
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getBus().getMarca());
	}
	
	
	
	

}
