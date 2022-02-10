import java.io.File;

//  Write a java program to accept list of file names through command line. Delete the 
// files having extension .txt. Display name, location and size of remaining files.

public class Slip5b {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int name = args[i].toString().indexOf(".class");
            File file = new File("JAVA/"+args[i]);
            if (name > 0) {
                if (file.exists()) {
                    file.delete();
                    System.out.println("file deleted:"+file);
                }else{
                    System.err.println("file doesnt exist:"+file);
                }
            } else {
                System.out.println("file name:"+file);
                System.out.println("Location of file:"+file.getAbsolutePath());
                System.out.println("size of file :"+file.length());
            }
        }
    }

}