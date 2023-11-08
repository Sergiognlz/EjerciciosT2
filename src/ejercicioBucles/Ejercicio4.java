package ejercicioBucles;

import java.util.InputMismatchException;
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
		int a=0,b=0, contador;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		//creamos do while para evitar errores al introducir números
		
		do {
			try {
				System.out.println("Introduce el número A.");
				//guardamos el número
				a=sc.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("El valor introducido para  A no es válido.");
				sc.nextLine();
			}
		}while(a<=0);
			
			
			
		//repetimos para b
		
		do {
			try {
				System.out.println("Introduce el número B.");
				//guardamos el número
				b=sc.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("El valor introducido para  B no es válido.");
				sc.nextLine();
			}
		}while(b<=0);
			
		
		if(a<=b) {
			for( contador=a;contador>=1;contador--) {
			
				if(a%contador==0&&b%contador==0) {
						break;
				}
		}
		
		System.out.println("El máximo común divisor es: "+contador);
		
	}
		if(b<=a) {
			for( contador=b;contador>=1;contador--) {
			
				if(a%contador==0&&b%contador==0) {
					
					break;
				}
		}
		
		System.out.println("El máximo común divisor es: "+contador);
		
	}
		
		sc.close();
		
}
}