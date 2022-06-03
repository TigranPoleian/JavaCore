package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil1 myArrayUtil = new ArrayUtil1();
        int array[] = {44, 60, 86, 2,85,77, 7};
        myArrayUtil.printElements(array);
        myArrayUtil.printMax(array);
        myArrayUtil.printMin(array);
        myArrayUtil.printZuyger(array);
        myArrayUtil.printKenter(array);
        myArrayUtil.printZQ(array);
        myArrayUtil.printKQ(array);
        myArrayUtil.printMij(array);
        myArrayUtil.printGum(array);
    }

}