package homework.javabook.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b havasar e " + b);
        b = true;
        System.out.println("b havasa e " + b);
        if (b) System.out.println("Ays kod@ stacvel e");
        b = false;
        if (b) System.out.println("Ays kod@ chi stacvel");
        System.out.println("10 > 9 havasar e " + (10 > 9));
    }
}
