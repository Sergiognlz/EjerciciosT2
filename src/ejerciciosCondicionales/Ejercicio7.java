package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo
	 * que muestre la hora después de incrementarle un segundo.
	 
	 *Entrada: Horas=36 Minutos=74 Segundos=67 |Res. Esperado: error |Res. Obtenido: error
	 *Entrada: Horas=12 Minutos=35 Segundos=20 |Res. Esperado: error |Res. Obtenido: 12:35:21
	 *Entrada: Horas=23 Minutos=59 Segundos=59 |Res. Esperado: error |Res. Obtenido: 0:0:0
	 */
	public static void main(String[] args) {
		// creamos una variable para cada fragmento horario.
		int horas, minutos, segundos;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// creamos un do while para que si introducimos un valor no válido nos dé un
		// error y nos lo pida de nuevo.
		do {
			// pedimos al usuario que introduzca las horas
			System.out.println("Introduce las horas");
			// guardamos horas
			horas = sc.nextInt();
			if (horas < 0 || horas > 23) {
				System.out.println("El valor introducido para horas no es válido.");
			}
		} while (horas < 0 || horas > 23);
		//repetimos proceso con minutos y horas
		do {
			// pedimos minutos
			System.out.println("Introduce los minutos");
			// guardamos minutos
			minutos = sc.nextInt();
			if (minutos < 0 || minutos > 59) {
				System.out.println("El valor introducido para minutos no es válido.");
			}
		} while (minutos < 0 || minutos > 59);

		do {
			// pedimos segundos
			System.out.println("Introduce los segundos");
			// guardamos segundos
			segundos = sc.nextInt();
			if (segundos < 0 || segundos > 59) {
				System.out.println("El valor introducido para segundos no es válido");
			}

		} while (segundos < 0 || segundos > 59);
		//realizamos el incremento de un segundo
		segundos++;
		//creamos excepciones con if para cuando los valores con el incremento se salgan del rango que queremos
		if (segundos >= 60) {
			segundos = 0;
			minutos++;
		}
		if (minutos >= 60) {
			minutos = 0;
			horas++;
		}
		if (horas >= 24) {
			horas = 0;
		}
		//imprimimos pantalla con el resultado
		System.out.println("Son las " + horas + ":" + minutos + ":" + segundos);
		//cerramos escaner
		sc.close();
	}
}
