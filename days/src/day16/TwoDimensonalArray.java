package day16;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TwoDimensonalArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b= new int[3][3];
        int[][] c=new int[3][3];
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}
