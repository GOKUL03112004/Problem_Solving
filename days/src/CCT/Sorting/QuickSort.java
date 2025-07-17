package CCT.Sorting;

import java.util.Scanner;

public class QuickSort {
    static int partition(int[] arr,int l,int h){
        int pivot=h;
        int i=l-1;
        for(int j = l; h >= j; j++){
            if(arr[j]<arr[pivot]){
                i+=1;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,pivot);
        return i+1;
    }
    static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    static void quickSort(int[] arr,int l,int h){
        if(l<h){
            int partition1=partition(arr,l,h);
            quickSort(arr,l,partition1-1);
            quickSort(arr,partition1+1,h);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        quickSort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
