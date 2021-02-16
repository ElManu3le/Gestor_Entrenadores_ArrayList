package Sancho_Montayies_Manuel;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {

		new Main();

	}

	public Main() {

		ListaEntrenadores miLista = new ListaEntrenadores();
		// Se crea una nueva Lista de entrenadores (ListaEntrenadores) en una variable
		// llamada miLista. Dentro de esta nueva lista, se agruparan todas las
		// operaciones para Entrenadores, añadir, modificar... Esta nueva lista tendra
		// todos los atributos definidos de Entrenador, ya que ListaEntrenadores es la
		// agrupación de Entrenadores con sus propios atletas y de las marcas de sus
		// atletas.

		// Se añaden una serie de valores como forma de testeo de la apliación.

		miLista.addEntrenador("Manuel", "Sancho");
		// La variable miLista se llama con la operación de addEntrenador de la clase,
		// para añadir los nombres y apellidos de este como ejemplo de prueba.

		miLista.searchEntrenador("Manuel", "Sancho").addAtleta("Raul", "Carrillo", "sub20");
		// Se busca el nombre del Entrenador en miLista y se le añade un atleta con
		// valores nuevos como el nombre, el apellido y su categoria.

		miLista.searchEntrenador("Manuel", "Sancho").addAtleta("Gajarre", "paco", "sub20");
		// Se busca el nombre del Entrenador en la variable y se le añade otro atleta
		// con valores nuevos como el nombre, el apellido y la categoria.

		Entrenador aux2 = miLista.searchEntrenador("Manuel", "Sancho");
		// Otra forma de hacer lo de arriba, se crea aux2 para buscar el entrenador en
		// miLista.

		Atleta aux1 = aux2.searchAtleta("Raul", "Carrillo");
		// Una vez se haya encontrado al entrenador, se crea Atleta aux1 que buscara
		// dentro del Entrenador su Atleta "Raúl".

		aux1.addMMP("400m lisos", 45.6);
		// Una vez aux1 haya sido encontrado, se le añadira/n sus pruebas y marcas
		// personales.

		aux1.addMMP("200m lisos", 30.0);
		// Una vez aux1 haya sido encontrado, se le añadiran otra prueba distinta con su
		// marca, si es que hace más pruebas.

		miLista.addEntrenador("Jusn", "Miravete");
		// Añade más entrenadores a la lista de entrenadores.

		miLista.addEntrenador("Felipe", "Castañer");
		// Añade más entrenadores a la lista de entrenadores.

		MenuEntrenador(miLista);
		// La variable miLista se enlaza con el menu de Entrenador mostrando todos los
		// datos que se tengan registrados.
	}

	public void modifyAtleta(Atleta miAtleta) {
		// Metodo para modificar al alteta, relacionandose con la clase Atleta y cuya
		// variable se llama miAtleta.

		int opcion = 0;
		// se establece una variable que nos permitira elegir una opcion de nuestro
		// menu.

		do {
			// empieza el metodo do{} while(); Este metodo se basa en hacer una cosa
			// mientras se cumpla la condicion del while().

			System.out.println("\n****Modificar Atleta****");
			System.out.println("\t Atleta seleccionado: " + miAtleta + "\n");
			// Nos dira el nuemero que tiene nuestro altela dentro de la lista, como si
			// fuera el numero de espera de la pescaderia.

			System.out.println("1. Cambiar nombre atleta");

			System.out.println("2. Cambiar apellido atleta");

			System.out.println("3. Insertar nuevo Mejor Marca Personal");

			System.out.println("4. Actualizar Mejor Marca Personal");

			System.out.println("5. Borrar Mejor Marca Personal ");

			System.out.println("6. Listar Mejor Marcas Personales");

			System.out.println("7. Salir al menu anterior");

			do {
				// Esta opción revisar que se cumplan las condiciones marcadas para usar el
				// menú.

				try {
					// Termina de mostar el menu de usuario.

					System.out.println("Escribe una de las opciones: ");

					opcion = Leer.pedirEnteroValidar();
					// Una vez la persona introduzca el valor permitido, la clase Leer sen encargara
					// leer el valor introducido.

				} catch (Exception e) {
					// Metodo usado para controlar el error del programa si falla con el valor
					// introducido.

					System.out.println("Entrada incorrecta 1, solo se admite numeros entre 1 y 7");
				}

			} while ((opcion <= 1) && (opcion >= 7));
			// Rango de valores que el programa acepta para su ejecución, si no se cumple el
			// valor de la opcion se enviara al do{} para que inserte un valor valido.

			switch (opcion) {
				// Metodo que se usa para agrupar las distintas casos que nuestro menú permita
				// hacer.

				case 1: // Modificamos el nombre del atleta elegido.

					System.out.print("teclea nuevo nombre: ");

					String nombre_atleta = Leer.pedirCadena();
					// Una vez la persona introduzca el valor permitido, la clase Leer se encargara
					// leer el valor introducido.

					miAtleta.setNombre(nombre_atleta);
					// Fija el nombre dado anteriormente en miLista, dentro de Atleta.

					break; // Fin del primera caso de nuestro menu, si no se pone este final, el program lo
							// leería de seguido juntandolo con el caso 2.

				case 2: // Modificamos el/los apellidos del atleta elegido

					System.out.print("teclea nuevos apellidos: ");

					String apellido_atleta = Leer.pedirCadena();
					// Una vez la persona introduzca el valor permitido, la clase Leer se encargara
					// leer el valor introducido.

					miAtleta.setApellido(apellido_atleta);
					// Fija el nombre dado anteriormente en miLista, dentro de Atleta.

					break; // Fin del segundo caso de nuestro menu, si no se pone este final, el programa
							// lo leería de seguido juntandolo con el caso 3.

				case 3: // Añadimos nueva mejor marca personal al atleta.

					System.out.print("ponga el nombre de la prueba: ");

					String nombre_prueba = Leer.pedirCadena();
					// Una vez la persona introduzca el valor permitido, la clase Leer se encargara
					// leer el valor introducido.

					System.out.print("introduzca los tiempos con comas como separacion decimal: ");

					double tiempo = Leer.pedirDecimal();
					// Una vez la persona introduzca el valor permitido, la clase Leer se encargara
					// leer el valor introducido.

					miAtleta.addMMP(nombre_prueba, tiempo);
					// Se añadiran el nombre de la prueba y el tiempo de la prueba a la lista de
					// pruebas de Atleta, cuya variable es miAtleta.

					break; // Fin del tecer caso de nuestro menu, si no se pone este final, el program lo
							// leería de seguido juntandolo con el caso 4.

				case 4: // Actualizamos mejor la marca personal del atleta elegido.

					if (miAtleta.showMMPs() == true) {
						// Metodo usado para establecer una condición, se si sumple se hará la
						// operación. En este caso se pide mostrar los tiempos que tenga el atleta.

						System.out.print("Selecciona una marca: ");

						int y = Leer.pedirEnteroValidar();
						// Una vez la persona introduzca el valor permitido, la clase Leer se encargara
						// de
						// leer el valor introducido.

						Pruebas aux = miAtleta.searchMMP(y);
						// Se crea una variable de tipo Pruebas y almacenara lo que se buscara de la
						// MMP.

						System.out.print("Introducir nuevos tiempos con coma como separacion decial: ");

						double marca = Leer.pedirDecimal();
						// Una vez la persona introduzca el valor, la clase Leer se encargara
						// de leer el valor introducido.

						aux.setTiempo(marca);
						// Se pone la marca a la variable aux que tiene el valor de la prueba del
						// atleta.

					}

					break; // Fin del cuarto caso de nuestro menu, si no se pone este final, el program lo
							// leería de seguido juntandolo con el caso 5.

				case 5:
					// Borramos mejor marca personal.

					if (miAtleta.showMMPs() == true) {
						// Condicion que se usa para identificar si una prueba determinada existe en el
						// atleta.

						System.out.print("Selecciona una marca: ");
						int y2 = Leer.pedirEnteroValidar();
						// Creamos una variable y2, el valor lo leera y almacenara.

						Pruebas aux2 = miAtleta.searchMMP(y2);
						// Se crea una variable de tipo Pruebas y almacenara lo que se buscara de la
						// MMP.

						miAtleta.removeMMP(aux2);
						// Se borra aux2 de miAtleta según el valor de y2.
					}

					break; // Fin del quinto caso de nuestro menu, si no se pone este final, el program lo
							// leería de seguido juntandolo con el caso 6.

				case 6:
					// Listamos mejor marca personal.

					miAtleta.showMMPs();
					// Se muestran las marcas personales del atleta con el método .showMMPs de
					// Atleta en caso de que tenga pruebas registradas.
					// En caso de que el atleta no tenga marcas registradas el programa nos dira que
					// esta vacia la lista e pruebas.

					break; // Fin del sexto caso de nuestro menu, si no se pone este final, el program lo
							// leería de seguido juntandolo con el caso 7.

				case 7:
					// Salir al menu anterior, dicha opcion permiter volver al menu anteior a este.

					break; // Fin del ultimo caso de nuestro menu.

				default:
					System.out.println("has metido un numero incorrecto, solo se permiten numeros de 1 hasta 7");

			}
		} while (opcion != 7); // Condicion usada para ir al menu de modificar entrenador si el usuario
								// selecciona el numero 7.
	}

	public void modifyEntrenador(Entrenador miEntrenador) {
		// Metodo usado para modificar al entrenador, al cual le pasan a un obejto
		// Entrenador incluido la lista de Atletas y la lista de Pruebas de los atletas
		// y cuya variale del metodo se llama miEntrenador, la cual almacenara los datos
		// nuevos o los ya registraos.

		int opcion = 0;
		// Variable usada para alamacenar la operación seleccionada del menú.

		do {
			System.out.println("\n****Modificar Entrenador****");

			System.out.println("\t Entrenador seleccionado: " + miEntrenador + "\n");
			// Operación usada para mostrar al entrenador elegido en el menu de Entrenador.

			System.out.println("1. Cambiar nombre entrenador");

			System.out.println("2. Cambiar apellido entrenador");

			System.out.println("3. Insertar nuevo atleta");

			System.out.println("4. Modificar atleta");

			System.out.println("5. borrar atleta ");

			System.out.println("6. listar atleta");

			System.out.println("7. Salir al menu anterioir");

			do {
				try {
					// Una vez mostrado el menu de modificar entrenador, se pedira escribir la
					// opción que queramos realizar del menu usando numeros enteros.
					System.out.print("Escribe una de las opciones: ");

					opcion = Leer.pedirEnteroValidar();
					// Lee el valor introducido y comprueba que es valido.

				} catch (Exception e) {
					// En caso de fallar con el valor introducido, el programa dara un error.
					// Sin embargo, este metodo se usa para controlar la salida del error con un
					// mensaje.
					System.out.println("Entrada incorrecta, solo se admite numeros entre 1 y 6");
				}

			} while ((opcion <= 1) && (opcion >= 6));
			// Mientras la opcion elegida sea menor que uno y mayor que seis, el metodo do{}
			// while(); ira constantemente efectuando la operacion de volver a preguntar por
			// la opcion a elegir valida.

			switch (opcion) {
				case 1:
					// Modificamos el nombre del entrenador.

					System.out.println("teclea nuevo nombre ");
					String nombre_entrenador = Leer.pedirCadena();
					// Metodo Leer.pedirCadena() se encarga de leer el nombre del entrenador y
					// validarlo.

					miEntrenador.setNombre(nombre_entrenador);
					// Sustituye el nombre del entrenador en la variable miEntrenador.

					break;
				case 2:
					// Modificamos apellido entrenador.

					System.out.print("teclea nuevos apellidos : ");
					String apellido_entrenador = Leer.pedirCadena();
					// Metodo Leer.pedirCadena() se encarga de leer el apellidos del entrenador y
					// validarlo.

					miEntrenador.setApellidos(apellido_entrenador);
					// Sustituye el apellidos del entrenador en la variable miEntrenador.

					break;
				case 3:
					// Añadimos al nuevo atleta.

					System.out.println("nombre atleta: ");
					String nombre_atleta = Leer.pedirCadena();
					// Metodo usado para leer la cadena nombre_atleta.

					System.out.println("apellido atleta: ");
					String apellido_atleta = Leer.pedirCadena();
					// Metodo usado para leer la cadena apellido_atleta.

					System.out.println("categoria atleta: ");
					String categoria = Leer.pedirCadena();
					// Metodo usado para leer la cadena categoria_atleta.

					miEntrenador.addAtleta(nombre_atleta, apellido_atleta, categoria);
					// La variable miEntrenador se llama con la operación de addAtleta de la clase
					// para añadir los nombres, apellidos y la categoria.

					break;
				case 4:
					// Modifcamos atleta.

					if (miEntrenador.listarAtletas() == true) {
						// Condicion usada para comprobar el contenido de la lista e Atletas.
						// En caso de encontrarse vacia se mostrara mensaje de lista vacia.

						System.out.println("Selecciona un atleta");
						int y3 = Leer.pedirEnteroValidar();
						// Lee el valor y3 y comprueba que es valido.

						Atleta aux3 = miEntrenador.searchAtleta(y3);
						// Se crea una variable de tipo Atletas y almacenara lo que se buscara de la MMP
						// según el valor de y3.

						modifyAtleta(aux3);
						// Una vez se encuentre el atleta aux3 cuyo valor es y3, se aplicaran los
						// cambios hechos arriba.
					}

					break;

				case 5:
					// Borramos atleta.

					if (miEntrenador.listarAtletas() == true) {
						// Condicion que se usa para mostrar al atleta de la lista en caso de no haber
						// atletas en la lista, se mostrara un mensaje de lista vacía.

						System.out.println("Selecciona un atleta");
						int y4 = Leer.pedirEnteroValidar();
						// Se crea una variable integer y4, que será almacenada por Leer.

						Atleta aux4 = miEntrenador.searchAtleta(y4);
						// Se buscara la variable aux4 de tipo Atleta, almacenando el valor encontrado

						miEntrenador.removeAtleta(aux4);
						// Una vez se encuentre al atleta cuyo valor sea igual a y4, se procedera a
						// eliminarse.
						// En caso de que no exista el atleta elegido por el valor introducido por el
						// usuario, se mostrara un mensaje de no podder borrar.

					}

					break;

				case 6:
					// Listar todos los atletas.

					miEntrenador.listarAtletas();
					// Se mostrara a los atletas de la lista.
					// En caso de que la lista este vacia, el metodo .listarAtletas() de la clase
					// Entrenador nos mostrara un mensaje de lista vacia.

					break;

				case 7:

					break;

				default:
					System.out.println("has metido un numero incorrecto, solo se permiten numeros de 1 hasta 7");

			}
		} while (opcion != 7);
		// Esta operación nos evuleve al menu anterior.
	}

	public void MenuEntrenador(ListaEntrenadores entrenadores) {
		// Cada vez que llamamos a uno de la Lista_entrenadores ponemos entrenadores
		// delante.
		// Se crea el metodo de MenuEntrenador, que tiene los atributos de la clase de
		// ListaEntrenadores y cuya variable principal es entrenadores.

		int opcion = 0;
		// se crea variable interger con valor inicial 0.
		// Esta variable nos permite elegir la opcion del menu que dispongamos.

		do {
			System.out.println("\n****Menu Entrenadores****");

			System.out.println("1. Insertar Entrenador");

			System.out.println("2. Listar Entrenador");

			System.out.println("3. Modificar Entrenador");

			System.out.println("4. Borrar Entrenador");

			System.out.println("5. Mostrar todos los entrenadores ");

			System.out.println("6. Salir");

			System.out.println("************************************");

			do {
				// Una vez mostrado el menu, se nos enseñara un texto que nos dira que
				// introduzcamos un valor entero para uno de los casos del menu.

				try {
					System.out.print("Escribe una de las opciones :  ");
					opcion = Leer.pedirEnteroValidar();
					// Lee la opción introducida y la almacena.
					// En caso de que no sea valida el programa pasara a la siguiente operación,
					// mostrando el mensaje de control de error catch().

				} catch (Exception e) {
					// Metodo usado para el control del error del programa.
					System.out.println("Entrada incorrecta 3 , solo se admite numeros entre 1 y 6");
				}

			} while ((opcion <= 1) && (opcion >= 6));
			// Esta condicion hace repetir al programa la de elegir una opcion correcta de
			// manera indefinida hasta que el usuario introuzca el valor correcto.
			// Esta condicion compruba si el integer se encuentra en la condicion que se
			// establece, en este caso si se introduce un valor fuera de los casos del menu
			// se repetira hasta que esta no cumpla la condición del while();

			switch (opcion) {

				case 1:

					System.out.print("Nombre entrenador: ");
					String nombre_entrenador = Leer.pedirCadena();
					// Metodo usado para leer la cadena del nombre del entrenador.

					System.out.print("Apellido entrenador: ");
					String apellido_entrenador = Leer.pedirCadena();
					// Metodo usado para leer la cadena del apellido deel entrenador.

					entrenadores.addEntrenador(nombre_entrenador, apellido_entrenador);
					// La variable entrenadores se llama con la operación de addEntrenador de la
					// clase,
					// para añadir los nombres y apellidos.

					break;

				case 2:

					System.out.print("Nombre entrenador: ");
					String nombre_entrenador2 = Leer.pedirCadena();
					// Metodo usado para leer la cadena del nombre del entrenador.

					System.out.print("Apellido entrenador: ");
					String apellido_entrenador2 = Leer.pedirCadena();
					// Metodo usado para leer la cadena del apellido del entrenador.

					entrenadores.listarEntrenador(nombre_entrenador2, apellido_entrenador2);
					// Se mostrara el entrenador por el nombre y apellido usados.
					// Este metodo .listarEntrenador se encuentra en la clase de ListaEntrenadores y
					// se encarga de buscar el nombre y apellido usando el metodo .searchEntrenador
					// y el cual dira si se encuentra en la lista o no aparece en ella.

					break;

				case 3:

					System.out.println("Selecciona el entrenador a modificar: ");

					entrenadores.listarEntrenadores();
					// Se mostrara la lista de entrenadores que haya junto a la posicion de la
					// entidad.
					// En caso de que la lista este vacía, se mostrara un mensaje de que esta vacía.

					int y = Leer.pedirEnteroValidar();
					// Se crea una variable integer que se leera y almacenara según el metodo Leer.

					modifyEntrenador(entrenadores.searchEntrenador(y));
					// Una vez se haya encontrado al entrenador según el valor deseado, el metodo
					// modificar entrenador entrara en ejecución.

					break; // Fin del tercer metodo, evita que una vez hayamos acabado en este metodo
							// continue de maneraseguida con el caso 4.

				case 4:

					if (entrenadores.listarEntrenadores() == true) {
						// Metodo usado para comprobar que la lista de entrenadores tenga contenido, en
						// caso de ser true se ejecutara el null del contenido.
						System.out.println("Selecciona un entrenador");
						int y4 = Leer.pedirEnteroValidar();
						// Se crea una variable y4 que sera almacenada y comprobada por el metodo Leer.

						Entrenador aux4 = entrenadores.searchEntrenador(y4);
						// Se crea la variable aux4 de tipo Entrenador, para buscar el valor y4
						// introducido por el usuario.

						entrenadores.removeEntrenador(aux4);
						// Esta operacion elimina el valor y4 de aux4 que el usuario haya tecleado.
						// En caso de no encontrarse el valor introducido, el programa mostrara un
						// mensaje de error.
					}

					break;

				case 5:

					entrenadores.listarEntrenadores();
					// Este metodo se encarga de mostrar todo lo que contenga el listado de
					// Entrenador, incluyendo a los atletas que tenga el entrenador y las marcas de
					// las pruebas que hagan.
					// En caso de que la lista de entrenaodores este vacia, se mostrara un mensaje
					// de vacia.

					break;

				case 6:

					break;

				default:
					System.out.println("has metido un numero incorrecto, solo se permiten numeros de 1 hasta 6");

			}
		} while (opcion != 6);
		// Esta condicion se encarga de poner fin al programa princiapal y al resto de
		// menus.
		// En caso de que el usuario quiera acabar el programa solo tendrá que pulsar el
		// boton que cumpla la condicion del while().

	}

}
