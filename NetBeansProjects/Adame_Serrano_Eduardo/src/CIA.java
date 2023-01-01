
public class CIA {

    public String encriptar(int q) {
        String rest0 = "";
        while (q > 0) {
            if (q % 2 == 0) {
                rest0 = "0" + rest0;
            } else {
                rest0 = "1" + rest0;
            }
            q = q / 2;
        }
        return rest0;
    }

    public String desencriptar(String r) {
        int j = r.length();
        int d0 = 0;
        for (int i = 0; i < r.length(); i++) {
            String s = r.substring(i, i + 1);
            int s1 = Integer.parseInt(s);
            switch (s1) {
                case 1:
                    int e = j - 1 - i;
                    int s2 = (int) Math.pow(2, e);
                    d0 = d0 + s2;
                    break;
                case 0:
                    d0 = d0 + 0;
                    break;
            }
        }
        String r1 = "" + d0;
        return r1;
    }
}
