//to print next 15 leap year from the given year
import java.util.*;
class Leaptest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m=1;
        while(m<=15)
        {
            for(int x=n;m<=n;x++)
            {
                if(x%4==0)
                {
                    if(x%100==0)
                    {
                        if(x%400==0)
                        {
                            System.out.println(x);
                        }
                    }
                }
            }
        }
    }
}