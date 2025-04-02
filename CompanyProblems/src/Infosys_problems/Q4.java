package Infosys_problems;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int j=a.length()-1;
        int i=0;
        boolean res=true;
        while(i!=j){
            if(a.charAt(i)!=a.charAt(j)){
                res=false;
            }
            i++;
            j--;
        }
        if(res){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
