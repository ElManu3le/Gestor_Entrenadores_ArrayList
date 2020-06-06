package Sancho_Montayies_Manuel;

import java.util.ArrayList;


public class Atleta {
	// Clase Atleta que almacena una serie de atributos que caracterizan al Atleta.
	private String nombre;
	// Variable que almacena el nombre del Atleta en una cadena.
	private String apellido;
	// Variable que almacena el apellido del Atleta en una cadena.
	private String categoria;
	// Variable que almacena el categoria del Atleta en una cadena.
	private ArrayList<Pruebas> MMP;
	// Lista de Pruebas con mejores tiempos

	public Atleta() {
		// Constructor vacio de la clase Atleta
		this.MMP = new ArrayList<Pruebas>();
		// Inicializa una nueva variable de ArryList
	}

	public Atleta(String nombre, String apellido, String categoria) {
		// Constructor que inicializa con la cadena de nombre, apellidos y categoria
		super();
		this.nombre = nombre;
		// Inicializa el nombre
		this.apellido = apellido;
		// Inicializa los apellidos
		this.categoria = categoria;
		// Inicializa la categoria
		this.MMP = new ArrayList<Pruebas>();
		// Inicializa una nueva variable llamda MMP, que es un ArryList de Pruebas

	}

	public String getNombre() {
		// Metodo para devolver el nombre del Atleta
		return nombre;
		// Devulve el nombre
	}

	public void setNombre(String nombre) {
		// Metodo para inicializar el nombre
		this.nombre = nombre;
		// Inicializa el nombre
	}

	public String getApellido() {
		// Metodo para devolver el apellido del Atleta
		return apellido;
		// Devulve el apellido
	}

	public void setApellido(String apellido) {
		// Metodo para inicializar el apellido
		this.apellido = apellido;
		// Inicializa el apellido
	}

	public String getCategoria() {
		// Metodo para devolver la categoria del Atleta
		return categoria;
		// Devulve la categoria
	}

	public void setCategoria(String categoria) {
		// Metodo para inicializar la categoria del Atleta

		this.categoria = categoria;
		// Inicializa la categoria
	}

	public void addMMP(String nombre_prueba, Double tiempo) {
		// Metodo que añade el nombre y los tiempos de una prueba.
		Pruebas aux = searchMMP(nombre_prueba);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// searchMMP
		if (aux == null) {
			// En caso de buscar el nombre_prueba y comprobar que no exista la variable sera
			// valor null
			Pruebas temporal = new Pruebas(nombre_prueba, tiempo);
			// Se crea una variable de tipo Pruebas
			MMP.add(temporal);
			// Se añadira la nueva variable temporal a la lista MMP
		} else {

			aux.setTiempo(tiempo);
			// En caso de que el nombre exista se rescribe el tiempo

		}
	}

	public boolean removeMMP(Pruebas laPrueba) {
		// Metdo para borrar la variable laPrueba de la lista MMP

		return MMP.remove(laPrueba);
		// Devuelve si se ha podido borrar la variable laPrueba

	}

	public boolean removeMMP(String nombre_prueba) {
		// Metodo usado para borrar una MMP segun el nombre de la prueba
		Pruebas aux = searchMMP(nombre_prueba);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// searchMMP
		if (aux != null) {
			// En caso de que la variable exista esta tendra un valor distinto de nulo
			MMP.remove(aux);
			// Se borra la variable aux de la lista MMP
			return true;
			// Devuleve si se ha podido borrar la variable

		} else {
			System.out.println("no existe, no se pudo borrar");
			return false;
			// Devuleve si no se ha podido borrar

		}
	}

	public boolean showMMPs() {
		// Metodo usado para visualizar las MMPs registradas
		int x;
		for (x = 0; x < MMP.size(); x++) {
			// Bucle para ir recorriendo la lista de uno en uno, hasta que el valor de
			// inicio (x=0) tenga el mismo tamaño que MMP.size().

			System.out.println(x + " - " + MMP.get(x));
			// Se devulve el valor de la lista y la MMP de la lista

		}
		if (x == 0) {
			// Condicion que hace saber al programa de que la lista esta vacia en caso de
			// que x = MMP.size().
			System.out.println("Lista de marcas personales vacia!!!");
			return false;
			// Devulve si no se ha podido mostrar las MMPs
		} else {
			return true;
			// Devuelve se se ha podido borrar
		}
	}

	public boolean showMMP(String nombre_prueba) {
		// Metod usado para visualizar una MMP segun el nombre de la prueba
		Pruebas aux = searchMMP(nombre_prueba);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// searchMMP
		if (aux == null) {
			// En caso de que la variable exista esta tendra un valor igual a nulo
			System.out.println("no encontrada la prueba");
			return false;
			// Devuelve si no se pudo mostrar la prueba querida
		} else {
			System.out.println(aux);
			// Si la variable es distinta de null se imprira su valor aux
			return true;
			// Devulve si ser puedo mostrar la prueba querida
		}
	}

	public Pruebas searchMMP(int x) {
		// Metodo que busca y que almacena segun el valor integer
		return MMP.get(x);
		// Devulve el valor conseguido de x de la lista MMP
	}

	public Pruebas searchMMP(String nombre_prueba) {
		// Metodo que busca una MMP segun el nombre de la prueba
		if (MMP.isEmpty()) {
			// Condicion que determina si la lista esta vacia
			return null;
			// Devuelve null debido a que la lista esta vacia
		} else {
			for (int x = 0; x < MMP.size(); x++) {
				// Bucle para ir recorriendo la lista de uno en uno, hasta que el valor de
				// inicio (x=0) tenga el mismo tamaño que MMP.size().
				if (MMP.get(x).getNombre_prueba().equals(nombre_prueba)) {
					// Ira recorreindo la lista hasta encontrar el nombre de la prueba
					return MMP.get(x);
					// Devuelve el valor de x de la lista MMP.
				}
			}
			return null;

		}
	}

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", apellido=" + apellido + ", categoria=" + categoria + ", MMP=" + MMP
				+ "]";
	}
	// Metod usado para devolver los valores de la Lista de Atleta

}
