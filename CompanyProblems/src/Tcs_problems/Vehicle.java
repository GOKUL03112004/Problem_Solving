package Tcs_problems;

import java.util.Scanner;
/* e1=x+y=v;
e2=2x+47=w;
solve two equation get the y and x equation

 */
public class Vehicle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int w=s.nextInt();
        int fw=(w-2*v)/2;
        int tw=v-fw;
        if(fw<0|| tw<0){
            System.out.println("Invalid");
        }
        else{
            System.out.println("4 wheeler:"+fw);
            System.out.println("2 wheeler:"+tw);
        }
    }
}
