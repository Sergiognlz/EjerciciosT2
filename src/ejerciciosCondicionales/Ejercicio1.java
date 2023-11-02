package ejerciciosCondicionales;

import java.util.Scanner;

/*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
La aplicación tendrá que indicar si el número introducido es capicúa. 
Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.*/
public class Ejercicio1 {
	
	/*Entrada: -5 |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: 50000 |Res. Esperado: Error |Res. Obtenido: Error
	 *Entrada: 5 |Res. Esperado: Es capicúa |Res. Obtenido: Es capicúa
	 *Entrada: 25 |Res. Esperado: No es capicúa |Res. Obtenido: No es capicúa
	 *Entrada: 55 |Res. Esperado:Es capicúa |Res. Obtenido: Es capicúa
	 *Entrada: 666 |Res. Esperado: Es capicúa |Res. Obtenido: Es capicúa
	 *Entrada: 733 |Res. Esperado: No es capicúa |Res. Obtenido: No es capicúa
	 *Entrada: 2002 |Res. Esperado: Es capicúa |Res. Obtenido: Es capicúa
	 *Entrada: 5345 |Res. Esperado: No es capicúa |Res. Obtenido: No es capicúa
	 */
	public static void main(String[] args) {
		// creamos la variable dónde guardar el número que usaremos así como donde guardaremos cada carácter de dicho número. 
		int numero,unidad,decena,centena,millar;
		boolean capicua = false;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos un número al usuario
		System.out.println("Introduce un número comprendido entre 0 y 9999");
		numero = sc.nextInt();
	
		
		// primero descartamos el cero
		if (numero >= 0 && numero <= 9999) {
			//creamos un condicional para los valores de 1 cifra
			if (numero<= 9) {
				capicua = true;
				//creamos un condicional para los valores de 2 cifras
			} else if (numero <= 99) {
				//Si el número es divisible por 11 será capicúa
				if (numero % 11 == 0) {
					capicua = true;
				}
				//creamos un condicional para los valores de 3 cifras
			} else if (numero <= 999) {
				//guardamos el carácter del número con el valor de las centenas y las unidades
				centena=numero/100;
				unidad=numero%10;
				//los comparamos para saber si es capicúa
				if (unidad==centena) {
					capicua = true;
				
				}
				//creamos un condicional para los valores de 4 cifras
			} else if (numero >= 1000 && numero <= 9999) {
				//guardamos el carácter del número con el valor de las centenas, millares, decenas y las unidades
				centena=(numero/100)%10;
				unidad=numero%10;
				millar=numero/1000;
				decena=(numero/10)%10;
				//los comparamos para saber si es capicúa
				if (centena==decena&&millar==unidad) {
					capicua = true;
				}
			}
			//en caso de que la condición sea true se mostrará el mensaje de que es capicúa
			if (capicua == true) {
				System.out.println("El número es capicúa");
				//en caso de que la condición sea false se mostrará el mensaje de que no es capicúa
			} else {
				System.out.println("El número no es capicúa");
			}
			//si el valor introducido no se encuentra entre los admitidos se mostrará el mensaje de error
		} else
			System.out.println("El número introducido no es válido.");
		//cerramos el escaner
		sc.close();
	}
}