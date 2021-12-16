  
// Importing Arrays class from java.util package
import java.util.Arrays;
import java.util.Scanner;
  
// Main class
public class Slip16b {
  
    // Main driver method
    public static void main(String[] args)
    {
        System.out.println("enter employees names");
        String arr[] = new String[5];
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.println("enter:");
            arr[i] = s1.nextLine();
        }
        s1.close();
        Arrays.sort(arr);
        System.out.println("order by name");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}