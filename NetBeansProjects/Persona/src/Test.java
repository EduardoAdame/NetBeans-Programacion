
public class Test {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.grita();
        Cantante c = new Cantante();
        c.grita();
        System.out.println(c.getCantPies());
        c.grita("Eooo");
    }
}
