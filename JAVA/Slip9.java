public class Slip9 {
    public static void main(String[] args) {
        int cols = 1;
        boolean val = true;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < cols; j++) {
                if (val == true)
                    System.out.print(1);
                else
                    System.out.print(0);
                val = !val;
            }
            cols += 1;
            System.out.println();
        }
    }
}
