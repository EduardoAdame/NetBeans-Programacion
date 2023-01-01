
import java.io.*;

public class Test2 {

    public static void main(String[] args) {
        try {
            System.out.println("Hola ¿Qué deseas?");

            File archivo = new File("hola.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            int x = Integer.parseInt(linea);

            if (x == 1) {
                System.out.println("Elegiste Sopa");
                linea = br.readLine();

            } else if (x == 2) {
                System.out.println("Elegiste Arroz");

                linea = br.readLine();
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Elegiste Arroz");
            e.printStackTrace();
        }

    }

}
