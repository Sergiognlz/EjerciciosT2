package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
	 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
	 * número tantas veces como su valor.
	 * 
	 *Entrada: jdjd |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: -2 |Res. Esperado: repetición |Res. Obtenido: repetición
	 *Entrada: 0 |Res. Esperado:  |Res. Obtenido: 
	 *Entrada: 4 |Res. Esperado:1	|Res. Obtenido:1
							    22				   22
								333                333	
								4444 			   4444
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
		// creamos for para las filas
		for (int fila = 1; fila <= numero; fila++) {
			
			//creamos for para las columnas
			for(int columna=1;columna<=fila;columna++) {
				//imprimimos pantalla sin retorno con la variable fila
				System.out.print(fila);
			}
			//retorno de carro
			System.out.println();
		}
		//cerramos escaner
		sc.close();
	}
}
