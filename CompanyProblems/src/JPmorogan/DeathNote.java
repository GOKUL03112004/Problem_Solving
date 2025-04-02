package JPmorogan;

import java.util.Scanner;

public class DeathNote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] a=Integer.toString(n).chars().map(Character ::getNumericValue).toArray();
        int count=1;
        for(int i=0;i<a.length-1;i++){
            String t=Integer.toString(a[i])+Integer.toString(a[i+1]);
             if(Integer.parseInt(t)<=26){
                 count++;
             }
        }
        System.out.println(count);
    }
}
