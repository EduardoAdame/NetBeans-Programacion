
public class Recursivo_Strings {

    public int cuenta(String x) {
        if (x.equals("")) {
            return 0;
        } else {
            return 1 + cuenta(x.substring(1));
        }
    }

    public String regreso(String x) {
        if (x.substring(0).equals("")) {
            return "";
        } else {
            return regreso(x.substring(1)) + x.substring(0, 1);
        }
    }

    public int a(String x) {
        if (x.isEmpty()) {
            return 0;
        } else {
            if (x.substring(0, 1).equals("a") ^ x.substring(0, 1).equals("A")) {
                return 1 + a(x.substring(1));
            }
        }
        return 0 + a(x.substring(1));
    }
}
