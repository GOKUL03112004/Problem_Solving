package day38;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] a ="abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] b ="kptvwxyzabcdefghijlmnoqrsu".toCharArray();
        char[] c=s.next().toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==c[i]){
                    System.out.print(b[j]);
                }
            }
        }
        String actual="abcdefghijklmnopqrstuvwxyz";
        String cipher="kptvwxyzabcdefghijlmnoqrsu";
        String ques = s.next();
        for(int i=0;i<ques.length();i++){
            char g=ques.charAt(i);
            int h=actual.indexOf(g);
            if(h>=0){
                System.out.print(cipher.charAt(h));
            }
        }
    }
}
