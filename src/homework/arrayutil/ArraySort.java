package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        // Պետք է գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
        System.out.println("Փոքրից մեծ-> ");
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) { //էս տողի վրա փոքրի նշանը փոխում ենք մեծի, հակառակնե տպում։
                    int b = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = b;
                }
            }
        }
        for (int c : numbers)
            System.out.print(" " + c);
    }
}






