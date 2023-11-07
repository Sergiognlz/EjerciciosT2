package ejercicioBucles;

import java.util.Scanner;

public class Ejercicio1 {
		/*
		 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
		 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
		 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
		 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
		 * resultado a mostrar es 14:00:01.
		 */
	public static void main(String[] args) {
		// creamos una variable para cada fragmento horario.
		int horas, minutos, segundos,incremento=0;
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
		
		//pedimos el incremento de segundos
		do {
			System.out.println("Introduce los segundos a incrementar");
			incremento=sc.nextInt();
			if(incremento<0||incremento>59) {
				System.out.println("El valor introducido a incrementar no es válido.");
			
			}
		}while(incremento<0||incremento>59);
		
		//realizamos el incremento de un segundo
		segundos+=incremento;
		//creamos excepciones con if para cuando los valores con el incremento se salgan del rango que queremos
		if (segundos >= 60) {
			segundos =(segundos-60);
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