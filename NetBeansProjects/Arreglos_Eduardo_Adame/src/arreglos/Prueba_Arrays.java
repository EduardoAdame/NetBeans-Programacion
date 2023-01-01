package arreglos;

public class Prueba_Arrays {

    public void pares(int n) {
        int[] cp = new int[n];
        for (int i = 0; i < n / 2; i++) {
            cp[i] = (i * 2);
            System.out.println(i * 2);
        }
    }
}
