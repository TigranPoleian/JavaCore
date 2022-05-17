package homework.javabook.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x poqr e y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x havasar e y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x mec e y");
        }

    }
}
