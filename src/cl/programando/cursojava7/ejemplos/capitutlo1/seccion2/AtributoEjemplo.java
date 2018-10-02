package cl.programando.cursojava7.ejemplos.capitutlo1.seccion2;

public class AtributoEjemplo {

	private String atributo1 = "HolaAtributo";
	
	public String getAtributo1() {
		return atributo1;
	}
	
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	
	public void printVariableLocal() {
		String valorNuevo = "NuevoValor";
		
		System.out.println("Local "+valorNuevo);
	}
	
	public void printVariableGlobal() {
		
		System.out.println("Local "+this.atributo1);
	}
	
	
}
