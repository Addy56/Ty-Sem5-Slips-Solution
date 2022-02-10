import java.util.Scanner;
import java.io.*;

public class Slip21 {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("hello.txt");
        Scanner input = new Scanner(f);
        String result = "";
        while (input.hasNextLine()) {

            String fjala = input.nextLine();
            for (int i = fjala.length() - 1; i >= 0; i--) {
                result += fjala.charAt(i);
            }
            result +=" ";
        }
        input.close();
        System.out.print(result + " ");
    }
}