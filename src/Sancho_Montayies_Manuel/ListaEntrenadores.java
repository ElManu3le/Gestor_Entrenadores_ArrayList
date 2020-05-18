package Sancho_Montayies_Manuel;

import java.util.ArrayList;

public class ListaEntrenadores {
	private ArrayList<Entrenador> misEntrenadores;

	public ListaEntrenadores() {

		this.misEntrenadores = new ArrayList<Entrenador>();
	}

	public void addEntrenador(String nombre, String apellido) {
		Entrenador aux = searchEntrenador(nombre, apellido);
		if (aux == null) {
			Entrenador temporal = new Entrenador(nombre, apellido);// crea nuevo entrenador temporal con nombre y
																	// apellidos
			misEntrenadores.add(temporal);// a�ade nuevo entrenador temporal
		} else {
			System.out.println("ya existe este Entrenador");

		}
	}

	public void removeEntrenador(Entrenador elteacher) {
		misEntrenadores.remove(elteacher);

	}

	public void removeEntrenador(String nombre, String apellido) {
		Entrenador aux = searchEntrenador(nombre, apellido);
		if (aux != null) {
			misEntrenadores.remove(aux);
		} else {
			System.out.println("no existe, no se pudo borrar");
		}

	}

	public boolean listarEntrenador(String nombre, String apellido) {
		Entrenador aux = searchEntrenador(nombre, apellido);
		if (aux == null) {
			System.out.println("no encontrad@");
			return false;
		} else {
			System.out.println(aux);
			return true;
		}
	}

	public boolean listarEntrenadores() {
		int x;
		for (x = 0; x < misEntrenadores.size(); x++) {
			System.out.println(x + " - " + misEntrenadores.get(x));

		}
		if (x == 0) {
			System.out.println("Lista de entrenadorers vacia!!!");
			return false;
		} else {
			return true;

		}

	}

	public Entrenador searchEntrenador(int x) {
		if (misEntrenadores.isEmpty()) {
			return null;
		} else {
			return misEntrenadores.get(x);
		}

	}

	public Entrenador searchEntrenador(String nombre, String apellido) {
		if (misEntrenadores.isEmpty()) {
			return null;
		} else {
			for (int x = 0; x < misEntrenadores.size(); x++) {
				if ((misEntrenadores.get(x).getNombre().equals(nombre))
						&& (misEntrenadores.get(x).getApellidos().equals(apellido))) {
					return misEntrenadores.get(x);
				}
			}
			return null;

		}

	}

}
