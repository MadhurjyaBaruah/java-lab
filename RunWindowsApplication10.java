import java.io.IOException;

public class RunWindowsApplication10 {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad");
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
