
import java.util.Scanner;

public class PruebaCIA {

    public static void main(String[] args) {
        CIA c = new CIA();
        Scanner x = new Scanner(System.in);
        System.out.println("Bienvenido al departamento de Seguridad Informatica de la C.I.A, ");
        System.out.println("Algunos comandos validos son los siguientes...");
        System.out.println("Opciones:" + "\n" + 1 + "=Encriptar" + "\n" + 2 + "=Desencriptar" + "\n" + 3 + "=Salir");
        System.out.println("Nota:Los numero ingresados deben ser numeros enteros y positivos");
        String p = x.nextLine();
       
        switch (p) {
            case "1":
                System.out.println("Dime el numero en decimal");
                String q = x.nextLine();
                int n = Integer.parseInt(q);

                System.out.println("El numero es " + c.encriptar(n));
                break;

            case "2":
                System.out.println("Dime el numero en binario");
                String r = x.nextLine();
                int m = Integer.parseInt(r);
                String m1 = c.desencriptar(r);
                System.out.println("El numero es " + c.desencriptar(r));
                break;

        }
        System.out.println("Bye");
    }

}
