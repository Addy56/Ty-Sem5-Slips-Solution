package TYBBACA;

public class Teacher {
    int TId;
    String TName;
    String Subject;

    public Teacher (int TId,String TName,String Subject) {
        this.TId = TId;
        this.TName = TName;
        this.Subject = Subject;
    }
    public void disp() {
        if(Subject.equals("java")||Subject.equals("JAVA")){
            System.out.println(TId+" -> "+TName+" -> "+Subject);
        }
    }
    public static void main(String[] args) {

    }    
}