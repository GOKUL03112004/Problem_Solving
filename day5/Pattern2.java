import java.util.*;
class Pattern2{
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=(n-2)+1;
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int y=1;y<n;y++)
                {
                    if(y==k)
                    {
                        System.out.print("*");
                        k--;
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
               
    }
}
