import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] miArray = new int[10];

		for (int i = 0; i < 10; i++){
			System.out.print("Introduce un número: ");
			miArray[i] = teclado.nextInt();
		}

		System.out.println("Los números introducidos en el array y sus posiciones de forma inversa son: ");

		for (int i=9; i>=0; i--){
			System.out.println("La posición " + i + " del array contiene el número " + miArray[i]);
		}
	}
}