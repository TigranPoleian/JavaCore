package homework.javabook.Chapter7;

public class OverLoadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Ծավալը mybox1-ի հավասար է " + vol);
        vol = mybox2.volume();
        System.out.println("Ծավալը mybox2-ի հավասար է " + vol);
        vol = mycube.volume();
        System.out.println("Ծավալը mycube-ի հավասար է " + vol);
        vol = myclone.volume();
        System.out.println("Ծավալը myclone-ի հավասար է " + vol);
    }
}
