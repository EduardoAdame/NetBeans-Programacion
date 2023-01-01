package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int factorial = 1;
        int numero = 0;
        System.out.println("Introduce un numero");
        numero = teclado.nextInt();
        for (int ind = 1; ind <= numero; ind++) {
            factorial*= ind;

        }
        System.out.println("El numero factorial es..." + factorial);

    }

}
//Iterativa//