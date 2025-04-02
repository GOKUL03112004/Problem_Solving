package day39;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] a={1,1,3,2,1,3,2,1};
        Arrays.sort(a);
        int[] count= new int[a.length];
        for(int i=0;i<a.length;i++){
            int c=0;
            if(i==0){
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        c+=1;
                    }
                }
                count[i]=c;
            }
            else if(a[i]!=a[i-1]) {
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        c+=1;
                    }
                }
                count[i]=c;
            }
        }
        for(int i=0;i<a.length;i++){
            if(count[i]>0){
                System.out.println(a[i]+" Occurs "+count[i]);
            }
        }
    }
}
