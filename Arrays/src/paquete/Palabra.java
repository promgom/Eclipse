import java.util.Scanner;

public class Palabra{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int c = 0;
		System.out.print("Introduce una palabra: ");
		String palabra = teclado.nextLine();
		int longitud = palabra.length();

		char[] caracteres = new char[palabra.length()];


		for (int i = 0; i < longitud; i++){
			c+=1;
			caracteres[i]=palabra.charAt(i);
			System.out.println(caracteres[i]);
		}

		System.out.println("La cantidad de caracateres es: "+c);
		
	}
}