
public class PruebaRandom {

    int n;

    public int al(int min, int max) {

        int x = min / 2 + (int) (Math.random() * (Math.abs(max / 2 - min / 2) / 2)) * 2;
        System.out.println(x);
        return n;

    }

}
