package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
	 * por teclado. El número introducido debe ser mayor que 0.
	 * 
	 *Entrada: hjfdhds |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: 0 |Res. Esperado: repetición |Res. Obtenido: repetición
	 *Entrada: 5 |Res. Esperado: 1 cifra |Res. Obtenido: 1 cifra
	 *Entrada: 55 |Res. Esperado: 2 cifras  |Res. Obtenido: 2 cifras 
	 *Entrada: 555 |Res. Esperado: 3 cifra |Res. Obtenido: 3 cifra
	 * 
	 */
	public static void main(String[] args) {
		// Creamos variables numero y contador
		int num = 0;
		int contador = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// do while con try catch para añadir excepciones
		do {
			try {
				// pedimos número al usuario
				System.out.println("Introduce un número.");
				// guardamos número
				num = sc.nextInt();
				// añadimos excepción
			} catch (InputMismatchException e) {
				// imprimimos mensaje error
				System.out.println("El valor introducido no es válido");
				// limpiamos escaner
				sc.nextLine();
			}
		} while (num <= 0);
		// creamos while para leer las cifras del número introducido
		while (num > 0) {
			num /= 10;
			// contador que registre las cifras
			contador++;
		}
		// imprimimos pantalla con el resultado
		System.out.println("El número tiene " + contador + " cifras.");
		// cerramos escaner
		sc.close();
	}
}
