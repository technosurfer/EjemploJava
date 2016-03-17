package com.davidperez.vehiculo;

import java.sql.SQLException;
import java.sql.Statement;

import com.davidperez.basedatos.BaseDatos;

public class TaxiCRUD {
	
	private final String TIPO = "1";
	
	public void insertar(Taxi taxi) throws SQLException{
		String query = "";
		Statement sentencia = null;
				
		query = "INSERT INTO vehiculo "
				+ "(matricula,marca,modelo,anio,id_tipo_vehiculo) "
			    + "VALUES ('"+taxi.getMatricula()+"','"+taxi.getMarca()+"',"
			    		+ "'"+taxi.getModelo()+"','"+taxi.getAño()+"','"+TIPO+"')";
		
		BaseDatos baseDatos = new BaseDatos();
		sentencia = baseDatos.conectar().createStatement();
		if (sentencia.execute(query)){
			System.out.println("Registro se insertó correctamente");
		}
		else{
			System.out.println("Registro no se pudo insertar");
		}
		
		baseDatos.desconectar();
	}
	
	
	public void editar(Taxi taxi){
		
	}
	
	public void eliminar(Taxi taxi){
		
	}


}
