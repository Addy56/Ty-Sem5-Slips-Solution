import java.util.Scanner;

class invaliddetails extends Exception {
}

class Slip9b {
    static int n;

    public static void main(String args[]) {
        Scanner dr = new Scanner(System.in);
        try {
            System.out.print(
                    "********* Do you Want to Validate ********* \n1. Mobile Number Press : 1 \n2. PAN Card Press : 2 \nEnter Number : ");
            // n = Integer.parseInt(dr.readLine());
            n = dr.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter Mobile Number : ");
                    // Long num = Long.parseLong(dr.readLine());
                    Long num = dr.nextLong();
                    dr.close();
                    if (num.toString().matches("(0/91)?[7-9][0-9]{9}")) {
                        System.out.print("Valid Mobile Number..!");
                    } else {
                        throw new invaliddetails();
                    }
                    break;
                case 2:
                    System.out.print("Enter PAN Number : ");
                    Scanner inp = new Scanner(System.in);
                    String str = inp.nextLine();
                    inp.close();
                    if (str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
                        System.out.print("Valid PAN CARD Number..!");
                    } else {
                        throw new invaliddetails();
                    }
                    break;
                default:
                    dr.close();
                    throw new invaliddetails();
            }
        } catch (invaliddetails nz) {
            System.out.println("You Enter Invalid Details...!");
        }
    }
}