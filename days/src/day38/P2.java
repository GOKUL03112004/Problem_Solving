package day38;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String actual="0123456789";
        String cipher="9876543210";
        int n=s.nextInt();
        if(n<=1000000){
            String ques=Integer.toString(n);
            StringBuilder ans= new StringBuilder();
            for(int i=0;i<ques.length();i++){
                char g=ques.charAt(i);
                int h=actual.indexOf(g);
                if(h>=0){
                    ans.append(cipher.charAt(h));
                }
            }
            System.out.println(ans);

        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
