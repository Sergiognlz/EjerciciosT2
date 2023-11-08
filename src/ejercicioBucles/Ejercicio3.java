package ejercicioBucles;

import java.util.Scanner;

public class Ejercicio3 {
	/* Solicita al usuario un número n y dibuja un triángulo de base y altura n. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		//creamos do para que en caso de valor 0 o inferior nos salte un error y nos lo pida de nuevo.
		do {
			//pedimos el número que usaremos para la base y la altura del triángulo
		System.out.print("Introduce un número para la base y altura del triángulo: ");
		 numero = sc.nextInt();
		 //creamos if para mostrar mensaje en caso de un valor 0 o inferior
		 if(numero<=0) {
			 System.out.println("El valor introducido no es válido");
		 }
		}while(numero<=0);
	
		// Dibujo el triángulo
		for (int a = 1; a <= numero; a++) {
			// pongo espacios en blanco antes de los asteriscos
			for (int b = 1; b <= numero - a; b++) {
				System.out.print(" ");
			}

			// pongo asteriscos
			for (int c = 1; c <= a; c++) {
				System.out.print("*");
				System.out.print(" ");
			}

			// pongo una nueva línea después de cada fila
			System.out.println();
		}
	}
}
