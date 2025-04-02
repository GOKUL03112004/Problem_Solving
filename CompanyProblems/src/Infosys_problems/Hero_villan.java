package Infosys_problems;

import java.util.Scanner;

public class Hero_villan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int h=s.nextInt();
        int he=s.nextInt();
        int[] ve=new int[v];
        int ve1=0,ans=0;
        boolean check=false;
        for(int i=0;i<v;i++){
            ve[i]=s.nextInt();
            ve1+=ve[i];
        }
        int he1=he*h;
       if(he1>=ve1){
           System.out.println("0");
       }
       else {
           int diff=Math.abs(he1-ve1);
           for(int i=0;i<ve.length-1;i++){
               if(check){
                   break;
               }
               int cur=ve[i];
               int count=1;
               for(int j=i+1;j<ve.length;j++){
                   if(cur<diff) {
                       cur = cur +ve[j];
                       count++;
                   }
                   if(cur==diff){
                       check=true;
                   }
                   if(check){
                       ans=count;
                       break;
                   }
               }
           }
           System.out.println(ans);
       }
    }
}
