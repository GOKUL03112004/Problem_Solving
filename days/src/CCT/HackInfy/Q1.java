package CCT.HackInfy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        List<Integer> arr=new ArrayList<>();
        int count=0;
        int count1=n-1;
        for(int i=0;i<n;i++){
            arr.add(s.nextInt());
        }
        int i=0;
        while(i<n-1){
            boolean same=false;
            for(int j=n-1;j>i;j--){
                if(arr.get(j)%arr.get(i)==0 && !Objects.equals(arr.get(i), arr.get(j))){
                    count=count+arr.get(i);
                    int u=arr.get(j)+1;
                    arr.set(j,u);
                    same=true;
                    i=j;
                }
            }
            if(!same){
                count++;
                i++;
            }
        }
        System.out.println(Math.min(count1, count));
    }
}