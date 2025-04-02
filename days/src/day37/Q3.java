package day37;

import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> s1 = new HashMap<>();
        s1.put(1,100);
        s1.put(2,200);
        System.out.println(s1.get(2));
        System.out.println(s1.entrySet());
        System.out.println(s1.keySet());
        System.out.println(s1.values());
        System.out.println(s1.containsKey(2));
        System.out.println(s1.containsValue(500));
    }
}
