package homework.javabook.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2(3, 6, 9);
        double vol;
        vol = mybox1.volume();
        System.out.println("Ծավալը հավասար է " + vol);
        vol = mybox2.volume();
        System.out.println("Ծավալը հավասար է " + vol);
    }
}
