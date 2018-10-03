package cl.programando.cursojava7.ejemplos.capitutlo1.seccion2.ejercicios;

import java.sql.Date;

public class CarreraHipico {

	private String nombreCarrera;
	private Date fecha;
	public String descripcion;
	private int posiciones;
	
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPosiciones() {
		return this.posiciones;
	}
	
		
}
