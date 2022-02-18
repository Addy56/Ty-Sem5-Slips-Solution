// Write a java program to copy the data from one file into another file, while copying 
// change the case of characters in target file and replaces all digits by ‘*’ symbol
// Java program to copy content from
// one file to another

import java.io.*;

public class Slip18b {

    public static void copyContent(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {

            int c;

            // read() function to read the
            // byte of data
            while (in.available() != 0) {
                c = in.read();
                // upper case converted to lower case
                if (Character.isUpperCase((char) c)) {
                    c = Character.toLowerCase((char) c);
                } else if (Character.isLowerCase((char) c)) {
                    c = Character.toUpperCase(c);
                }
                else if  (isInteger("" + (char) c)) {
                    c = '*';
                }
                out.write(c);
            }
        } finally {
            if (in != null) {

                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close
            // the stream
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {

        // source file
        File x = new File("JAVA/Hello.txt");
        // destination file
        File y = new File("JAVA/Hello1.txt");
        // method called to copy the contents from x to y
        copyContent(x, y);
    }
}
