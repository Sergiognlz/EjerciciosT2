package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Determinar el precio de un billete de tren, conociendo la distancia a
	 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
	 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
	 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
	 * de estancia los debes solicitar al usuario por teclado.
	 */
	public static void main(String[] args) {
		//creamos variables donde guardar los valores que usaremos
		double billete,distancia;
		int dias;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//creamos do while para corregir  los valores
	do {
		//pedimos la distancia al usuario
		System.out.println("Introduce los kms recorridos");
		//guardamos los kms
		distancia=sc.nextDouble();
		//creamos if para mostrar mensaje si el valor introducido no es válido
		if(distancia<=0) {
			//mensaje error
			System.out.println("Los kms introducidos no son válidos");
		}
	}while(distancia<0);
	
	do {
		//pedimos los días de estancia
		System.out.println("Introduce los días de estancia");
		//guardamos los días
		dias=sc.nextInt();
		//if con valor error
		if(dias<0) {
			System.out.println("El valor introducido no es válido");
		}
		}while(dias<0);
	//creamos if para el descuento
	
	if(distancia>7&&distancia>800) {
		//imprimimos pantalla resultado
		System.out.println("El precio del billete es: "+((distancia*2.5)-((distancia*2.5)*0.30))+" €");
	}else {
		System.out.println("El precio del billete es: "+distancia*2.5+" €");
	}
	//cerramos escaner
	sc.close();
	
	}
}
