package homework.javabook.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Նախորդում է օպերատորին break. ");
                    if (t)break second;
                    System.out.println("Այս օպերատորը չի կարող իրականացվի ");
                }
                System.out.println("Այս օպերատորը չի կարող իրականացվի ");
            }
            System.out.println("Այս օպերատորը հեևում է բլոկին second. ");
        }
    }
}
