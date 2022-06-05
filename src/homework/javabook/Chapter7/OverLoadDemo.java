package homework.javabook.Chapter7;

public class OverLoadDemo {
    void test() {
        System.out.println("parametri otsutstvuyut");
    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a & b:" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }
}
class overload{
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        result = ob.test(123.2);
        System.out.println("rezultat vizova ob.test(123.25):"+result);
    }
}