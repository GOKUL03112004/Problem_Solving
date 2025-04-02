package Infosys_problems;

import java.util.Scanner;

public class Q2 {
    static boolean isFibo(int n){
        int a=5*n*n+4;
        int b=5*n*n-4;
        if(a==(int)Math.sqrt(a)*(int)Math.sqrt(a)){
            return true;
        } else if (b==(int)Math.sqrt(b)*(int)Math.sqrt(b)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        while(i<n){
            arr[i]=arr[i-1]+arr[i-2];
            i++;
        }
        if(isFibo(arr[n-1])){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
