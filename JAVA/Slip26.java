import java.io.FileInputStream;

public class Slip26 {
   public static void main(String[] args) {
      try {
         FileInputStream fin = new FileInputStream("JAVA/Hello.txt");
         while (fin.available() != 0) {
            int ASCII = fin.read(); 
            System.out.println("The ASCII value of " + (char)ASCII + " is: " + ASCII);
         }
         fin.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}