package Sancho_Montayies_Manuel;

import java.util.ArrayList;


public class Atleta {
	private String nombre;
	private String apellido;
	private String categoria;
	private ArrayList<Pruebas> MMP;// lista de pruebas

	public Atleta() {
		this.MMP = new ArrayList<Pruebas>();
	}

	public Atleta(String nombre, String apellido, String categoria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
		this.MMP = new ArrayList<Pruebas>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void addMMP(String nombre_prueba, Double tiempo) {
		Pruebas aux = searchMMP(nombre_prueba);
		if (aux == null) {
			Pruebas temporal = new Pruebas(nombre_prueba, tiempo);
			MMP.add(temporal);
		} else {

			aux.setTiempo(tiempo);

		}
	}

	public boolean removeMMP(Pruebas laPrueba) {

		return MMP.remove(laPrueba);

	}

	public boolean removeMMP(String nombre_prueba) {
		Pruebas aux = searchMMP(nombre_prueba);
		if (aux != null) {
			MMP.remove(aux);
			return true;
		} else {
			System.out.println("no existe, no se pudo borrar");
			return false;
		}
	}

	public boolean showMMPs() {
		int x;
		for (x = 0; x < MMP.size(); x++) {
			System.out.println(x + " - " + MMP.get(x));

		}
		if (x == 0) {
			System.out.println("Lista de marcas personales vacia!!!");
			return false;
		} else {
			return true;
		}
	}

	public boolean showMMP(String nombre_prueba) {
		Pruebas aux = searchMMP(nombre_prueba);
		if (aux == null) {
			System.out.println("no encontrada la prueba");
			return false;
		} else {
			System.out.println(aux);
			return true;
		}
	}

	public Pruebas searchMMP(int x) {
		return MMP.get(x);
	}

	public Pruebas searchMMP(String nombre_prueba) {
		if (MMP.isEmpty()) {
			return null;
		} else {
			for (int x = 0; x < MMP.size(); x++) {
				if (MMP.get(x).getNombre_prueba().equals(nombre_prueba)) {
					return MMP.get(x);
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

}
