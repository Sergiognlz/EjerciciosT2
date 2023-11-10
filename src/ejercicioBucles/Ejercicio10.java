package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Realiza un programa que nos diga si un número introducido por teclado es
	 * capicúa o no. El número debe ser mayor o igual que 0.
	 * 
	 * Entrada: -5 |Res. Esperado: repetición |Res. Obtenido: repetición 
	 * Entrada: 101 |Res. Esperado: Es capicúa|Res. Obtenido: Es capicúa 
	 * Entrada: 2005 |Res. Esperado: No es capicúa |Res.Obtenido: No es capicúa 
	 * Entrada: 666666 |Res. Esperado:Es capicúa |Res. Obtenido:Es capicúa
	 */
	public static void main(String[] args) {
		// Creamos variables para número, número del revés, número auxiliar y la última cifra
		long num = 0, numReves = 0, auxiliar, ultimaCifra;
		//creamos escaner
		Scanner sc = new Scanner(System.in);
		//creamos do while con try catch para añadir excepciones
		do {
			try {
				//pedimos número al usuario
				System.out.println("Introduce un número postivo mayor que 0.");
				//guardamos número
				num = sc.nextLong();
				//añadimos excepciones
			} catch (InputMismatchException e) {
				//mensaje de error
				System.out.println("El valor introducido no es válido");
				//limpiamos escaner
				sc.nextLine();
			}
		} while (num <= 0);
		//igualamos auxiliar al número introducido
		auxiliar = num;
		//creamos while
		while (auxiliar > 0) {
			//calcualamos las cifras
			ultimaCifra = auxiliar % 10;
			numReves = numReves * 10 + ultimaCifra;
			auxiliar /= 10;

		}
		//if para comprobar que el número es igual hacia delante y al revés
		if (numReves == num) {
			//imprimimos mensaje cuando sea capicúa
			System.out.println("Es capicúa.");
			
		} else {
			//imprimimos mensaje cuando no sea capicúa
			System.out.println("No es capicúa.");
		}
		//cerramos escaner
		sc.close();
	}

}
