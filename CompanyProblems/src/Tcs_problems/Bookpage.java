package Tcs_problems;

import java.util.Scanner;

public class Bookpage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int pno=s.nextInt();
        int mid=p/2;
        if(mid>=pno){
            int ans=Math.round((float) (pno) /2);
            System.out.println(ans);
        }
        else {
            int ans1=Math.round((float) (p - pno)/2);
            if(ans1==0){
                System.out.println("1");
            }
            else {
                System.out.println(ans1);
            }
        }
    }
}
