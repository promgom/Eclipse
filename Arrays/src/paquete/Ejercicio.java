import java.util.Scanner;

public class Ejercicio{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int[] miArray = new int[10];

		for (int i=0; i<10; i++){
			System.out.print("Introduce un número: ");
			miArray[i] = teclado.nextInt();
		}

		System.out.print("Los número almacenados en el array son: ");
		
		for (int i=0; i<10; i++){
			System.out.println("La posición " + i + " del array contiene el número " + miArray[i]);
		}
	}
}