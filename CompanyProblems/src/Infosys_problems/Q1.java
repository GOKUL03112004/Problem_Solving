package Infosys_problems;

import java.util.Scanner;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String a= s.next();
        Stack<Character> b= new Stack<>();
        char[] arr=a.toCharArray();
        for(char i:arr){
            b.push(i);
        }
        for(int i=0;i<=b.size();i++){
            System.out.println(b.pop());
            i=0;
        }
    }
}
