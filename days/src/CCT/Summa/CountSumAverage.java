package CCT.Summa;

import java.util.Scanner;

public class CountSumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int num;

        System.out.println("Enter integers (enter -999 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == -999) {
                break;
            }

            sum += num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Total Count: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}
