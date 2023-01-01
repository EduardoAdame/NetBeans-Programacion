package manejador_de_archivos;
import java.io.File;


public class Manejador_de_archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File mi_directorio=new File("C:\\Users\\Reyniux\\Documents");
        
      String[] ficheros=mi_directorio.list();
      
      if (ficheros.length==0)
      {
          System.out.println("No existen archivos en el directorio"); 
      }
      else
      {
          for(int x=0;x<ficheros.length;x++)
          {
              //System.out.println("Archivo encontrado---> "+ficheros[x]+"  --Numero de archivo="+x); 
                if(ficheros[x].indexOf(".java")>0 || ficheros[x].indexOf(".xls")>0)
                {
                   // System.out.println("Word Encontrado____"+ficheros[x]+" -->la palabra .docx se encontro en la posicion -->"+ficheros[x].indexOf(".docx"));
                    System.out.println(ficheros[x]);
                }
              
          }
          
          
      }
      
        
    }
    
}
