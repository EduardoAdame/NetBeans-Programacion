
import java.util.Scanner;

public class EnteroGrande {

    private String numero;
    private boolean signo;

    public void convierteteACero() {
        numero = "0";
    }

    public void convierteteAOcho() {
        numero = "8";
    }

    public void convierteteAMenos4() {
        numero = "4";
        signo = false;
    }

    public void cambioDeSigno() {
        if (signo == true) {
            signo = false;
        } else {
            signo = true;
        }
    }

    public EnteroGrande() {
        numero = "333";
    }

    public String dimeTuNumero() {
        return numero;
    }

    /*public EnteroGrande(int kk){
if(kk>0){
    signo=true;
}else{
    kk=kk*(-1);
    signo=false;
}
numero=kk +"";
}
     */
    public EnteroGrande(double kk) {
        if (kk > 0) {
            signo = true;
        } else {
            kk = kk * (-1);
            signo = false;
        }
        String y = kk + "";
        String kk2 = "";
        String k = kk + "";
        for (int i = 0; i < y.length(); i = i + 1) {
            if (y.substring(i, i + 1).equals(".")) {
                break;
            } else {
                kk2 = kk2 + y.substring(i, i + 1);
            }

        }
    }

    public EnteroGrande(int kk) {
        if (kk > 0) {
            signo = true;
        } else {
            signo = false;
            kk = kk * -1;

        }
        numero = kk + "";
    }

    public String QuienEres() {
        if (signo == false) {
            return "-" + numero;
        } else {
            return numero;
        }
    }

    public boolean eresPositivo() {
        if (numero.equals("0")) {
            return false;

        }
        if (signo == true) {
            return true;
        }
        if (signo == false);
        return false;
    }

    public boolean eresNegativo() {
        if (numero.equals("0")) {
            return true;
        }
        if (signo == false) {
            return true;
        }
        if (signo == true);
        return false;
    }

    public int comparate(EnteroGrande x) {
        if (signo == true && x.signo == false) {
            return 1111;

        }
        if (signo == false && x.signo == true) {
            return -666;
        }
        if (signo = true && x.signo == true) {
            int lOtro = x.numero.length();
            int lYo = this.numero.length();
            if (lOtro > lYo) {
                return -777;
            }
            if (lYo > lOtro) {
                return 2212;
            }
            for (int i = 0; i < lOtro; i++) {
                if (Integer.parseInt(this.numero.substring(i, i + 1)) < Integer.parseInt(x.numero.substring(i, i + 1))) {

                }
            }
        }
        return 0;
    }

    public EnteroGrande(String numero, boolean signo) {
        this.numero = numero;
        this.signo = signo;
    }

    public void SumaUno() {
        int e = this.numero.length();
        int suma;
        int resta;
        String r = "";
        String nov = "";
        if (this.signo == true) {
            for (int i = e; i > 0; i--) {
                String n = this.numero.substring(i - 1, i);
                int d = Integer.parseInt(n);
                if (d != 9) {
                    suma = d + 1;
                    this.numero = this.numero.substring(0, i - 1) + suma + r;
                    break;
                } else {
                    r = r + "0";
                    nov = nov + "9";
                    if (e == nov.length()) {
                        this.numero = "1" + r;

                    }

                }
            }
        }
        if (signo == false) {
            for (int i = e; i > 0; i--) {
                String n = this.numero.substring(i - 1, i);
                int d = Integer.parseInt(n);
                if (d != 0) {
                    resta = d - 1;
                    this.numero = this.numero.substring(0, i - 1) + resta + r;
                    break;

                } else {
                    r = r + "9";
                }

            }

            if (this.numero.equalsIgnoreCase("0" + r)) {
                this.numero = r;
            }
            if (this.numero.equalsIgnoreCase("0") && this.signo == false) {
                this.numero = "1";
            }
            if (this.numero.equalsIgnoreCase("") && this.signo == false) {
                this.numero = "9";
            }
            if (this.numero.equalsIgnoreCase("9" + r) && this.signo == false) {
                this.numero = "0";

            }

        }

    }

}

/*
para tipos primitivos se incian en minuscula
si sumamos string + int = string
28/03/19 this.signo o cualquier otra cosas estas agarrando tu signo y asi con cualquier otro metodo
Hacer un metodo a entero grande que incremente a uno el valor
hacer un metodo de suma uno y acabar el de comparate

 */
