package homework.javabook.chapter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Անցնել " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("Այս գիծը չի տողարկվի");
        }
        System.out.println("Ցիկլի ավարտ․");
    }
}
