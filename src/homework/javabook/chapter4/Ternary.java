package homework.javabook.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // poluchit obsolyutnoe
        // znachenie peremennoy i
        System.out.print("Absolyutnoe znachenie ");
        System.out.println(i + " ravno " + k);
        i = -10;
        k = i < 0 ? -i : i; //poluchit absolyutnoe
        //znachenie peremenoy i

        System.out.print("Absolyutnoe znachenie ");
        System.out.println(i + " ravno " + k);
    }
}
