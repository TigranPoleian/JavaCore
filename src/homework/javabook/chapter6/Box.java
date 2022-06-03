package homework.javabook.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println();
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;

    }

    void setDim(double w, double h, double d) {

    }
}

