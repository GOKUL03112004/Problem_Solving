package day39;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digits = (int) (Math.log10(n) + 1);
        System.out.println("Number of digits: " + digits);
    }
}
