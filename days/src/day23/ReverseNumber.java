package day23;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s2.reverse());
    }
}
