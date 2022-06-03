package homework.arrayutil;

public class PracticHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework myMinuts = new PracticeHomework();
        System.out.println(myMinuts.convert(10));
        System.out.println(myMinuts.calcAge(10));
        System.out.println(myMinuts.nextNumber(10));
        System.out.println(myMinuts.isSameNum(10,1));
        System.out.println(myMinuts.lessThanOrEqualToZero(-10));
        System.out.println(myMinuts.reverseBool(true));
        int []arr1 =new int[10];
        int[] arr2 =new int[5];
        int maxLenght = myMinuts.maxLength(arr1, arr2);
        System.out.println(maxLenght);
    }
}
