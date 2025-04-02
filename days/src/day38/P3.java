package day38;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        HashMap<Character,Integer> arr = new HashMap<>();
        for(char n:a.toCharArray()){
            arr.put(n,arr.getOrDefault(n,0)+1);
        }
        char[] min = new char[a.length()];
        int minint=Integer.MAX_VALUE;
        char minchar='\0';
        int maxint=Integer.MIN_VALUE;
        char maxchar='\0';
        for(Map.Entry<Character,Integer> y:arr.entrySet()) {
            if(minint>y.getValue()){
                minint=y.getValue();
                minchar=y.getKey();
            }
            if(maxint<y.getValue()){
                maxint=y.getValue();
                maxchar=y.getKey();
            }
        }
        for(Map.Entry<Character,Integer> y : arr.entrySet()){
            if(minint==y.getValue()){
                System.out.println("minimun occurs "+y.getKey());
            }
        }
        for(Map.Entry<Character,Integer> y : arr.entrySet()){
            if(maxint==y.getValue()){
                System.out.println("maximum occurs "+y.getKey());
            }
        }
        char leximaxans='\0';

    }
}
