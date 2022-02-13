// 1B) Write a java program to copy only non-numeric data from one file to another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Slip1b {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name :");
        String sourcefile = sc.nextLine();
        System.out.print("Provide destination file name :");
        String destinationfile = sc.nextLine();

        try {
            FileReader fin = new FileReader(sourcefile);
            FileWriter fout = new FileWriter(destinationfile);
            // append boolean if true, then data will be written to
            // the end of the file rather than the beginning.

            int ch;
            while ((ch = fin.read()) != -1) {
                if (!Character.isDigit(ch))
                    fout.write(ch);
            }
            System.out.println("Finished Copying...");

            sc.close();
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            // e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
            // e.printStackTrace();
        }
    }
}