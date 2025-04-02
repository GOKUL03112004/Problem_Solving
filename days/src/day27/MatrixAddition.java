package day27;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr1 =new int[10][10];
        int[][] arr2 = new int[10][10];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        int[][] ans = new int[10][10];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+ans[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                for(int k=0;k<2;k++){
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.printf("%.2f ",(float)ans[i][j]);
            }
            System.out.println();
        }
    }
}
