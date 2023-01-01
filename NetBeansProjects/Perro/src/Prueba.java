public class Prueba {
    public static void main(String[] args) {
        /*Perro casa;
        casa=new Perro();
        casa.nombre="El cacas";
        String elNombre;
        elNombre= casa.nombre;
        System.out.println(elNombre);
        casa.raza="Callejero";
        String laRaza;
        laRaza= casa.raza;
        casa.edad= 4;
      int edadPerro;
        edadPerro= casa.edad;
        casa.color="Amarillo";
        String elColor;
        elColor= casa.color;
        System.out.println(casa.raza+"\n"+casa.edad+"\n"+casa.color);
      */
        
       Perro kk;
        kk=new Perro();
        kk.edad=33;
        Perro kk2;
        kk2= new Perro();
        kk2.edad= 88;
        System.out.println(kk.edad +"\n"+ kk2.edad);
       /* System.out.println(kk.edad+"perro1 "+kk2.edad+"perro2");*/
        kk.ladra();
        kk.maulla();
        kk.nombre="Pablito";
        kk.dimeTuNombre();
        kk.concatena3("hola ","amigo ","8");      
        String www;
        www=kk.concatena3("Hola","amigo","!");
        System.out.println(www);
    }
    
}

