package cambiarWhile;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese numero para serie fibonacci");
		int n = sc.nextInt();
		int i= 1;
		int k= 1;
		
		sc.close();
		
       
        for (int a = 1; a <= n; ++a)
        {
            System.out.printf("%d \n",i);
            int suma = i + k;
            i = k;
            k = suma;

	}

}

}