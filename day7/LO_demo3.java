import java.util.*;
class LO_demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int m=12;
        int c= n^m;
        System.out.println(" "+ ~c);
        System.out.println(" "+ ~(n & m));
        System.out.println(" "+ (n | m));
        System.out.println(" "+ c);
        System.out.println(" "+ (c<<2));
        System.out.println(" "+ (c>>2));
    }

}