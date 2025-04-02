package JPmorogan;

import java.util.Arrays;
import java.util.Scanner;

public class GoodPrime {

    static int num(int n){
        int sum=0;
        while(n>0){
            int t=n%10;
            sum+=t;
            n=n/10;
        }
        return sum;
    }
    static  boolean isprime(int n){
        if(n<=1){
            return false;
        } else if (n==2) {
            return true;
        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=b;
        int[] arr = new int[b];
        int i=0;
        while(b>0){
            int num1=num(a);
            if(isprime(num1)){
                arr[i]=a;
                i++;
                b--;
            }
            a++;
        }
        System.out.println(arr[c-1]);

    }
}
