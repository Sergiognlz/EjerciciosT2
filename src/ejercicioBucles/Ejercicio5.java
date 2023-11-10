package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
	 * común múltiplo de dos números dados. En este caso, habrá que partir del
	 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
	 * múltiplo de los dos números.
	 * 
	 *Entrada: A=mdmdm B= |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: A=0 B= |Res. Esperado: repetición |Res. Obtenido: repetición
	 *Entrada: A=5 B=10 |Res. Esperado: 10|Res. Obtenido: 10
	 *Entrada: A=10 B=5 |Res. Esperado: 10|Res. Obtenido: 10
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
		//creamos un if para otorgar a la variabl maximo el valor mayor entre a y b.
		if (a <= b) {
			maximo = b;

		}

		else {

			maximo = a;
		}
		//creamos un while para que se active cuando se cumpla la condición
		while (!(maximo % a == 0 && maximo % b == 0) ){
			//incremento de la variable maximo.
			maximo++;

		}
		//imprimimos pantalla con el resultado
		System.out.println("El mínimo común múltiplo es: " + (maximo));
		//cerramos escaner
		sc.close();
	}
}