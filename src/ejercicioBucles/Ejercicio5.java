package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
	 * común múltiplo de dos números dados. En este caso, habrá que partir del
	 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
	 * múltiplo de los dos números.
	 */
	public static void main(String[] args) {
		// creamos variables para los números a y b
		int a = 0, b = 0, maximo = 1;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// creamos do while para evitar errores al introducir números
		do {
			try {
				System.out.println("Introduce el número A.");
				// guardamos el número
				a = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("El valor introducido para  A no es válido.");
				sc.nextLine();
			}
		} while (a <= 0);
		// repetimos para b
		do {
			try {
				System.out.println("Introduce el número B.");
				// guardamos el número
				b = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("El valor introducido para  B no es válido.");
				sc.nextLine();
			}
		} while (b <= 0);

		if (a <= b) {
			maximo = b;

		}

		else {

			maximo = a;
		}

		while (!(maximo % a == 0 && maximo % b == 0) ){
			maximo++;

		}
		System.out.println("El mínimo común múltiplo es: " + (maximo));

		sc.close();
	}
}