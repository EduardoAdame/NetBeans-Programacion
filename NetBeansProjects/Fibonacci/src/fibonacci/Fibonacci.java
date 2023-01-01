
package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int numero, anterior=0,actual=1,fibo=0;
        System.out.println("Introduce el numero...");
    numero = teclado.nextInt();
        System.out.println("0, ");
        System.out.println("1, ");
    while(fibo<=numero)
    {
        fibo=(anterior+actual);
       anterior=(actual);
       actual=(fibo);
        System.out.println(fibo+", ");
        
                       }
        }
    
    
}
