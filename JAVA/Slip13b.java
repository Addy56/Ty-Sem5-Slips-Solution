import java.util.Scanner;

// Write a java program that asks the user name, and then greets the user by name. 
// Before outputting the user's name, convert it to upper case letters. For example, if 
// the user's name is Raj, then the program should respond "Hello, RAJ, nice to meet 
// you!".
public class Slip13b {
    public static void main(String[] args) {
        System.out.println("Enter you Name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello,"+name.toUpperCase()+", nice to meet you!");
        s.close();
    }
}
