package JPmorogan;

import java.util.Scanner;
//base 20 formula=20^x*(value of alpha) + 20^x*(value of alpha)
public class NumberSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a =s.next();
        char[] b=a.toCharArray();
        String c="abcdefghijklmnopqrst";
        int n=a.length();
        int ans=0;
        int n1=n-1;
        for(int i=0;i<b.length;i++){
            ans+=(int)Math.pow(20,n1)*(c.indexOf(b[i])+1);
            n1--;
        }
        System.out.println(ans);
    }
}
