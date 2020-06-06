package Sancho_Montayies_Manuel;

import java.util.ArrayList;

public class ListaEntrenadores {
	// Esta clase agrupa a los entrenadores
	private ArrayList<Entrenador> misEntrenadores;
	// Esta lista contiene a la clase entrenador y a todos los atributos que
	// contenga puestos.
	// La variable principal de esta lista se llama misEntrenadores y sera usada
	// para guiar a la información.

	public ListaEntrenadores() {
		// Contructor de la clase ListaEntrenadores

		this.misEntrenadores = new ArrayList<Entrenador>();
		// Inicializa una nueva variable de ArrayList
	}

	public void addEntrenador(String nombre, String apellido) {
		// Este metodo se encarga de añadir dos cadenas de caracteres(Strings) a
		// misEntrenadores.

		Entrenador aux = searchEntrenador(nombre, apellido);
		// Se crea una variable llamada aux, donde se almacenara lo buscado por
		// SearchEntrenador

		if (aux == null) {
			// Hace una condicion, es decir, si aux es igual a null/nulo se ejecutara el
			// programa siguiente.
			// Esto hace referencia a que aux no existe, por lo que se puede añadir un nuevo
			// entrenador.

			Entrenador temporal = new Entrenador(nombre, apellido);
			// Crea nuevo entrenador temporal con nombre y apellidos.

			misEntrenadores.add(temporal);
			// Añade nuevo entrenador de tipo temporal a misEntrenaodres.

		} else {
			System.out.println("ya existe este Entrenador");
			// En caso de que aux exista, mandara un mensaje de que este entrenador ya
			// existe.

		}
	}

	public void removeEntrenador(Entrenador elteacher) {
		// Elimina el entrenador que fue pasado con la variable de la lista de
		// entrenadores

		misEntrenadores.remove(elteacher);
		// Se encargara de borrar a elteacher de misEntrenadores.

	}

	public void removeEntrenador(String nombre, String apellido) {
		// Metodo removeEntrenador
		Entrenador aux = searchEntrenador(nombre, apellido);
		// Se crea una variable llamada aux de tipo entrenador, donde se almacenara lo
		// buscado por
		// SearchEntrenador

		if (aux != null) {
			// Condicion usada para establecer si el entrenador buscado es nulo o existe.
			// En caso de que una vez haya buscado en la lista y se muestre la informacion
			// buscada, el programa continuara con la ejecucón.
			misEntrenadores.remove(aux);
			// La variable aux será borrada de misEntrenadores porque fue encontrada por el
			// programa de searchEntrenador
		} else {
			System.out.println("no existe, no se pudo borrar");
			// Texto que se mostrara en caso de que una vez el programa de searchEntrnador
			// no haya encontrado lo elegido, que sea null/nulo.

		}

	}

	public boolean listarEntrenador(String nombre, String apellido) {
		// Metodo para determinar una valor de estilo binario, con 0 o 1
		Entrenador aux = searchEntrenador(nombre, apellido);
		// Se crea una variable llamada aux de tipo entrenador, donde se almacenara lo
		// buscado por SearchEntrenador

		if (aux == null) {
			// Condicion usada para saber si el entrenador existe.
			System.out.println("no encontrad@");
			return false;

		} else {
			// Si no se cumple el no haberlo encontrado, el programa afirma haberlo
			// encontrado
			System.out.println(aux);
			return true;

		}
	}

	public boolean listarEntrenadores() {
		//
		int x;
		for (x = 0; x < misEntrenadores.size(); x++) {
			// Bucle para ir recorriendo la lista de uno en uno, hasta que el valor de
			// inicio (x=0) tenga el mismo tamaño que misEntrenadores.size().
			// En caso de que la lista este vacia, misEntrenadores.size() tendra un valor 0
			// y siendo igual al inical, por lo que dejaria de seguir recorreindo la lista
			System.out.println(x + " - " + misEntrenadores.get(x));
			// Muestra los entrenadores según el valor que toman en la lista.

		}
		if (x == 0) {
			// Condicion usada para determinar que la lista se encuentra vacia.
			System.out.println("Lista de entrenadorers vacia!!!");
			return false;
		} else {
			return true;

		}

	}

	public Entrenador searchEntrenador(int x) {
		// Metodo para buscar dentro de la lista de entrenadores

		if (misEntrenadores.isEmpty()) {
			// Metodo usado para determinar si la lista esta vacia
			return null;
		} else {
			return misEntrenadores.get(x);
			// En el caso de que haya entrenadores en la lista
		}

	}

	public Entrenador searchEntrenador(String nombre, String apellido) {
		if (misEntrenadores.isEmpty()) {
			// En caso de que la variable misEntrenadores de la lista Entrenador este vacia,
			// se devolvera un null

			return null;
		} else {
			// Caso de que la lista tenga varios valores.
			for (int x = 0; x < misEntrenadores.size(); x++) {
				// Bucle para ir recorriendo la lista de uno en uno, hasta que el nuevo valor
				// integer de inicio (x=0) tenga el mismo tamaño que misEntrenadores.size().

				if ((misEntrenadores.get(x).getNombre().equals(nombre))
						&& (misEntrenadores.get(x).getApellidos().equals(apellido))) {
					// Ira recorreindo la lista hasta encontrar los nombres y apellidos
					return misEntrenadores.get(x);
					// Devuelve el valor de Entrenador encontrado.
				}
			}
			return null;

		}

	}

}
