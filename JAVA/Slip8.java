
interface Shape {
    Double area(int r);
}

class Circle implements Shape {
    final double pi = 3.14;

    public Double area(int r) {
        return (2 * pi * r * r);
    }
}

class Sphere implements Shape {
    final double pi = 3.14;

    public Double area(int r) {
        return (4 * pi * r * r);
    }
}

public class Slip8 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Sphere s1 = new Sphere();
        c1.area(3);
        s1.area(2);
    }
}
