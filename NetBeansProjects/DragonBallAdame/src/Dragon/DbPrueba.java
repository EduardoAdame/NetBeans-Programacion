package Dragon;

public class DbPrueba {

    public static void main(String[] args) {
        Saiyajin g = new Saiyajin();
        Saiyajin pv = new Saiyajin();
        Saiyajin t = new Saiyajin();
        Saiyajin gt = new Saiyajin();
        int al;

        g.nace("Gokú: ", "Soy el Saiyajin que vino desde la tierra con el propósito de vencerte. Soy el guerrero del que has oido en las leyendas, de corazon puro y que despertó por la furia. ¡Yo soy el super Saiyajin,Goku!", 25000000000l, 100000000000l);
        pv.nace("Príncipe Vegita: ", "No eres nadie, solo un mago ¡Yo soy un guerrero! ¡El principe de los Saiyajin! ¡¡Vegeta!!", 25000000000l, 100000000000l);

        System.out.println("Inicio de la  pelea del siglo ");
        while (g.estáVivo() || pv.estáVivo()) {
            al = (int) Math.floor(Math.random() * 25);

            if (0 <= al && al < 5) {
                g.mofa();
                pv.recibeDaño(g.golpeFuerte());
                pv.mofa();
                g.recibeDaño(g.golpeSuave());
            }
            if (5 <= al && al < 10) {
                pv.mofa();
                g.recibeDaño(pv.golpeMedio());

            }
            if (10 <= al && al < 15) {
                g.mofa();
                pv.recibeDaño(g.golpeMedio());
                pv.mofa();
                g.recibeDaño(pv.golpeMedio());
            }
            if (15 <= al && al < 20) {
                pv.mofa();
                g.recibeDaño(pv.golpeSuave());
                g.mofa();
                pv.recibeDaño(g.golpeMedio());
            }
            if (20 <= al && al <= 25) {
                g.mofa();
                pv.recibeDaño(g.golpeSuave());
                pv.mofa();
                g.recibeDaño(pv.golpeSuave());
            }
            if (g.estáVivo() == false) {
                System.out.println("Vegita: Al menos trata de morir con honor y ni sueñes en revivir... ");
                System.out.println("...Muere Gokú.");
                g.ganador("Vegita");
                break;
            } else {
                System.out.println("Gokú aun sigue con vida...");
            }
            if (pv.estáVivo() == false) {
                System.out.println("Gokú: Tus niveles de energía disminuyen con cada golpe, de hecho, ya no eres un reto para mí. No sería justo seguir peleando contigo.");
                System.out.println("Gokú:Ya estoy satisfecho. Tu orgullo está hecho pedazos, retaste y perdiste contra un peleador superior a ti y lo peor de todo es que solo soy un mono.");
                System.out.println("...Muere principe Vegita.");
                pv.ganador("Gokú");
                break;
            } else {
                System.out.println("Vegita aun sigue con vida...");
            }
        }
        t.nace("Trunks: ", "Intenté advertirte pero aqui estás. Creo que siempre serás un idiota ingenuo.", 25000000000l, 100000000000l);
        gt.nace("Goten: ", "¿Estás listo para ser testigo de un poder que no ha sido visto en miles de años?", 25000000000l, 100000000000l);
        System.out.println("");
        System.out.println("Inicio de la  pelea del siglo ");
        while (t.estáVivo() && gt.estáVivo()) {
            al = (int) Math.floor(Math.random() * 25);

            if (0 <= al && al < 5) {
                t.mofa();
                gt.recibeDaño(t.golpeFuerte());
                gt.mofa();
                t.recibeDaño(gt.golpeSuave());

            }
            if (5 <= al && al < 10) {
                gt.mofa();
                t.recibeDaño(gt.golpeMedio());

            }
            if (10 <= al && al < 15) {
                t.mofa();
                gt.recibeDaño(t.golpeMedio());
                gt.mofa();
                t.recibeDaño(gt.golpeMedio());
            }
            if (15 <= al && al < 20) {
                gt.mofa();
                t.recibeDaño(gt.golpeSuave());
                t.mofa();
                gt.recibeDaño(t.golpeMedio());
            }
            if (20 <= al && al <= 25) {
                t.mofa();
                gt.recibeDaño(t.golpeSuave());
                gt.mofa();
                t.recibeDaño(gt.golpeSuave());
            }
            if (t.estáVivo() == false) {
                System.out.println("Goten: Al menos trata de morir con honor y ni sueñes en revivir... ");
                System.out.println("...Muere Trunks.");
                t.ganador("Goten");
                break;
            } else {
                System.out.println("Trunks aun sigue con vida...");
            }
            if (gt.estáVivo() == false) {
                System.out.println("Trunks: Tus niveles de energía disminuyen con cada golpe, de hecho, ya no eres un reto para mí. No sería justo seguir peleando contigo.");
                System.out.println("Trunks:Ya estoy satisfecho. Tu orgullo está hecho pedazos, retaste y perdiste contra un peleador superior a ti.");
                System.out.println("...Muere Goten.");
                gt.ganador("Trunks");
                break;
            } else {
                System.out.println("Goten aun sigue con vida...");
            }
        }
    }
}
