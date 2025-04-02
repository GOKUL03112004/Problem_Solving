package day21;

import javax.security.auth.callback.CallbackHandler;
import java.util.Arrays;

public class StringHandling {
    public static void main(String[] args) {
        String n="welcome to India";
        String n2="hello";
        n=n.toLowerCase();
        n=n.trim();
        char[] c =n.toCharArray();
        Arrays.parallelSort(c);

        String ans=c.toString();
        for(int i=0;i<ans.length();i++){
            if(ans.equals(" ")){
                ans.replace(" ","");
            }
        }
        System.out.println(c);
        StringBuilder s3 = new StringBuilder("hello");

    }
}
