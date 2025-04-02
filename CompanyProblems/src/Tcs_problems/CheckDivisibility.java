package Tcs_problems;

import java.awt.*;
import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        int count=0;
        while(n1>0){
            int t=n1%10;
            if(t==0 || n%1!=0){
                count++;
            }
            n1/=10;
        }
        if(count>0){
            System.out.println("False");
        }
        else{
            System.out.println("true");
        }
    }
}
