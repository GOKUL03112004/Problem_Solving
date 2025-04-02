import java.util.*;
class LO_demo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if( i%2==0 && i%5==0 && i%3==0 && i>=10000 && i<=99999)
            {
                System.out.println(i);
            }
        }
    }
}