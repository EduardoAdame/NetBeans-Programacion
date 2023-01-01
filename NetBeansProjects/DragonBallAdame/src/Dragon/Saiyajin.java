package Dragon;

public class Saiyajin extends DbPrueba {

    private String nombre;
    private String frase;
    private long Cvida;
    private long k;
    private long kdep;
    private long kdep1;
    private long kdep2;
    private boolean l = true;
    private boolean d = false;
    int al;

    public long golpeFuerte() {
        al = (int) Math.floor(Math.random() * 24);
        kdep = (k / 1000) * al;
        System.out.println(nombre + "realizó un golpe fuerte " + kdep);
        return (k / 1000) * al;
    }

    public long golpeMedio() {
        al = (int) Math.floor(Math.random() * 24);
        kdep1 = (k / 1000000) * al;
        System.out.println(nombre + " realizó un golpe medio " + kdep1);
        return (k / 1000000) * al;
    }

    public long golpeSuave() {
        al = (int) Math.floor(Math.random() * 24);
        kdep2 = (k / 1000000000) * al;
        System.out.println(nombre + " realizó un golpe suave " + kdep2);
        return (k / 1000000000) * al;

    }

    public void mofa() {
        System.out.println(nombre + frase);
    }

    public void recibeDaño(long n) {
        Cvida = Cvida - n;
        System.out.println(nombre + "Recibe daño de " + n);
    }

    public void nace(String nombre, String frase, long Cvida, long k) {
        this.nombre = nombre;
        this.frase = frase;
        this.Cvida = Cvida;
        this.k = k;
    }

    public boolean estáVivo() {
        if (Cvida > 0) {
            System.out.println("");
            return l;
        } else {
            System.out.println("Pero el rival  casi no..." + "\n" + "...Está a punto de morir... ");
            return d;
        }
    }

    public String ganador(String n) {
        if (Cvida < 0) {
            System.out.println("Ganador: " + n);
        }
        return nombre;
    }
}
