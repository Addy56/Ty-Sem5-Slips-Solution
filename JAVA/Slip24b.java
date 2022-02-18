import java.util.Scanner;

import TYBBACA.Student;
import TYBBACA.Teacher;

// Create a package TYBBACA with two classes as class Student (Rno, SName, Per) 
// with a method disp() to display details of N Students and class Teacher (TID, TName, 
// Subject) with a method disp() to display the details of teacher who is teaching Java 
// subject. (Make use of finalize() method and array of Object)
public class Slip24b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of Student to enter");
        int sn = sc.nextInt();
        Student[] students = new Student[sn];
        try {
            for (int i = 0; i < sn; i++) {
                System.out.println("enter Roll no of student");
                int Rno = sc.nextInt();
                System.out.println("enter Name of Student");
                String Sname = sc.next();
                System.out.println("enter Percentage of student");
                int Per = sc.nextInt();
                students[i] = new Student(Rno, Sname, Per);
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        for (int i = 0; i < sn; i++) {
            students[i].disp();
        }

        System.out.println("enter number of Teachers to input");
        int tn = sc.nextInt();
        Teacher[] teachers = new Teacher[tn];
        try {
            for (int i = 0; i < tn; i++) {
                System.out.println("Enter Teacher Id");
                int Tid = sc.nextInt();
                System.out.println("Enter Name of Teacher");
                String tname = sc.next();
                System.out.println("Enter Subject of Teacher");
                String subj = sc.next();
                teachers[i] = new Teacher(Tid,tname,subj);
            }

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        for (int i = 0; i < tn; i++) {
            teachers[i].disp();
        }
        sc.close();
    }
}
