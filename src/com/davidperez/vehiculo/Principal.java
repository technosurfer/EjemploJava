package com.davidperez.vehiculo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.davidperez.basedatos.BaseDatos;

public class Principal {

	public static void main(String[] args) {
		
		
		/*Vehiculo miVehiculo = new Vehiculo("AAA123","Hyundai");
		//miVehiculo.setMarca("Hyundai");
		miVehiculo.setModelo("i10");
		miVehiculo.setAño(2014);
		//miVehiculo.setMatricula("AAA123");
		
		ArrayList <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(miVehiculo);
		vehiculos.add(new Vehiculo("CCC123", "Mercedes Benz", "s10", 2014));
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.getMatricula());
			System.out.println(vehiculo.getMarca());
			System.out.println(vehiculo.getModelo());
			System.out.println(vehiculo.getAño());
		}*/
		
		//BaseDatos baseDatos = new BaseDatos();
		//baseDatos.conectar();
		
		/*Taxi taxi = new Taxi("AAA123","Hyundai","i10",2014);
		TaxiCRUD taxiCRUD = new TaxiCRUD();
		try {
			taxiCRUD.insertar(taxi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}*/
		
		int numero = 1932;
		int suma=0;
		int dividendo = numero;
		int divisor = 10;
		boolean fin = false;
		while (!fin){
			suma = 0;
			while (dividendo != 0){
				suma += dividendo % divisor;
				dividendo = dividendo / divisor;
			}
			dividendo = suma;
			fin = suma < 10;

		}
				
		System.out.println(suma);
		
		

	}

}
