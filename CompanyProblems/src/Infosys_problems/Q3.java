package Infosys_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // Number of sublists
        int n1 = s.nextInt(); // Number of elements in each sublist

        List<List<Integer>> a = new ArrayList<>();

        // Reading input
        for (int i = 0; i < n; i++) {
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < n1; j++) {
                t.add(s.nextInt());
            }
            a.add(t);
        }

        // Processing the list
        for (int i = 0; i < a.size() - 1; i++) {
            List<Integer> temp = a.get(i);
            List<Integer> temp1 = a.get(i + 1);

            if (temp.get(temp.size() - 1) > temp1.get(0)) {
                a.remove(i + 1);
                i = -1; // Restart loop from beginning
            }
        }

        // Printing output
        System.out.println(a);

        s.close(); // Close Scanner
    }
}
