package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
	 * programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta
	 * y seis”.
	 */
	public static void main(String[] args) {
		// Creamos la variable donde guardaremos el número que vamos a pedir al usuario.
		int numero;
		// creamos variables string para todos los números que vamos a necesitar

		String valorUnidad, valorDecena;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// creamos un do while para pedir un número entero al usuario y si no lo da
		// correcto lo volverá a pedir.
		do {
			// pedimos el número
			System.out.println("Introduce un número entero entre 1 y 99");
			// guardamos el número
			numero = sc.nextInt();
			// creamos un if para mostrar un mensaje de error si el número introducido no se
			// encuentra en el rango deseado
			if (numero <= 0 || numero > 99) {
				// imprimimos el mensaje que se mostrará cuando el valor introducido sea
				// incorrecto.
				System.out.println("El número introducido no es correcto.");
			}
			// establecemos la condición de salida del bucle.
		} while (numero <= 0 || numero > 99);

		int unidad = numero % 10;
		int decena = numero / 10;

		if (numero < 10) {

			valorUnidad = switch (unidad) {
			case 1 -> "uno";
			case 2 -> "dos";
			case 3 -> "tres";
			case 4 -> "cuatro";
			case 5 -> "cinco";
			case 6 -> "seis";
			case 7 -> "siete";
			case 8 -> "ocho";
			case 9 -> "nueve";
			default -> "";
			};
			System.out.println("El número introducido es " + valorUnidad);
		}
		if (numero == 10) {
			System.out.println("El número introducido es diez");
		}
		if (numero == 20) {
			System.out.println("El número introducido es el veinte");
		}
		if (numero == 30) {
			System.out.println("El número introducido es el treinta");
		}
		if (numero == 40) {
			System.out.println("El número introducido es el cuarenta");
		}
		if (numero == 50) {
			System.out.println("El número introducido es el cincuenta");
		}
		if (numero == 60) {
			System.out.println("El número introducido es el sesenta");
		}
		if (numero == 70) {
			System.out.println("El número introducido es el setenta");
		}
		if (numero == 80) {
			System.out.println("El número introducido es el ochenta");
		}
		if (numero == 90) {
			System.out.println("El número introducido es el noventa");
		}
		if (numero > 10 && numero < 20) {

			valorUnidad = switch (unidad) {
			case 1 -> "once";
			case 2 -> "doce";
			case 3 -> "trece";
			case 4 -> "catorce";
			case 5 -> "quince";
			case 6 -> "dieciséis";
			case 7 -> "diecisiete";
			case 8 -> "dieciocho";
			case 9 -> "diecinueve";
			default -> "";
			};
		}
		if (numero > 20 && numero != 30 && numero != 40 && numero != 50 && numero != 60 && numero != 70 && numero != 80
				&& numero != 90 && numero <= 99) {
			valorDecena = switch (decena) {
			case 2 -> "veinti";
			case 3 -> "treinta y ";
			case 4 -> "cuarenta y ";
			case 5 -> "cincuenta y ";
			case 6 -> "sesenta y ";
			case 7 -> "setenta y ";
			case 8 -> "ochenta y ";
			case 9 -> "noventa y ";
			default -> "";
			};
			valorUnidad = switch (unidad) {
			case 1 -> "uno";
			case 2 -> "dos";
			case 3 -> "tres";
			case 4 -> "cuatro";
			case 5 -> "cinco";
			case 6 -> "seis";
			case 7 -> "siete";
			case 8 -> "ocho";
			case 9 -> "nueve";
			default -> "";
			};
			System.out.println("El número introducido es " + valorDecena + valorUnidad);
		}
		// cerramos escaner
		sc.close();
	}
}
