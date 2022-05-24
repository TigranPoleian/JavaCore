package homework.arrayutil;

import javax.swing.*;

public class CharArrayExample {
    public static void main(String[] args) {
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ,
        // ու տպել այդ քանակը։
        char c = 'o';
        int num = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                num++;
            }
        }
        System.out.println("Փոփոխականի քանակը--> " + num);

//    պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
        System.out.print("Մեջտեղի 2 սիմվոլնեռը--> ");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars2.length; i++) ;
        int count = chars2.length / 2;
        System.out.print(chars2[count] + "," + chars2[count - 1]);


        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = false;
            if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
                b = true;
            } else
             b = false;

      System.out.print("Ճիշտ պատասխանն է--> " + b);

        //Տպում ենք true եթե տեքստը պարունակում է bob բառը,
        // բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
        System.out.println();
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char f = 'b';
        boolean d = false;
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == f && bobArray[i + 2] == f) {
                d = true;
                break;
            }
        }
        System.out.print("Ճիշտ պատասխանն է--> " + d);
        System.out.println();


        //պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        System.out.print("Ճիշտ պատասխան--> ");
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i]);
        }


    }

}





