import java.util.Scanner;

public class Ejercicio3{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] miArray = new int[10];

		for (int i = 0; i < 10; i++){
			System.out.print("Introduce un número: ");
			miArray[i] = teclado.nextInt();
		}

		int menor = miArray[0];
		int mayor = miArray[0];

		for (int i = 0; i < 10; i++){
			if (menor > miArray[i]){
				menor = miArray[i];
			} else if (mayor < miArray[i]){
				mayor = miArray[i];
			}
		}

		System.out.println("El número mayor es "+mayor+" y el menor es "+menor);

	}
}