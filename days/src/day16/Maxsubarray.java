package day16;

import java.util.Scanner;

public class Maxsubarray {
    static  int findMaxSubArray(int[] a){
        int max=a[0];
        int x=a[0];
        for(int i=1;i<a.length;i++){
            max=Math.max(a[i],max+a[i]);
            x=Math.max(max,x);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println(findMaxSubArray(a));
    }
}
