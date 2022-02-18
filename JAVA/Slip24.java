import java.io.*;
import java.util.*;

// Write a java program to count number of digits, spaces and characters from a file.
public class Slip24 {
    public static void main(String[] args) {
        try {
            File f = new File("demo1.txt");
            Scanner s = new Scanner(f);
            int digits = 0;
            int spaces = 0;
            int characters = 0;
            while (s.hasNext()) {
                char[] ch = s.next().toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (Character.isLetter(ch[i])) {
                        characters++;
                    }
                    if (Character.isDigit(ch[i])) {
                        digits++;
                    }
                }
                spaces++;
            }
            System.out.println("number of digits in file:" + digits);
            System.out.println("number of spaces in file:" + (spaces - 1));
            System.out.println("number of characters in file:" + characters);

            s.close();
        } catch (Exception e) {
        }
    }
}
