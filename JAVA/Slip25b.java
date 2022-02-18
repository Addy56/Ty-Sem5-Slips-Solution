import Series.*;

public class Slip25b {
    public static void main(String[] args) {
        Series s = new Series(12);
        Cube c = new Cube(13);
        Square sq = new Square(14);
        System.out.println("Series of given number:"+s.getSeries());
        System.out.println("Cube of given number:"+c.getCube());
        System.out.println("Square of given number:"+sq.getSquare());
    }
}
