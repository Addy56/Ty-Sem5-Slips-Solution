// Write a java program to count the frequency of each character in a given string.

import java.util.Scanner;

public class Slip10
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int len = str.length();
        char seenArr[] = new char[len];
        int freqArr[] = new int[len];
        int idx = 0;
        in.close();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            
            if (Character.isWhitespace(ch)) {
                continue;
            }
            
            boolean seen = false;
            for (int j = 0; j < idx; j++) {
                if (ch == seenArr[j]) {
                    seen = true;
                    break;
                }
            }
            
            if (seen) {
                continue;
            }
            
            int f = 1;
            for (int k = i + 1; k < len; k++) {
                if (ch == str.charAt(k)) {
                    f++;
                }
            }
            
            seenArr[idx] = ch;
            freqArr[idx] = f;
            idx++;
        }
        
        for (int i = 0; i < idx; i++) {
            System.out.print(seenArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < idx; i++) {
            System.out.print(freqArr[i] + " ");
        }
    }
}