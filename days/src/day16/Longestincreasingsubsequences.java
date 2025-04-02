package day16;

import java.util.Scanner;

public class Longestincreasingsubsequences {
    static void longest(int[] a){
        int max=1;
        int ans=1;
            for(int j=0;j<a.length-1;j++){
                    if(a[j+1]>a[j]){
                        max+=1;
                    }
                    else {
                        ans=Math.max(max,ans);
                        max=1;
                    }
            }
            System.out.println("Longest Subsequence: "+Math.max(max,ans));
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        longest(a);
    }
}
