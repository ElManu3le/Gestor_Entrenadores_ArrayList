package Sancho_Montayies_Manuel;

import java.util.ArrayList;

public class Entrenador {
	private String nombre;
	private String apellidos;
	private ArrayList<Atleta> misAtletas;

	public Entrenador() {
		this.misAtletas = new ArrayList<Atleta>();
	}

	public Entrenador(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.misAtletas = new ArrayList<Atleta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void addAtleta(String nombre, String apellido, String categoria) {
		Atleta aux = searchAtleta(nombre, apellido);
		if (aux == null) {
			Atleta temporal = new Atleta(nombre, apellido, categoria);
			misAtletas.add(temporal);
		} else {
			System.out.println("ya existe este atleta");
		}
	}

	public void removeAtleta(Atleta elAtleta) {

		misAtletas.remove(elAtleta);

	}

	public void removeAtleta(String nombre, String apellido) {
		Atleta aux = searchAtleta(nombre, apellido);
		if (aux != null) {
			misAtletas.remove(aux);
		} else {
			System.out.println("no existe, no se pudo borrar");
		}

	}

	public boolean listarAtletas() {
		int x;
		for (x = 0; x < misAtletas.size(); x++) {
			System.out.println(x + " - " + misAtletas.get(x));
		}

		if (x == 0) {
			System.out.println("Lista de atletas vacia!!!");
			return false;

		} else {
			return true;
		}
	}

	public boolean listarAtleta(String nombre, String apellido) {
		Atleta aux = searchAtleta(nombre, apellido);
		if (aux == null) {
			System.out.println("no encontrad@");
			return false;
		} else {
			System.out.println(aux);
			return true;
		}
	}

	public Atleta searchAtleta(int x) {

		return misAtletas.get(x);

	}

	public Atleta searchAtleta(String nombre, String apellido) {
		if (misAtletas.isEmpty()) {
			return null;
		} else {
			for (int x = 0; x < misAtletas.size(); x++) {
				if ((misAtletas.get(x).getNombre().equals(nombre))
						&& (misAtletas.get(x).getApellido().equals(apellido))) {
					return misAtletas.get(x);
				}
			}
			return null;

		}

	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", apellidos=" + apellidos + ", misAtletas = " + misAtletas + "]";
	}

}
