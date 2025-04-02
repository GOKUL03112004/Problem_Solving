package day21;

import java.util.Arrays;

public class CharClassDemo {
    public static void main(String[] args) {
        String s="VEltEcH";
        char[] c=s.toCharArray();
        int uc=0;

        for(char t: c){

            if(Character.isUpperCase(t)){
                uc++;
            }
            System.out.println(Character.toLowerCase(t));

        }
        System.out.println(uc);
        String ans = RemoveDuplicates.removeDuplicate(s);
        char c2[]=ans.toCharArray();
        Arrays.parallelSort(c2);
        String ans2= new String(c2);
        ans2=ans2.trim();
        ans2=ans2.replace(",","");
        ans2=ans2.replace("]","");
        ans2=ans2.replace("[","");
        System.out.println(ans2);
    }
}
