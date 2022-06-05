package homework.javabook.Chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a & ob.b Կանչից առաջ։ " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a & ob.b Կանչից հետո։" + ob.a + " " + ob.b);
    }
}
