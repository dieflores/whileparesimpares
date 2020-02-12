package cambiarWhile;

import java.util.Scanner;

public class SumaImparLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt(); // minimo que ingresa el usuario
		int max = sc.nextInt(); // maximo que ingresa el usuario
		sc.close();  // cierre
		
		int suma = 0;

		for (int i = min; i < max; i++) {
			if (i % 2 != 0) {
				suma = suma + i;
			}
		}
		System.out.println(suma); 

	}

}
