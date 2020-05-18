package Sancho_Montayies_Manuel;


public class Pruebas {
	private String nombre_prueba;
	private double tiempo;

	public Pruebas() {

	}

	public Pruebas(String nombre_prueba, double tiempo) {
		super();
		this.nombre_prueba = nombre_prueba;
		this.tiempo = tiempo;
	}

	public String getNombre_prueba() {
		return nombre_prueba;
	}

	public void setNombre_prueba(String nombre_prueba) {
		this.nombre_prueba = nombre_prueba;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Pruebas [nombre_prueba=" + nombre_prueba + ", tiempo = " + tiempo + "]";
	}

}
