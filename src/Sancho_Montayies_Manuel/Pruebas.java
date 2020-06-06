package Sancho_Montayies_Manuel;

public class Pruebas {
	// Clase Preubas que almacenara una serie de atributos caracteristicos de
	// pruebas
	private String nombre_prueba;
	// Variable que almacena el nombre de la prueba
	private double tiempo;
	// Variable que almacena el tiempo de la prueba

	public Pruebas() {
		// Constructor vacio de Pruebas

	}

	public Pruebas(String nombre_prueba, double tiempo) {
		// Constructor que inicializa con la cadena de nombre_pruebas y el double de
		// tiempo
		super();
		this.nombre_prueba = nombre_prueba;
		// Inicializa el nombre de la prueba
		this.tiempo = tiempo;
		// Inicializa con el tiempo
	}

	public String getNombre_prueba() {
		// Metodo para devolver el nombre de la prueba
		return nombre_prueba;
		// Devulve el nombre de la prueba
	}

	public void setNombre_prueba(String nombre_prueba) {
		// Metodo para inicializar el nombre de una prueba
		this.nombre_prueba = nombre_prueba;
		// Inicializa el nombre de la prueba
	}

	public double getTiempo() {
		// Metodo para devolver el tiempo
		return tiempo;
		// Devuele el tiempo
	}

	public void setTiempo(double tiempo) {
		// Metodo para inicializar el tiempo
		this.tiempo = tiempo;
		// Inicializa elm tiempo
	}

	@Override
	public String toString() {
		return "Pruebas [nombre_prueba=" + nombre_prueba + ", tiempo = " + tiempo + "]";
	}
	// Este metodo se encarga de mostrar el contenido de Pruebas teniendo la
	// capacidad de poder modificar la forma de visualización.

}