package TYBBACA;

public class Student {
    int Rno;
    String Sname;
    int Per;

    public Student(int Rno, String Sname, int Per) {
        this.Rno = Rno;
        this.Sname = Sname;
        this.Per = Per;
    }
    public void disp() {
        System.out.println(Rno+" -> "+Sname+" ->  "+Per);
    }

    public static void main(String[] args) {

    }
}
