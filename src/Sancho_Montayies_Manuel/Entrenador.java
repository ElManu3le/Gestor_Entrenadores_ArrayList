package Sancho_Montayies_Manuel;

import java.util.ArrayList;

public class Entrenador {
	// Clase entrenador que almacena una serie de atributos que caracterizan al
	// entrenador.
	private String nombre;
	// Variable que almacena el nombre del entrenador en una cadena.
	private String apellidos;
	// Variable que almacena el apellido del entrenador en una cadena.
	private ArrayList<Atleta> misAtletas;
	// Lista de atletas entrenados por ese entrenador

	public Entrenador() {
		// Constructor vacio de la clase Entrenador
		this.misAtletas = new ArrayList<Atleta>();
		// Inicializa una nueva variable de ArryList
	}

	public Entrenador(String nombre, String apellidos) {
		// Constructor que inicializa con la cadena de nombre y apellidos
		super();

		this.nombre = nombre;
		// Inicializa el nombre
		this.apellidos = apellidos;
		// Inicializa los apellidos
		this.misAtletas = new ArrayList<Atleta>();
		// Inicializa una nueva variable de ArryList con variable misAtletas.
	}

	public String getNombre() {
		// Metodo para devolver el nombre del entrenador

		return nombre;
		// Devulve el nombre
	}

	public void setNombre(String nombre) {
		// Metodo para inicializar el nombre
		this.nombre = nombre;
		// Inicializa el nombre
	}

	public String getApellidos() {
		// Metodo para devolver el apellido del entrenador

		return apellidos;
		// Devulve los apellidos
	}

	public void setApellidos(String apellidos) {
		// Metodo para inicializar el apellido
		this.apellidos = apellidos;
		// Inicializa los apellidos
	}

	public void addAtleta(String nombre, String apellido, String categoria) {
		// Metodo usado para añadir un atleta con nombre, apellido y una categoria
		Atleta aux = searchAtleta(nombre, apellido);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// searchAtleta

		if (aux == null) {
			// En caso de buscar el nombre y apellido y comprobar que no existen la variable
			// sera valor null
			Atleta temporal = new Atleta(nombre, apellido, categoria);
			// Se crea una variable temporal de tipo Atleta
			misAtletas.add(temporal);
			// Se añadira la nueva variable temporal a la lista misAtletas
		} else {
			System.out.println("ya existe este atleta");
			// Mensaje que se mostrara si el atleta ya existe.
		}
	}

	public void removeAtleta(Atleta elAtleta) {
		// Metodo para borrar la variable elAtleta de la lista misAtletas

		misAtletas.remove(elAtleta);
		// Se borra la variable elAtleta de la lista Atletas

	}

	public void removeAtleta(String nombre, String apellido) {
		// Metodo usado para borrar un Atleta por nombre y apellido

		Atleta aux = searchAtleta(nombre, apellido);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// searchAtleta
		if (aux != null) {

			// Condicion usada para borrar la variable en caso de que esta sea distinta de
			// null
			misAtletas.remove(aux);
			// La variable misAtletas llamara al metodo de borrar Atleta para borrar el
			// valor de la variable aux
		} else {
			System.out.println("no existe, no se pudo borrar");
			// En caso de que no se encuentre la variable se mandara un mensaje de no existe
		}

	}

	public boolean listarAtletas() {
		// Metodo para determinar una valor de estilo binario, con 0 o 1
		int x;
		for (x = 0; x < misAtletas.size(); x++) {
			// Bucle para ir recorriendo la lista de uno en uno, hasta que el valor de
			// inicio (x=0) tenga el mismo tamaño que misAtletas.size().
			// En caso de que la lista este vacia, misAtletas.size() tendra un valor 0 y
			// siendo igual al inical, por lo que dejaria de seguir recorreindo la lista
			System.out.println(x + " - " + misAtletas.get(x));
			// Forma de mostrar a los atletas de la lista segun el valor x que tengan en la
			// lista
		}

		if (x == 0) {
			// Condicion que determina el contenido vacio de la lista
			System.out.println("Lista de atletas vacia!!!");
			return false;
			// Devulve si no se pudo mostrar los atletas

		} else {
			return true;
			// Devuelve se se pudo mostrar a los atletas
		}
	}

	public boolean listarAtleta(String nombre, String apellido) {
		// Metodo para determinar una valor de estilo binario, con 0 o 1
		Atleta aux = searchAtleta(nombre, apellido);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// searchAtleta
		if (aux == null) {
			// Condicion usada para determinar si la variable es null
			// Caso donde la variable aux es null
			System.out.println("no encontrad@");
			return false;
		} else {
			// Caso donde la variable es distinta de null
			// La lista tiene informacion registrada de antemano
			System.out.println(aux);
			// Se imprime la variable creada
			return true;
		}
	}

	public Atleta searchAtleta(int x) {
		// Metodo que busca y que almacena el valor que haya encontrado segun el valor
		// integer

		return misAtletas.get(x);
		// Metodo que consigue el valor x llamando a la variable misAtletas

	}

	public Atleta searchAtleta(String nombre, String apellido) {
		// Metodo que buscara a un Atleta segun el nombre y apellido

		if (misAtletas.isEmpty()) {
			// Condicion que determina si la lista esta vacia
			return null;
			// Devuelve un null debido a que la lista esta vacia
		} else {
			for (int x = 0; x < misAtletas.size(); x++) {
				// Metodo que recorre de uno en uno el tamaño de la variable misAtletas de la
				// lista Atletas empezando desde el valor 0
				if ((misAtletas.get(x).getNombre().equals(nombre))
						&& (misAtletas.get(x).getApellido().equals(apellido))) {
					// Ira recorreindo la lista hasta encontrar los nombres y apellidos
					return misAtletas.get(x);
					// Devulve el valor de x llamando a la variable misAtletas.
				}
			}
			return null;
		}
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", apellidos=" + apellidos + ", misAtletas = " + misAtletas + "]";
	}
	// Metodo usado para mostrar la informacion de Entrenador

}
