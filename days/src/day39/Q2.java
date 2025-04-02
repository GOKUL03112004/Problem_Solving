package day39;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,4,0,3,0,0,2};
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
