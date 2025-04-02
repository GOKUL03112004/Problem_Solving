package day39;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

class HuffmanNode {
    int data;
    char c;
    HuffmanNode left, right;
}

// Comparator class for PriorityQueue (Min-Heap)
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

public class Huffmancode {
    // Function to print Huffman Codes
    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println(root.c + ": " + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of characters
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        // Creating a priority queue (Min-Heap)
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());

        // Insert characters and their frequencies into the queue
        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;

        // Building Huffman Tree
        while (q.size() > 1) {
            HuffmanNode x = q.poll(); // Get min 1
            HuffmanNode y = q.poll(); // Get min 2

            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;

            root = f;
            q.add(f);
        }

        System.out.println("Huffman Code generated:");
        printCode(root, "");

        scanner.close();
    }
}
