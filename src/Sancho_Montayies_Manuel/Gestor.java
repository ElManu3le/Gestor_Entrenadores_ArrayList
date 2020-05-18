package Sancho_Montayies_Manuel;

import java.util.Scanner;

public class Gestor {

	static Scanner teclado = new Scanner(System.in);

	public Gestor() {
		ListaEntrenadores miLista = new ListaEntrenadores();

		// a�adiendo datos de test
		miLista.addEntrenador("Manuel", "Montañes");
		miLista.searchEntrenador("Manuel", "Sancho").addAtleta("Raul", "Carrillo", "sub20");
		miLista.searchEntrenador("Manuel", "Sancho").addAtleta("Gajarre", "paco", "sub20");
		Entrenador aux2 = miLista.searchEntrenador("Manuel", "Sancho");
		Atleta aux1 = aux2.searchAtleta("Raul", "Carrillo");
		aux1.addMMP("400m lisos", 45.6);
		aux1.addMMP("200m lisos", 30.0);

		miLista.addEntrenador("Jusn", "Miravete");
		miLista.addEntrenador("Felipe", "Casta�er");

		MenuEntrenador(miLista);
	}

	public void modifyAtleta(Atleta miAtleta) {
		int opcion = 0;
		do {

			System.out.println("\n****Modificar Atleta****");
			System.out.println("\t Atleta seleccionado: " + miAtleta + "\n");

			System.out.println("1. Cambiar nombre atleta");
			System.out.println("2. Cambiar apellido atleta");
			System.out.println("3. Insertar nuevo Mejor Marca Personal");
			System.out.println("4. Actualizar Mejor Marca Personal");
			System.out.println("5. Borrar Mejor Marca Personal ");
			System.out.println("6. Listar Mejor Marcas Personales");
			System.out.println("7. Salir al menu anterior");

			do {
				try {
					System.out.println("Escribe una de las opciones");
					opcion = teclado.nextInt();
					teclado.nextLine();

				} catch (Exception e) {
					System.out.println("Entrada incorrecta 1, solo se admite numeros entre 1 y 7");
				}

			} while ((opcion <= 1) && (opcion >= 7));

			switch (opcion) {
			case 1:
				// modificamos nombre atleta
				System.out.println("teclea nuevo nombre ");
				String nombre_atleta = teclado.nextLine();

				miAtleta.setNombre(nombre_atleta);

				break;
			case 2:
				// modificamos apellido atleta
				System.out.println("teclea nuevos apellidos : ");
				String apellido_atleta = teclado.nextLine();

				miAtleta.setApellido(apellido_atleta);

				break;
			case 3:

				// a�adimos nueva mejor marca personal
				System.out.println("ponga el nombre de la prueba: ");
				String nombre_prueba = teclado.nextLine();

				System.out.println("introduzca los tiempos con comas como separacion decimal: ");
				double tiempo = teclado.nextDouble();
				teclado.nextLine();

				miAtleta.addMMP(nombre_prueba, tiempo);

				break;
			case 4:
				// actualizamos mejor marca personal

				if (miAtleta.showMMPs() == true) {
					System.out.println("Selecciona una marca");
					int y = teclado.nextInt();
					teclado.nextLine();

					Pruebas aux = miAtleta.searchMMP(y);
					System.out.println("Introducir nuevos tiempos con coma como separacion decial: ");
					double marca = teclado.nextDouble();
					teclado.nextLine();

					aux.setTiempo(marca);

				}

				break;

			case 5:
				// borramos mejor marca personal

				if (miAtleta.showMMPs() == true) {

					System.out.println("Selecciona una marca");
					int y2 = teclado.nextInt();
					teclado.nextLine();

					Pruebas aux2 = miAtleta.searchMMP(y2);

					miAtleta.removeMMP(aux2);
				}

				break;

			case 6:
				// listamos mejor marca personal

				miAtleta.showMMPs();

				break;
			case 7:
				// salir al menu anterior

				break;

			default:
				System.out.println("has metido un numero incorrecto, solo se permiten numeros de 1 hasta 7");

			}
		} while (opcion != 7);
	}

	public void modifyEntrenador(Entrenador miEntrenador) {
		int opcion = 0;
		do {
			System.out.println("\n****Modificar Entrenador****");
			System.out.println("\t Entrenador seleccionado: " + miEntrenador + "\n");

			System.out.println("1. Cambiar nombre entrenador");
			System.out.println("2. Cambiar apellido entrenador");
			System.out.println("3. Insertar nuevo atleta");
			System.out.println("4. Modificar atleta");
			System.out.println("5. borrar atleta ");
			System.out.println("6. listar atleta");
			System.out.println("7. Salir al menu anterioir");

			do {
				try {
					System.out.println("Escribe una de las opciones");
					opcion = teclado.nextInt();
					teclado.nextLine();

				} catch (Exception e) {
					System.out.println("Entrada incorrecta 2, solo se admite numeros entre 1 y 6");
				}

			} while ((opcion <= 1) && (opcion >= 6));

			switch (opcion) {
			case 1:
				// modificamos nombre entrenador

				System.out.println("teclea nuevo nombre ");
				String nombre_entrenador = teclado.nextLine();

				miEntrenador.setNombre(nombre_entrenador);

				break;
			case 2:
				// modificamos apellido entrenador
				System.out.print("teclea nuevos apellidos : ");
				String apellido_entrenador = teclado.nextLine();

				miEntrenador.setApellidos(apellido_entrenador);

				break;
			case 3:

				// a�adimos ateleta

				System.out.println("nombre atleta: ");
				String nombre_atleta = teclado.nextLine();

				System.out.println("apellido atleta: ");
				String apellido_atleta = teclado.nextLine();

				System.out.println("categoria atleta: ");
				String categoria = teclado.nextLine();

				miEntrenador.addAtleta(nombre_atleta, apellido_atleta, categoria);

				break;
			case 4:
				// modifcamos atleta

				if (miEntrenador.listarAtletas() == true) {
					System.out.println("Selecciona un atleta");
					int y3 = teclado.nextInt();
					teclado.nextLine();

					Atleta aux3 = miEntrenador.searchAtleta(y3);

					modifyAtleta(aux3);
				}

				break;

			case 5:
				// borramos atleta

				if (miEntrenador.listarAtletas() == true) {
					System.out.println("Selecciona un atleta");
					int y4 = teclado.nextInt();
					teclado.nextLine();

					Atleta aux4 = miEntrenador.searchAtleta(y4);

					miEntrenador.removeAtleta(aux4);
				}

				break;

			case 6:
				// listar todos los atletas

				miEntrenador.listarAtletas();

				break;

			case 7:

				break;

			default:
				System.out.println("has metido un numero incorrecto, solo se permiten numeros de 1 hasta 7");

			}
		} while (opcion != 7);
	}

	public void MenuEntrenador(ListaEntrenadores entrenadores) { // cada vez que llamamos a uno de la
																	// Lista_entrenadores ponemos entrenadores delante

		int opcion = 0;
		do {
			System.out.println("\n****Menu Entrenadores****");

			System.out.println("1. Insertar Entrenador");
			System.out.println("2. Listar Entrenador");
			System.out.println("3. Modificar Entrenador");
			System.out.println("4. Borrar Entrenador");
			System.out.println("5. Mostrar todos los entrenadores ");
			System.out.println("6. Salir");

			do {
				try {
					System.out.println("Escribe una de las opciones");
					opcion = teclado.nextInt();
					teclado.nextLine();

				} catch (Exception e) {
					System.out.println("Entrada incorrecta 3 , solo se admite numeros entre 1 y 6");
				}

			} while ((opcion <= 1) && (opcion >= 6));

			switch (opcion) {
			case 1:

				System.out.print("nombre entrenador: ");
				String nombre_entrenador = teclado.nextLine();

				System.out.print("apellido entrenador: ");
				String apellido_entrenador = teclado.nextLine();

				entrenadores.addEntrenador(nombre_entrenador, apellido_entrenador);

				break;
			case 2:

				System.out.print("nombre entrenador: ");
				String nombre_entrenador2 = teclado.nextLine();

				System.out.print("apellido entrenador: ");
				String apellido_entrenador2 = teclado.nextLine();

				entrenadores.listarEntrenador(nombre_entrenador2, apellido_entrenador2);

				break;
			case 3:

				System.out.println("Selecciona el entrenador a modificar: ");

				entrenadores.listarEntrenadores();

				int y = teclado.nextInt();
				teclado.nextLine();

				modifyEntrenador(entrenadores.searchEntrenador(y));

				break;
			case 4:

				if (entrenadores.listarEntrenadores() == true) {
					System.out.println("Selecciona un entrenador");
					int y4 = teclado.nextInt();
					teclado.nextLine();

					Entrenador aux4 = entrenadores.searchEntrenador(y4);

					entrenadores.removeEntrenador(aux4);
				}

				break;

			case 5:

				entrenadores.listarEntrenadores();

				break;

			case 6:

				break;

			default:
				System.out.println("has metido un numero incorrecto, solo se permiten numeros de 1 hasta 6");

			}
		} while (opcion != 6);

	}

}
