import java.util.Scanner;
public class Fernando {
    public static void main(String[] args) {
        System.out.println("Hola extraño");
        System.out.println("Dime tu edad");
        Scanner loQueSea= new Scanner(System.in); 
        String edadDelTipo;
        edadDelTipo=loQueSea.nextLine();
        System.out.println("Edad del alienigena "+edadDelTipo);
        int kk;
        kk=Integer.parseInt(edadDelTipo);
        System.out.println("Edad del alienigena en años luz "+(kk+1));
    }   
}
