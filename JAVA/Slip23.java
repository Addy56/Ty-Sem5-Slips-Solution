import java.io.File;

public class Slip23 {
    public static void main(String[] args) {
        try {
            File file = new File("demo1.txt");
            if (file.exists()) {
                if (file.isHidden()) {
                    System.out.println("This file is hidden");
                } else {
                    System.out.println("path of file is:" + file.getAbsolutePath());
                }
            } else {
                System.out.println("file don't exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}