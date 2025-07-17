package CCT.Summa;

import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // right sum
            if (leftSum == totalSum) {
                System.out.println("Index: " + i);
                return;
            }
            leftSum += arr[i];
        }

        System.out.println("No such index found");
    }
}