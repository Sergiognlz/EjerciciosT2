package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	//varible
	int num=0;
	int contador=0;
	Scanner sc=new Scanner(System.in);
	
	do {
		try {
			System.out.println("Introduce un número.");
			num=sc.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("El valor introducido no es válido");
			sc.nextLine();
		}	
		}while(num<0);
	
	while(num>0) {
		num/=10;
		contador++;
	}
	
	System.out.println("El número tiene "+contador+ " cifras.");
	
	sc.close();	
}
}
