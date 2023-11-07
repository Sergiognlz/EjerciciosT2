package ejercicioBucles;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realiza un programa que nos pida un número n y nos diga cuántos números hay
	 * entre 1 y n que sean primos.
	 */
	public static void main(String[] args) {
		// creamos las variables
		int numero;
		boolean primo = true;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		do {

			// pedimos un número al usuario
			System.out.println("Introduce un número entero positivo y contaremos cuanto números primos hay hasta él");
			// guardamos el número introducido
			numero = sc.nextInt();
			if (numero < 1) {
				System.out.println("El número introducido no es correcto.");
			}
		} while (numero < 1);

		if (numero > 1) {

			for (int i = 2; i < numero; i++) {
				
				if (numero % i == 0) {
					primo = false;
					break;
		
				}
			}
		} else if (numero == 1) {
			primo = false;
		}
		if (primo == false) {
			System.out.println("No es primo");
		}

		else {
			System.out.println("Es primo");

		}

		sc.close();

	}
}