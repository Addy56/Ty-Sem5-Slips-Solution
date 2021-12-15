import java.util.Scanner;

public class Slip4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();
        for (int i = 0; i<name.length(); i=i+2) {
            System.out.println(name.charAt(i));
        }       
    }
}
