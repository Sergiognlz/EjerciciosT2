package ejercicioBucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		//varible
		long num=0, numReves=0, auxiliar, ultimaCifra;
		Scanner sc=new Scanner(System.in);
		
		do {
			try {
				System.out.println("Introduce un número postivo.");
				num=sc.nextLong();
				
			}catch(InputMismatchException e) {
				System.out.println("El valor introducido no es válido");
				sc.nextLine();
			}	
			}while(num<0);
		auxiliar=num;
		while(auxiliar>0) {
			ultimaCifra=auxiliar%10;
			numReves=numReves*10+ultimaCifra;
			auxiliar/=10;
			
		}
		if(numReves==num) {
			System.out.println("Es capicúa.");
		
		}else {
			System.out.println("No es capicúa.");
		}
	
		
		sc.close();	
	}
	
	
	
	
}

