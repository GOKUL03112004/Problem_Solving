package day39;

import java.util.HashSet;

public class UniqueSubstringCounter {
    public static int countUniqueSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> uniqueChars = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (uniqueChars.contains(s.charAt(j))) {
                    break;
                }
                uniqueChars.add(s.charAt(j));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countUniqueSubstrings("bcada"));  // Output: 12
        System.out.println(countUniqueSubstrings("abac"));   // Output: 8
    }
}
