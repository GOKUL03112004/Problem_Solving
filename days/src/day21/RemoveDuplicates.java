package day21;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
    static String removeDuplicate(String s){
        HashSet set1= new HashSet();
        for(char t:s.toCharArray()){
            set1.add(t);
        }
        return set1.toString();
    }
    static String logic(String s){
        String ans ="";
        for(char c:s.toCharArray()){
            if(ans.indexOf(c)<0){
                ans=ans+c;
            }
        }
        return ans;
    }
}
