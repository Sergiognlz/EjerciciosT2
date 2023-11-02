package ejerciciosCondicionales;

import java.util.Scanner;

/*En una granja se compra diariamente una cantidad de comida para los animales. 
 Los animales son todos de la misma especie y sabemos que cada animal come los mismos kilos de comida de media diariamente.
Diseña un programa que solicite al usuario los valores anteriores 
(cantidad de comida comprada, número de animales y kilos de comida que comen todos los animales en total),
 y determine si disponemos de alimento suficiente para cada animal. 
 En caso negativo, debe calcular cuál es la ración que corresponde a cada uno de los animales.


*/
public class Ejercicio3 {
public static void main(String[] args) {
	//creamos variables para los valores que guardaremos 
	double comidaComprada,comidaConsumida;
	int animales;
	//creamos escanner 
	Scanner sc=new Scanner(System.in);
	//pedimos al usuario que introduzca los valores que necesitaremos
	System.out.println("Introduce la cantidad de comida comprada");
	//guardamos el valor
	comidaComprada=sc.nextDouble();
	//descartamos en caso de que el valor introducido no sea válido
	if (comidaComprada<0){
		//mostramos mensaje de error si el valor introducido no es válido
		System.out.println("El valor introducido no es válido");
	}
//seguimos pidiendo valores
	System.out.println("Introduce el número de animales que hay");
	//guardamos el valor
	animales=sc.nextInt();
	//descartamos en caso de que el valor introducido no sea válido
		if (animales<0){
			//mostramos mensaje de error si el valor introducido no es válido
			System.out.println("El valor introducido no es válido");
			
}
		//terminamos de pedir los valores necesarios
		System.out.println("Introduce la cantidad de comida que consumen los animales");
		//guardamos el valor
		comidaConsumida=sc.nextDouble();
		//descartamos en caso de que el valor introducido no sea válido
		if (comidaConsumida<0){
			//mostramos mensaje de error si el valor introducido no es válido
			System.out.println("El valor introducido no es válido");
		}
		//
}
}