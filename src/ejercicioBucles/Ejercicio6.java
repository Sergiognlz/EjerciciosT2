package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
	 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
	 * número tantas veces como su valor.
	 */
	public static void main(String[] args) {
		// creamos variable número
		int numero = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// creamos do while para pedir el número
		do {
			// creamos try catch
			try {
				// pedimos el número al usuario
				System.out.println("Introduce un número.");
				// guardamos número
				numero = sc.nextInt();
				// ponemos el catch con la excepción
			} catch (InputMismatchException e) {
				// mensaje de error
				System.out.println("El valor introducido no es válido.");
				sc.nextLine();
			}
		} while (numero < 0 && numero >= 20);
		// creamos for
		for (int contador = 1; contador <= numero; contador++) {
			// imprimimos números
			System.out.println(contador);

		}

		sc.close();
	}
}
