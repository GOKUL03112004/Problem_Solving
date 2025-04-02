package day11;

public class Isfibo {
    static public boolean isFibo(long n) {
        long a = 1;
        long b = 1;
        long c;
        int count = 0;
        while (a <= n) {
            if (a == n) {
                count++;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return count > 0 ? true : false;
    }

    public static void main(String[] args) {
        // there is another method to solve fibo number using math formula
        System.out.println(isFibo(12));
        System.out.println(isFibo(701408733));
    }
}
