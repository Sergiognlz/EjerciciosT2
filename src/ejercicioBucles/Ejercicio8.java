package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
	 * el último dado. La introducción de números finaliza con la introducción de un
	 * 0. Al final se mostrará: El total de números introducidos, excluido el 0. El
	 * total de números fallados.
	 */
	public static void main(String[] args) {
		// creamos tres variables
		int numeroInicial = 1, numero = 1, introducido = 0, fallado = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// hacemos el try catch con un do while para el número inicial
		do {
			try {
				// pedimos un número inicial
				System.out.println("Introduce el número inicial");
				// guardamos ese número
				numeroInicial = sc.nextInt();
				// poner excepción
			} catch (InputMismatchException e) {
				// mensaje de error
				System.out.println("El valor introducido no es válido.");
				// limpiamos escaner
				sc.nextLine();
			}
			// condición de salida
		} while (numeroInicial < 0);
		// creamos otro do while con para los números que se pedirán y guardarán a
		// continuación
		do {
			// otro try catch
			try {
				// pedimos otro número con el que se comparará el inicial
				System.out.println("Introduce el número");
				// guardamos ese número
				numero = sc.nextInt();
				// incrementamos contador de números introducidos
				introducido++;
				// creamos un if con la comparación en la que entrará si el número introducido
				// es menor que el número inicial y no es 0
				if (numero < numeroInicial && numero != 0) {
					// mensaje de fallo
					System.out.println("Fallo, es menor");
					// incrementamos contador de fallados
					fallado++;
				}
				// excepción
			} catch (InputMismatchException e) {
				// mensaje de error
				System.out.println("El valor introducido no es válido.");
				// limpiamos escaner
				sc.nextLine();
			}

			// salida del do while cuando introduzcamos un 0
		} while (!(numero == 0));
		// impresión de pantalla con los contadores de números introducidos y números
		// fallados.
		System.out.println("Numeros introducidos: " + introducido);
		System.out.println("Numeros fallados: " + fallado);

		// cerramos escaner
		sc.close();
	}

}
