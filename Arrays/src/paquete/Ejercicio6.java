import java.util.Scanner;

public class Ejercicio6{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int i;
		int[] miArray = new int[10];

		for (i=0; i < 10; i++){
			System.out.print("Introduce un número: ");
			miArray[i] = teclado.nextInt();
		}

		for (i=0; i < 10; i++){
			if (miArray[i]%2==0){
				System.out.println("El número "+miArray[i]+" en la posición "+i+" es par.");
			}
		}
		System.out.println("------------------------------------------");

		for (i=0; i < 10; i++){
			if (miArray[i]%2!=0){
				System.out.println("El número "+miArray[i]+" en la posición "+ i +" es impar.");
			}
		}
	}
}