package Infosys_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int e=s.nextInt();
        int te=s.nextInt();
        int ans=0,ans2=0;
        int e2=e;
        int[] arr = new int[te];
        int[] arr2=new int[te];
        for(int i=0;i<te;i++){
            arr[i]=s.nextInt();
        }
        arr2=arr.clone();
        int[] arr3 = new int[te*2];
        System.arraycopy(arr,0,arr3,0,te);
        System.arraycopy(arr2,0,arr3,arr.length,arr2.length);
        Arrays.sort(arr3);
        int count=Integer.MAX_VALUE;
        for(int i=0;i<arr3.length;i++){
            int e1=e;
            int count1=0;
            for(int j=i;j<arr3.length;j++){
                if(arr3[j]<=e1){
                    count1++;
                    e1-=arr3[j];
                }
                else {
                    break;
                }
            }
            if(e1==0){
                count=Math.min(count,count1);
            }
        }
        if(count>te*2){
            System.out.println("-1");
        }
        else {
            System.out.println(count);
        }
    }
}