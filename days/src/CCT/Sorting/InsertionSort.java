package CCT.Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void insertion(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1])  {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        insertion(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}