package ejercicioBucles;

import java.util.Scanner;

public class Ejercicio3 {
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Solicitar al usuario un número n
	        System.out.print("Por favor, introduce un número para la base y altura del triángulo: ");
	        int n = sc.nextInt();
	        
	        // Dibujar el triángulo
	        for (int a = 1; a <= n; a++) {
	            // Espacios en blanco antes de los asteriscos
	            for (int b = 1; b <= n - a; b++) {
	                System.out.print(" ");
	            }
	            
	            // Asteriscos
	            for (int c = 1; c <= 2 * a - 1; c++) {
	                System.out.print("*");
	            }
	            
	            // Nueva línea después de cada fila
	            System.out.println();
	        }
	    }
	}
}
