package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
	/*En una granja se compra diariamente una cantidad de comida para los animales. 
	 Los animales son todos de la misma especie y sabemos que cada animal come los mismos kilos de comida de media diariamente.
	Diseña un programa que solicite al usuario los valores anteriores 
	(cantidad de comida comprada, número de animales y kilos de comida que comen todos los animales en total),
	 y determine si disponemos de alimento suficiente para cada animal. 
	 En caso negativo, debe calcular cuál es la ración que corresponde a cada uno de los animales.
	*/
	
	/*Entrada: Comida comprada:-5, Animales:-1, Kilos Totales: -200 |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: Comida comprada:200, Animales:20, Kilos Totales: 180 |Res. Esperado: Suficiente comida |Res. Obtenido: Suficiente comida
	 *Entrada: Comida comprada:200, Animales:20, Kilos Totales: 240 |Res. Esperado: Comida insuficiente. Animales comen 12 kg comida |Res. Obtenido:Comida insuficiente. Animales comen 12 kg comida
	*/
	
	public static void main(String[] args) {
		// creamos variables para los valores que guardaremos
		double comidaComprada, comidaConsumida;
		int animales = 0;
		// creamos escanner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario que introduzca los valores que necesitaremos

		do {
			System.out.println("Introduce los kilos de comida comprada");
			// guardamos el valor
			comidaComprada = sc.nextDouble();
			if (comidaComprada < 0) {
				// mostramos mensaje de error si el valor introducido no es válido
				System.out.println("El valor introducido no es válido");
			}

		} while (comidaComprada <= 0);
		{
		}
		do {
			// seguimos pidiendo valores
			System.out.println("Introduce el número de animales que hay");
				// guardamos el valor
				animales = sc.nextInt();
			
				if(animales<=0) {
				// mostramos mensaje de error si el valor introducido no es válido
				System.out.println("El valor introducido no es válido");
			}
		} while (animales <= 0);

		do {
			// terminamos de pedir los valores necesarios
			System.out.println("Introduce los kilos de comida totales que consumen los animales");
			// guardamos el valor
			comidaConsumida = sc.nextDouble();
			// descartamos en caso de que el valor introducido no sea válido
			if (comidaConsumida < 0) {
				// mostramos mensaje de error si el valor introducido no es válido
				System.out.println("El valor introducido no es válido");
			}
		} while (comidaConsumida < 0);
		{

		}
		// comparamos los valores y sacamos por pantalla
		if (comidaComprada >= comidaConsumida) {
			System.out.println("Hay suficiente comida para cada animal");
		} else {
			System.out.println(
					"No hay suficiente comida. Cada animal consume " + comidaConsumida / animales + " kg de comida.");
		}
		sc.close();

	}
}
