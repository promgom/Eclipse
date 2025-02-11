
import java.util.Scanner;

public class Practica3 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Practica 3 Tema 1 Entornos de Desarrollo");
		System.out.println("Autor: Paloma Romero Gombau");
	
		System.out.print("Escribe un texto: ");
		
		String texto = teclado.nextLine();
		
		System.out.print("Introduce el primer numero: ");
		int num1 = teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2 = teclado.nextInt();
		System.out.print("Introduce el tercer numero: ");
		int num3 = teclado.nextInt();
		
		System.out.print("Introduce un numero con decimales: ");
		double numDecimales = teclado.nextDouble();
		
		//PARTE 2: procesamiento de datos
		if(num1 < 0) {
			num1 = num1 * -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		if(num3 < 0) {
			num3 = num3 * -1;
		}
		
		int resultado = num2 * num3 + num1;
		
		double numArriba = Math.ceil(numDecimales);
		double numAbajo = Math.floor(numDecimales);
		
		//PARTE 3: salida de datos
		
		System.out.println("El texto es: " + texto);
		System.out.println(num2 + " x " + num3 + " + " + num1 + " = " + resultado);
		
		System.out.println("Numero con decimales = " + numDecimales);
		System.out.println("Numero con decimales por arriba = " + numArriba);
		System.out.println("Numero con decimales por abajo = " + numAbajo);
		
		teclado.close();
		
		System.out.print("Fin del programa.");
		
	}
}





