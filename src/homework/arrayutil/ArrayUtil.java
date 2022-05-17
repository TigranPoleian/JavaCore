package homework.arrayutil;

import java.util.ArrayList;

public class ArrayUtil {
    public static void main(String[] args) {
        int array[] = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

//      Տպեք մասիվի բոլոր էլեմենտները
        System.out.print("Bolor elementner = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");


        }
        System.out.println();

//        Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("max = " + max);


//        Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("min = " + min);

//    Տպեք մասիվի բոլոր զույգ էլեմենտները,
        System.out.print("zuyger = ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();

//        Տպեք մասիվի բոլոր կենտ էլեմենտները
        System.out.print("kenter = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();
//       Տպեք զույգերի քանակը
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.print("zuygeri qanak = " + even);
        System.out.println();

//     Տպեք կենտերի քանակը
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.print("kenteri qanak = " + odd);
        System.out.println();

//        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
//         (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            x += array[i];
        }
        System.out.println("mijin tvabanakan = " + x/array.length);

//        Տպեք մասիվի էլեմենտների գումարը
        int gumar = 0;
        for (int i = 0; i < array.length; i++) {
            gumar += array[i];
        }
        System.out.println("gumar = " + gumar);
    }
}