package Series;

public class Cube {
    int no;
    public Cube(int no) {
        this.no = no;
    }
    public int getCube() {
        return (no*no*no);
    }

    public static void main(String[] args) {
        new Cube(12);
    }
}
