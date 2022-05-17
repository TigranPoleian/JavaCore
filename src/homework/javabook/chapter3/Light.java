package homework.javabook.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;
        System.out.print("orinak " + days);
        System.out.print(" orva luys@ kancni ");
        System.out.println(distance + " mil");

    }
}