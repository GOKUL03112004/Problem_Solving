package day12;

public class Practice {
    void reverseNumber(int n){
        int ans=0;
        while(n!=0){
            int r=n%10;
            ans=ans*10+r;
            n=n/10;
        }
        System.out.println(ans);
    }
    void cubeTable(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Cube of "+i+" is "+i*i*i);
        }
    }
    void squareTable(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Square of "+i+" is "+i*i);
        }
    }
    void multiplySeries(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(i*n));
        }
    }
    void evenSeries(int n){
        int count=0;
        int i=1;
        while(count<n){
            if(i%2==0){
                System.out.print(" "+i);
                count++;
            }
            i++;
        }
        System.out.println();
    }
    void oddSeries(int n)
    {
        int count=0;
        int i=1;
        while(count<n){
            if(i%2!=0){
                System.out.print(" "+i);
                count++;
            }
            i++;
        }
        System.out.println();
    }
    int count(int n){
        int ans=0;
        while(n!=0)
        {
            int r=n%10;
            n=n/10;
            ans++;
        }
        return ans;
    }
    int add(int n){
        int ans=0;
        while(n!=0){
            int r=n%10;
            ans=ans+r;
            n=n/10;
        }
        return ans;
    }
    void sumUptoSingleDigit (int n) {
        int count =count(n);
        if(count==1){
            System.out.println(n);
        }
        else{
            while(count>1)
            {
                int add=add(n);
                if(count(add)==1){
                    System.out.println(add);
                }
                count=count(add);
                n=add;
            }
        }
    }
    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.oddSeries(6);
        obj.evenSeries(6);
        obj.multiplySeries(5);
        obj.squareTable(5);
        obj.cubeTable(5);
        obj.reverseNumber(54321);
        obj.sumUptoSingleDigit(9999 );
    }
}
