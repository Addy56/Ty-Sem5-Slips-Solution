package Series;

public class Square {
    int no;
    public Square(int no) {
        this.no = no;
    }
    public int getSquare() {
        return (no*no);
    }
    public static void main(String[] args) {
        new Square(12);
    }   
}
