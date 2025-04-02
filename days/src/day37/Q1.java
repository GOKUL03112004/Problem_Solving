package day37;

import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.add(100);
        s1.add(200);
        s1.add(300);
        s1.push(200);
        System.out.println(s1.remove(1));
        System.out.println(s1.pop());
    }
}
