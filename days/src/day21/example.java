package day21;

import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        String s="Indiaaaa2^3)*";
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        int counts=0;
        int counta=0;
        int countn=0;
        System.out.println("The no of characters:"+s.length());
        for(int i=0;i<s.length();i++){
            char t =s.charAt(i);
            int temp=(int)t;
            if(temp>=32 && temp<=47){
               counts++;
            }
            else if(temp>=48 && temp<=57){
                countn++;
            } else if (temp >= 65 && temp <= 90 || temp>= 97 && temp<=122) {
                counta++;
            }
            else {
                counts++;
            }
        }
        System.out.println("Count of numbers:"+countn);
        System.out.println("count of alpahabets:"+counta);
        System.out.println("count of characters:"+counts);
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='a' || t=='e' || t=='i' || t=='o'|| t=='u')
            {
                System.out.println(t);
            }
        }
    }
}
