package CCT.Sorting;

import java.util.Scanner;

public class SelectionSort {
    static void sort1(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int in=i;
            for(int j=i+1;j<n;j++){
                if(min>arr[j]){
                    min=arr[j];
                    in=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[in];
            arr[in]=t;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        sort1(arr);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
