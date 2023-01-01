
public class Switch_Strings {

    public static void main(String[] args) {
        String y = "que me ves";
        switch (y) {
            case "hola":
                System.out.println("me dijo hola");
                break;
            case "que me ves":
                System.out.println("me dijo Que me ves?");
                break;
            default:
                System.out.println("Me dijo otra cosa");
        }
    }

}
