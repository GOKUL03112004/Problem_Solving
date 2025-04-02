package day34;

import javax.xml.transform.Source;

public class ParanthesisMatching {
    public static void main(String[] args) {
        String s="()()";
        int c1=0,c2=0,c3=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                c1++;
            }
            if(c==')'){
                c1--;
            }
        }
        if(c1==0){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
