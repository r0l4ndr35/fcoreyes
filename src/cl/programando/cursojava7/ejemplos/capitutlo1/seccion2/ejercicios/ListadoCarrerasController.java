package cl.programando.cursojava7.ejemplos.capitutlo1.seccion2.ejercicios;

/**
 * @author franciscoarias
 *
 */
public class ListadoCarrerasController {

	private CarreraHipico carrera1;
	private CarreraHipico carrera2;
	
	/*Contructor*/
	public ListadoCarrerasController() {
		this.carrera1=new CarreraHipico();
		this.carrera2=new CarreraHipico();
	}
	
	/*Mostramos la descripcion de ambas carrerras*/
	public void mostrarCarreras() {
		System.out.println("Carrera 1 "+this.carrera1.getDescripcion());
		System.out.println("Carrera 2 "+this.carrera2.getDescripcion());
		
	}
	
	/*Retorna el total de posiciones de ambas carrerras*/
	public int getTotalPosiciones() {
		return this.carrera1.getPosiciones() + this.carrera2.getPosiciones(); 
	}
	

}
