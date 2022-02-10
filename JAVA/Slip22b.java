
// Write a java program for the following: [25 M]
// 1. To create a file.
// 2. To rename a file.
// 3. To delete a file.
//  4. To display path of a file
import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors

public class Slip22b {
    public static void main(String[] args) {
        try {
            File myObj = new File("somthing.txt");
            File rename = new  File("nothing.txt");
            // for creation of file
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            // for displaying path of file
            if (myObj.exists()) {
                System.out.println("Path of file is:"+myObj.getAbsolutePath());
            } else {
                System.out.println("error displaying file path cause file dont exist");                
            }
            // for renameing a file
            if (myObj.exists()) {
                myObj.renameTo(rename);
                System.out.println("done renaming file");
            } else {
                System.err.println("file doesnt exist");
            }
            // for deletion of file
            if (rename.delete()) {
                System.out.println("Deleted the file: " + rename.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
