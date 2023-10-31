package ejerciciosCondicionales;

import java.util.Scanner;

/*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
La aplicación tendrá que indicar si el número introducido es capicúa. 
Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.*/
public class Ejercicio1 {
	
	public static void main(String[] args) {
		// creamos la variable dónde guardar el número que usaremos
		int numero,decena,centena,millar;
		boolean capicua = false;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos un número al usuario
		System.out.println("Introduce un número comprendido entre 0 y 9999");
		numero = sc.nextInt();
		decena=(numero % 11==0);
		
		// primero descartamos el cero
		if (numero >= 0 && numero <= 9999) {
			if (numero >= 0 && numero <= 9) {
				capicua = true;
			} else if (numero >= 10 && numero <= 99) {
				if (numero % 11 == 0) {
					capicua = true;
				}
			} else if (numero >= 100 && numero <= 999) {
				centena=numero/100
				unidad=numero%10
				if ((numero / 10) % 10 == 0) {
					capicua = true;
				
				}
			} else if (numero >= 1000 && numero <= 9999) {
				if ((numero / 100) % 10 == 0) {
					capicua = true;
				} else if ((numero / 100) % 11 == 0) {
					capicua = true;
				}
			}

			if (capicua == true) {
				System.out.println("El número es capicúa");

			} else {
				System.out.println("El número no es capicúa");
			}

		} else
			System.out.println("El número introducido no es válido.");

		sc.close();
	}
}