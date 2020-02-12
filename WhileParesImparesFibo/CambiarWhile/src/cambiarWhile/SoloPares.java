package cambiarWhile;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese un numero");
		int numero = sc.nextInt();
		sc.close();

		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.printf("Iteración %d\n", i);
			}

			i += 1;
		} while (i < numero);
	}

}
