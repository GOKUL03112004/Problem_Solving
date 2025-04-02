package day17;

import java.util.Scanner;
public class Exception1 {
    static void aioobe(Scanner s){
        try {
            int n = s.nextInt();
            int[] a = new int[n];
            System.out.println(a[a.length+1]);
        }catch (Exception e){
            System.out.println("Error occured");
        }
        finally {
            System.out.println("Finally is running");
        }
    }
    static void arithmeticException(Scanner s) {
        try{
            int j=5/1;
            int n = s.nextInt();
            int[] a = new int[n];
            System.out.println(a[a.length+1]);

        }catch (Exception e){
            System.out.println("No Divide by Zero");
        }catch (Error e){
            System.out.println("Error occured");
        }
    }
    static void npe() {
        try {
            String i = null;
            System.out.println(i.charAt(0));
        }catch (Exception e){
            System.out.println("String is null");
        }
    }
    static void overFlow() {
        // try catch wont work bcoz it is coming ub
        try {
            int[] n = new int[Integer.MAX_VALUE];
        }catch (Error e){
            System.out.println("Stack overflow4");
    }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        aioobe(s);
        arithmeticException(s);
        npe();
        overFlow();

        //to avoid exception use if else.
    }


}
