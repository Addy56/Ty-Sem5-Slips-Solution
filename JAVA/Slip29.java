// Write a java program to check whether given candidate is eligible for voting or not. 
// Handle user defined as well as system defined Exception.

import java.util.Scanner;

public class Slip29 {
    public static void main(String[] args) {
        try {
            System.out.println("enter you age:");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            scanner.close();
            if (age <= 0) {
                System.out.println("enter valid age of user");
            } else if (age >= 18) {
                System.out.println("Given candidate is eligible for voting");
            } else {
                System.out.println("Given candidate is not eligible for voting right now");
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
