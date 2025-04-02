package day16;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyArray {
    static void frequencycount(int[] a){
        Arrays.sort(a);
       for(int i=0;i<a.length;i++){
           if(i==0 || a[i]!=a[i-1]){
               int count=0;
               for(int j=0;j<a.length;j++){
                   if(a[j]==a[i]){
                       count++;
                   }
               }
               System.out.println(a[i]+" Occurs"+count);
           }
       }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        frequencycount(a);
    }
}
