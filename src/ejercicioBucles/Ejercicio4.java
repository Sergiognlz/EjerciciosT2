package ejercicioBucles;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Para dos números dados, a y b, es posible calcular el máximo común divisor
	 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
	 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
	 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
	 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
	 * divisor de dos números.
	 */
	public static void main(String[] args) {
		//creamos variables para los números a y b
		int a,b;
		boolean divisible=false;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		//creamos do while para evitar errores al introducir números
		
			//pedimos el primer número al usuario
			System.out.println("Introduce el número A.");
			//guardamos el número
			a=sc.nextInt();
			//ponemos if para mostrar el error
			while(a<=0) {
				System.out.println("El número introducido para el valor A no es válido.");
				System.out.println("Introduce el número A.");
				a=sc.nextInt();
			}
		
		//repetimos para b
		
			System.out.println("Introduce el número B.");
			b=sc.nextInt();
			while(b<=0) {
				System.out.println("El número introducido para el valor B no es válido.");
				System.out.println("Introduce el número B.");
				b=sc.nextInt();
			}
		
		
		if(a<=b) {
			for(int contador=a;contador>=1;contador--) {
				System.out.println(contador);
				if(a%contador==0) {
					divisible=true;
					
				}
		}
		
		
		
	}
		sc.close();
		
}
}