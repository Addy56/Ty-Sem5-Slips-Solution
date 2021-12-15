public class Slip5 {
    public static void main(String[] args) {
        int num=5;
        for (int i = 1; i<=5; i++) {
            for (int j=num;j<=5;j++) {
                System.out.print(j);
            }
            num=num-1;  
            System.out.println();
        }
    }
}
