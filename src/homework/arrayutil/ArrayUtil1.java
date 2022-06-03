package homework.arrayutil;

public class ArrayUtil1 {
    void printElements(int[] array) {
        System.out.print("Բոլորը = ");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    int printMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.print("Մաքսը = " + max);
        System.out.println();
        return max;

    }


    int printMin(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Մինը = " + min);
        return min;
    }

    void printZuyger(int[] array) {
        System.out.print("Զույգեր = ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();
    }

    void printKenter(int[] array) {
        System.out.print("Կենտեր = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();
    }

    int printZQ(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.print("Զույգերի քանակը = " + even);
        System.out.println();
        return even;
    }
    int printKQ(int[] array){
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.print("Կենտերի քանակը = " + odd);
        System.out.println();
        return odd;
    }
    double printMij(int[]array){
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            x += array[i];
        }
        System.out.println("Թվաբանական միջինը = " + x/array.length);
        return x;
    }
    int printGum(int[]array){
        int gumar = 0;
        for (int i = 0; i < array.length; i++) {
            gumar += array[i];
        }
        System.out.println("Գումարը = " + gumar);
        return gumar;
    }
}
