package homework.javabook.Chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a & b մինչև կանչը։" + a + " " + b);
        ob.metch(a, b);
        System.out.println("a & b կանչից հետո: " + a + " " + b);
    }
}
