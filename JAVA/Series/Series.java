// Create a package named Series having three different classes to print series:
// i. Fibonacci series
// ii. Cube of numbers
// iii. Square of numbers
// Write a java program to generate ‘n’ terms of the above series.
package Series;

public class Series {
    int no;

    public Series(int no) {
        this.no = no;

    }

    public int getSeries() {
        int first = 0;
        int last = 1;
        int sum = 0;
        for (int i = 1; i < no; i++) {
            sum = first + last;
            first = last;
            last = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        new Series(12);
    }

}
