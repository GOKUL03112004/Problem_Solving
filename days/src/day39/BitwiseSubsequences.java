package day39;

import java.util.*;

public class BitwiseSubsequences {
    public static void main(String[] args) {
        String str = "bcada";
        int n = str.length();
        int totalSubsequences = (int) Math.pow(2, n);
        System.out.println("length: "+totalSubsequences);
        System.out.println("All Subsequences:");
        HashSet a = new HashSet();
        for (int i = 0; i < totalSubsequences; i++) {
            StringBuilder subseq = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if bit is set
                    subseq.append(str.charAt(j));
                }
            }
            a.add(subseq);
        }
        System.out.println(a.size());
    }
}
