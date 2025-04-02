package day13;

import java.util.Scanner;

public class Ncr {
    static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    static int ncr(int n,int cr){
        //nCr (n, r) = n! / ((n-r)! *r!)
        int ans=fact(n)/((fact(n-cr))*fact(cr));
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n and r value:");
        int n=s.nextInt();
        int r=s.nextInt();
        System.out.println(ncr(n,r));

    }
}
