package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Utiliza un operador ternario para calcular el valor absoluto de un número que
	 * se solicita al usuario por teclado.
	 */
	/*
	 * Entrada: 0 |Res. Esperado: 0 |Res. Obtenido: 0 
	 * Entrada: 2|Res. Esperado: 2 |Res. Obtenido: 2
	 * Entrada: -1 |Res. Esperado: -1 |Res. Obtenido: -1
	 */
	public static void main(String[] args) {
		// creamos variable para el número a guardar
		int numero;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// pedimos un número al usuario
		System.out.println("Introduce un número");
//guardamos el número introducido
		numero = sc.nextInt();
//aplicamos ternaria
		numero = numero > 0 ? numero : -(numero);
//imprimimos por pantalla el valor final de la variable número.
		System.out.println("El número absoluto del valor introducido es: " + numero);
//cerramos escaner
		sc.close();
	}
}
