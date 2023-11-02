package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio2 {
	/*Entrada: 5 |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: 30250815 |Res. Esperado: L |Res. Obtenido: L
	*/
	
	
	public static void main(String[] args) {
//creamos la variable donde guardaremos el número
	int numero;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos al usuario que introduzca el número del dni
	System.out.println("Introduce tu DNI");
	//guardamos el número en la variable
	numero=sc.nextInt();
	//creamos un if para descartar cuando no introducimos un valor de 9 cifras.
	if (numero>=10000000&&numero<=99999999) {
		//creamos un switch con el módulo de 23 del número para calcular a qué letra equivale cada DNI
		switch(numero%23) {
		case 0->{
			System.out.println("La letra de tu DNI es T");
		}
		case 1->{
			System.out.println("La letra de tu DNI es R");
		}
		case 2->{
			System.out.println("La letra de tu DNI es W");
		}
		case 3->{
			System.out.println("La letra de tu DNI es A");
		}
		case 4->{
			System.out.println("La letra de tu DNI es G");
		}
		case 5-> {
			System.out.println("La letra de tu DNI es M");
		}
		case 6->{
			System.out.println("La letra de tu DNI es Y");
		}
		case 7->{
			System.out.println("La letra de tu DNI es F");
		}
		case 8->{
			System.out.println("La letra de tu DNI es P");
		}
		case 9->{
			System.out.println("La letra de tu DNI es D");
		}
		case 10->{
			System.out.println("La letra de tu DNI es X");
		}
		case 11->{
			System.out.println("La letra de tu DNI es B");
		}
		case 12->{
			System.out.println("La letra de tu DNI es N");
		}
		case 13->{
			System.out.println("La letra de tu DNI es J");
		}
		case 14->{
			System.out.println("La letra de tu DNI es Z");
		}
		case 15->{
			System.out.println("La letra de tu DNI es S");
		}
		case 16->{
			System.out.println("La letra de tu DNI es Q");
		}
		case 17->{
			System.out.println("La letra de tu DNI es V");
		}
		case 18->{
			System.out.println("La letra de tu DNI es H");
		}
		case 19->{
			System.out.println("La letra de tu DNI es L");
		}
		case 20->{
			System.out.println("La letra de tu DNI es C");
		}
		case 21->{
			System.out.println("La letra de tu DNI es K");
		}
		case 22->{
			System.out.println("La letra de tu DNI es E");
		}
		}
	
	//creamos el mensaje de error que se mostrará cuando el número no sea válido
	}else {
		System.out.println("El número introducido no es válido");
	}
		
	//cerramos el escaner
sc.close();
}
}