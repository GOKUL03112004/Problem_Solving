package day27;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr1 =new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                System.out.print(arr1[j][i]);
            }
            System.out.println();
        }
        //upper triangle
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        //lower triangle
        for(int i=0;i<arr1.length;i++){
            for(int j=i;j< arr1.length;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
