package day37;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        Queue<Integer> s1 = new PriorityQueue<>();
        s1.add(100);
        s1.add(200);
        System.out.println(s1.remove());
    }
}
