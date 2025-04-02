package day15;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {

    static int  binarySearch(int a[],int num){
        int l=0,r=a.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==num){
                return mid;
            }
            else if(a[mid]>num){
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }
    static int findSum(int n[]){
        int ans=0;
        int j=0;
        for(int i:n){
            ans=ans+n[j];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int[] a= new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println(findSum(a));
        System.out.println("It is in :"+binarySearch(a,6));
        for(int i:a){
            System.out.println(a[i-1]);
        }

    }
}
