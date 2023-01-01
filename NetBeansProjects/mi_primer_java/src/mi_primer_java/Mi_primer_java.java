
package mi_primer_java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Reyniux
 */
public class Mi_primer_java {

   
    public static void main(String[] args) throws InterruptedException {
       
        System.out.println("Iniciando Programa....");
        
   /*     int contador_1=0;
        int contador_2=10;
        
        while(contador_1<=10)
            {
                System.out.println("Mi contador es = "+contador_1);
                contador_1++;                
            }
*/
        Scanner scan = new Scanner(System.in);
        String nombre="";
        int num_1=0;
       
        System.out.println("Ingresa tu nombre");
        nombre=scan.nextLine();
        System.out.println("Ingresa tu Edad");
        num_1=scan.nextInt();
       
        System.out.println("Procesando....");
       System.out.println("Nombre = "+nombre);
        if (num_1>=18)
          {
              System.out.println("Es mayor de edad");                   
            }
        else
              {
                 System.out.println("Es menor de edad");               
            }
        
    
      
        
        
        Thread.sleep(20000);
   
   
    }
    
}
