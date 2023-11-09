package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Escribe un programa que lea un número n e imprima una pirámide de números con
	 * n filas como en la siguiente figura: 
		1
		121
		12321
		1234321
	 */
	public static void main(String[] args) {
		// creamos variable número
		int numero = 0,contador=1;
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
		for (int fila = 1; fila <= numero; fila++) {
			// imprimimos números
			
			for (int columna = 1; columna <= fila; columna++) {	
				System.out.print(contador);
			}
			System.out.println();
			contador++;
		
		}
		sc.close();
	}
}
