package ejercicioBucles;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realiza un programa que nos pida un número n y nos diga cuántos números hay
	 * entre 1 y n que sean primos.
	 * 
	 *Entrada: -5 |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: 4 |Res. Esperado:  2 |Res. Obtenido: 2
	 *Entrada: 10 |Res. Esperado: 4 |Res. Obtenido: 4
	 *Entrada: 25 |Res. Esperado: 9 |Res. Obtenido: 9
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// creamos las variables
		int numero, i, contador = 0;
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
			//creamos un for para contar los números
		for (int incremento = 2; incremento <= numero; incremento++) {
			//creamos otro for para comprobar si el número es primo
			for (i = 2; i < incremento; i++) {
				//if que detecte que el número no sea primo
				if (incremento % i == 0) {
					primo = false;

					break;
				}

			}
			//si no es primo, es primo
			if (primo) {
				contador++;
			}

			primo = true;
		}
		//imprimimos pantalla contador
		System.out.println(contador);

		sc.close();
	}
}