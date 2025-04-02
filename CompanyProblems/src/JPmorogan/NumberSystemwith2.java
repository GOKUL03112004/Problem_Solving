package JPmorogan;

import java.util.Scanner;

public class NumberSystemwith2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int ans=2;
        for(int i=1;i<n;i++){
            ans=ans+10;
        }
        System.out.println(ans);
    }
}
