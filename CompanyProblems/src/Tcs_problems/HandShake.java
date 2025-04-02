package Tcs_problems;/*package Tcs_problems;

import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n*(n-1)/2);
    }
}*/
import java.io.*;
import java.util.*;

public class HandShake {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextLine();
        }
        for(int i=0;i<n;i++){
            String[] ans=a[i].split(" ");
            for(int j=0;j<ans.length;j++){
                if(j==ans.length-1){
                    System.out.println(ans[j]);
                }
                else{
                    if(ans[j].equalsIgnoreCase(ans[j+1])){
                        continue;
                    }
                    else{
                        System.out.print(ans[j]+" ");
                    }
                }
            }
        }
    }
}
