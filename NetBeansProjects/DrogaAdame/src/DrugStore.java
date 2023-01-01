
public class DrugStore {

    public Droga[] almacen;

    public void drugStore(Droga x) {
        almacen = new Droga[1];
        almacen[0] = x;
    }

    public void guardaDroga(Droga x) {
        Droga[] almacen2 = new Droga[almacen.length + 1];
        for (int i = 0; i < almacen.length; i++) {
            almacen2[i] = almacen[i];
            almacen2[almacen.length] = x;
            almacen = almacen2;
        }
    }
    public Droga[] y = new Droga[7];

    public int cuantosHay(String n, int c, int l) {
        if (l == this.y.length) {
            return 0;
        } else if (this.y[l].nombre.equals(n) && this.y[l].calidad == c) {
            return 1 + cuantosHay(n, c, l + 1);
        } else {
            return 0 + cuantosHay(n, c, l + 1);
        }

    }
}
