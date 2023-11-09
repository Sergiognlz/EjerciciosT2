package ejerciciosCondicionales;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
	 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La
	 * aplicación le pedirá al usuario que introduzca el resultado de la suma. La
	 * aplicación le indicará si el resultado es correcto o no.
	
	 *Entrada: 68 + 91= 55 |Res. Esperado: Incorrecto |Res. Obtenido: Incorrecto
	 *Entrada: 72+52= 124|Res. Esperado: correcto |Res. Obtenido: correcto
	 *Entrada: 31 + 57= hshshd |Res. Esperado: error |Res. Obtenido: error 
	 *
	 *
	 */
	
	
	public static void main(String[] args) {
		// creamos random
		Random ran = new Random();
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// creamos la variables que utilizaremos
		int numero1=0, numero2=0, suma=0;
		//creamos el do while para el try catch
		do {
			try {
		//imprimimos los valores que se generan aleatoriamente y pedimos al usuario que introduzca la suma de ambos
		System.out.println("Suma " + (numero1 = ran.nextInt(1, 100)) + " y " + (numero2 = ran.nextInt(1, 100))
				+ " e introduce el resultado");
		//guardamos el valor de la suma introducido
		suma=sc.nextInt();
		//excepción
			}catch(InputMismatchException e) {
				//mensaje error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
			}
		
		}while(suma<=0);
		//creamos un do while para cuando el resultado no sea correcto.
		do {
			if (suma!=numero1+numero2) {
			System.out.println("El resultado no es correcto. Introduce el valor correcto de la suma de "+numero1+" y "+numero2);
			}
			suma=sc.nextInt();
			}while(suma!=numero1+numero2);
		//imprimimos pantalla cuando sea correcto y salga del bucle
		System.out.println("¡Correcto!");
		//cerramos escaner
		sc.close();
	}
	//cerramos escaner
	
}
