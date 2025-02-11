package paquete;

import java.util.Scanner;

public class Altura {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		float sum = 0;
		int i, mas, menos;

		mas = 0;
		menos = 0;

		float[] alt = new float[5];

		for (i=0; i < 5; i++){
			System.out.print("Introduce tu altura: ");
			alt[i] = teclado.nextFloat();
			sum += alt[i];
		}

		float media = sum/5;

		System.out.println("La media de las alturas introducidas es "+media);

		for (i=0; i< 5; i++){
			if (alt[i] > media){
				mas ++;
			}else{
				menos ++;
			}
		}
		
		teclado.close();
	}

}
