package day11;

public class Factorial {
    long factorial(long n)
    {
        long ans=1;
        for(long i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        return  ans;
    }
    boolean isprime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count>0? false : true;
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(7));
        System.out.println(fact.factorial(25));
        System.out.println(fact.isprime(5));
    }

}
