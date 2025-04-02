package JPmorogan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Choco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int cost=s.nextInt();
        String c=s.next();
        int[] chococost = new int[26];
        for(int i=0;i<26;i++){
            chococost[i]=s.nextInt();
        }
        String alp="abcdefghijklmnopqrstuvwxyz";
        char[] summa=c.toCharArray();
        char[] summa1=alp.toCharArray();
        HashMap<String,Integer> a= new HashMap<>();
        int summax=0;
        for(int i=0;i<summa.length-1;i++){
            String t=Character.toString(summa[i])+Character.toString(summa[i+1]);
            int sum=chococost[alp.indexOf(summa[i])]+chococost[alp.indexOf(summa[i+1])];
            if(summax<sum){
                summax=sum;
            }
            a.put(t,sum);
        }
        int count=0;
        int max=0;
        int temp=1;
        for(Map.Entry<String,Integer> i:a.entrySet()){
            if(temp==1 && i.getValue()==summax){
                count+=2;
                temp=0;
                i.setValue(cost+1);

            }else{

                if(i.getValue()>max && i.getValue()<=cost){
                    max=i.getValue();
                }
            }
        }
        if(max>0){
            count+=2;
        }
        System.out.println(count);
    }
}
