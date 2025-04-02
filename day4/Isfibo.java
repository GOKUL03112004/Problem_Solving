import java.util.*;
class Isfibo{
    public static void main (String args[])
    {
        Scanner s = new  Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        int a=0;
        int b=1;
        while(a<=n)
        {
            int c=a+b;
            if(c==n)
        {
            System.out.println("It is fibo");
            count++;
        }
            a=b;
            b=c;
        }
        if(count==0)
        {
            System.out.println("Not fibo");
        }
    }
}