
import java.util.Scanner;

public class PruebaMuppet {

    public static void main(String[] args) {
        Muppet street;
        street = new Muppet();
        street.nombre = "countVonCount";
        Scanner x = new Scanner(System.in);
        String caja;
        System.out.println("Bienvenido a Sesame Street, Conde Draco fue de viaje, pero yo puedo ayudarte...");
        System.out.println("Algunos comandos validos son los siguientes...");
        System.out.println("Operaciones:" + "\n" + "Suma" + "\n" + "Resta" + "\n" + "Multiplicacion" + "\n" + "Division" + "\n" + "Elevar");
        System.out.println("Decisiones:" + "\n" + "Si" + "\n" + "No");
        System.out.println("Nota:Los numero ingresados pueden ser numeros decimales");
        System.out.println("¿Que operacion quieres realizar?");
        caja = x.nextLine();
        String caja1;
        caja1 = ("Suma");
        String caja2;
        caja2 = ("Resta");
        String caja3;
        caja3 = ("Multiplicacion");
        String caja4;
        caja4 = ("Division");
        String caja5;
        caja5 = ("Elevar");
        String opcion1;
        opcion1 = ("Si");
        String opcion2;
        opcion2 = ("No");
        String suma1;
        suma1 = ("Suma");
        String resta1;
        resta1 = ("Resta");
        String producto1;
        producto1 = ("Multiplicacion");
        String cociente1;
        cociente1 = ("Division");
        String elevar1;
        elevar1 = ("Elevar");

        int comparacion;
        comparacion = caja.compareTo(caja1);
        int comparaciona;
        comparaciona = caja.compareTo(caja2);
        int comparacionb;
        comparacionb = caja.compareTo(caja3);
        int comparacionc;
        comparacionc = caja.compareTo(caja4);
        int comparaciond;
        comparaciond = caja.compareTo(caja5);

        if (comparacion == 0) {
            System.out.println("Dame tu primer sumando");
            Scanner a = new Scanner(System.in);
            street.numero1 = a.nextDouble();
            System.out.println("Dame tu segundo sumando");
            street.numero2 = a.nextDouble();
            double resultadosuma = street.Suma();
            System.out.println("El resultado es... " + resultadosuma);
        } else if (comparaciona == 0) {
            System.out.println("Introduce el primer número");
            Scanner a = new Scanner(System.in);
            street.numero1 = a.nextDouble();
            System.out.println("Introduce el número que se restará");
            street.numero2 = a.nextDouble();
            double resultadoresta = street.Resta();
            System.out.println("La resta de esos numeros es ..." + resultadoresta);
        } else if (comparacionb == 0) {
            System.out.println("Introduce el primer número");
            Scanner a = new Scanner(System.in);
            street.numero1 = a.nextDouble();
            System.out.println("Introduce el segundo número");
            street.numero2 = a.nextDouble();
            double resultadoproducto = street.Producto();
            System.out.println("El producto de esos numeros es..." + resultadoproducto);
        } else if (comparacionc == 0) {
            System.out.println("Introduce el primer número");
            Scanner a = new Scanner(System.in);
            street.c = a.nextFloat();
            System.out.println("Introduce el segundo número");
            street.d = a.nextFloat();
            float resultadocociente = street.Cociente();
            System.out.println("El cociente de esos numeros es..." + resultadocociente);
        } else if (comparaciond == 0) {
            System.out.println("Introduce el número a elevar");
            Scanner a = new Scanner(System.in);
            street.numero1 = a.nextDouble();
            System.out.println("Introduce la potencia a la cual elevar el número");
            street.numero2 = a.nextDouble();
            double resultadopotencia = street.Potencia();
            System.out.println("El número elevado a esa potencia es..." + resultadopotencia);
        }

        System.out.println("¿Deseas realizar otra operación?");
        caja = x.nextLine();
        int comparacion1;
        int comparacion2;
        comparacion1 = caja.compareTo(opcion1);
        comparacion2 = caja.compareTo(opcion2);
        if (comparacion1 == 0) {
            System.out.println("¿Que otra operación quieres realizar?");
            {
                caja = x.nextLine();
                int s1;
                int r1;
                int p1;
                int c1;
                int e1;
                s1 = caja.compareTo(suma1);
                r1 = caja.compareTo(resta1);
                p1 = caja.compareTo(producto1);
                c1 = caja.compareTo(cociente1);
                e1 = caja.compareTo(elevar1);

                if (s1 == 0) {
                    System.out.println("Dame tu primer sumando");
                    Scanner a = new Scanner(System.in);
                    street.numero1 = a.nextDouble();
                    System.out.println("Dame tu segundo sumando");
                    street.numero2 = a.nextDouble();
                    double resultadosuma = street.Suma();
                    System.out.println("El resultado es... " + resultadosuma);
                } else if (r1 == 0) {
                    System.out.println("Introduce el primer numero");
                    Scanner a = new Scanner(System.in);
                    street.numero1 = a.nextDouble();
                    System.out.println("Introduce el numero que se restará");
                    street.numero2 = a.nextDouble();
                    double resultadoresta = street.Resta();
                    System.out.println("La resta de esos numeros es ..." + resultadoresta);
                } else if (p1 == 0) {
                    System.out.println("Introduce el primer numero");
                    Scanner a = new Scanner(System.in);
                    street.numero1 = a.nextDouble();
                    System.out.println("Introduce el segundo numero");
                    street.numero2 = a.nextDouble();
                    double resultadoproducto = street.Producto();
                    System.out.println("El producto de esos numeros es..." + resultadoproducto);
                } else if (c1 == 0) {
                    System.out.println("Introduce el primer numero");
                    Scanner a = new Scanner(System.in);
                    street.c = a.nextFloat();
                    System.out.println("Introduce el segundo numero");
                    street.d = a.nextFloat();
                    float resultadocociente = street.Cociente();
                    System.out.println("El cociente de esos numeros es..." + resultadocociente);
                } else if (e1 == 0) {
                    System.out.println("Introduce el numero a elevar");
                    Scanner a = new Scanner(System.in);
                    street.numero1 = a.nextDouble();
                    System.out.println("Introduce la potencia a la cual elevar el numero");
                    street.numero2 = a.nextDouble();
                    double resultadopotencia = street.Potencia();
                    System.out.println("El numero elevado a esa potencia es..." + resultadopotencia);
                }
            }
        } else if (comparacion2 == 0) {
            System.out.println("vuelve pronto...");
        }
        System.out.println("Esperamos tu visita, Conde Draco volverá pronto...");
    }
}
