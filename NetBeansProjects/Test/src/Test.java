import java.io.*;
public class Test {
    public static void main(String[] args) {
        FileWriter fw= null;
        PrintWriter pw = null;
        try{
            fw = new FileWriter("hola.txt");
            pw = new PrintWriter(fw);
            pw.println("Yupi Yupi");
            pw.println("El perrito Snoopy");
            fw.close();    
        }
        catch(Exception e){
            System.out.println("Peleishon");
            e.printStackTrace();
        }
        
    }
    
}
