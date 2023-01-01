
public class Prueba {

    public static void main(String[] args) {
        Droga x = new Droga("mejoralito", 6);
        Droga y = new Droga("mejoralito", 6);
        Droga z = new Droga("mejoralito", 6);
        Droga a = new Droga("mejoralito", 6);
        Droga b = new Droga("mejoralito", 6);
        Droga c = new Droga("mejoralito", 6);
        Droga d = new Droga("mejoralito", 6);

        DrugStore m = new DrugStore();

        m.y[0] = x;
        m.y[1] = y;
        m.y[2] = z;
        m.y[3] = a;
        m.y[4] = b;
        m.y[5] = c;
        m.y[6] = d;

        System.out.println(m.cuantosHay("mejoralito", 6, 0));
    }

}
