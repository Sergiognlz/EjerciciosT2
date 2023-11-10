package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Escribe un programa que lea un número n e imprima una pirámide de números con
	 * n filas como en la siguiente figura: 
	 *    1 
	 *   121 
	 *  12321 
	 * 1234321
	 * 
	 *Entrada: jdjd |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: -2 |Res. Esperado: repetición |Res. Obtenido: repetición
	 *Entrada: 0 |Res. Esperado:  |Res. Obtenido: 
	 *Entrada: 4 |Res. Esperado: 1	|Res. Obtenido: 1
							    121				   121
							   12321              12321	
							  1234321 			 1234321
	 * 
	 * 
	 * 
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
		} while (numero < 0 || numero >= 20);
		// creamos 1 for y dentro otros 3
		for (int fila = 1; fila <= numero; fila++) {
			//el primer for es para los espacios en blancos
			for (int columna = 1; columna <= numero - fila; columna++) {
				System.out.print(" ");
			}
			//el segundo para los hacia ascendentes
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print(columna);
			}
			// el tercero para los números descendentes
			for (int columna = fila - 1; columna >= 1; columna--) {
				System.out.print(columna);
			}
			//salto de línea
			System.out.println();
		}
		//cerramos escaner
		sc.close();
	}
}
