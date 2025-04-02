package day12;
import day11.Isfibo.*;

import  day11.*;

public class Isfiboformula {
    static boolean isFiboFormula(int n){
        int m1=(int)Math.sqrt(5*(n*n)+4);
        int m2=(int)Math.sqrt(5*(n*n)-4);
        if(m1*m1==n || m2*m2==n){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        //to use static method from
        System.out.println(Isfibo.isFibo(3));
        System.out.println(isFiboFormula(6));
    }

}
