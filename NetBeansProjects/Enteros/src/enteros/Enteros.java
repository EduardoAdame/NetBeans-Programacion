
package enteros;
import java.util.Scanner;
public class Enteros {
    public static void main(String[] args) {
   int numero,anterior=0,siguiente=2;
   Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe tu numero");      
   numero= teclado.nextInt();
         
          System.out.println("Tu numero es..."+numero);
          
            while (numero>siguiente)
           
               anterior=numero-1;
                       System.out.println("Numero anterior..."+anterior);
      anterior--;
      numero= numero-1;
           
    }
    
}
