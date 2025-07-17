package CCT.Sorting;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr,int l,int r,int key){
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==key){
                return m;
            }
            else if(arr[m]>key){
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        System.out.println("in Index: "+binarySearch(arr,0,arr.length-1,key) );
    }

}
