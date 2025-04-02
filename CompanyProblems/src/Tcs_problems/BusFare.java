package Tcs_problems;

import javax.xml.transform.Source;
import java.util.Scanner;

public class BusFare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int start = Integer.parseInt(a.split(" ")[1]);
        int dest = Integer.parseInt(b.split(" ")[1]);
        int[] dis = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        int j = start - 1;
        int sum = 0;
        while (j != dest - 1) {
            sum += dis[j];
            if (j == dis.length - 1) {
                j = -1;
            }
            j++;
        }

        int ans = (int) Math.ceil(sum * 0.005);
        System.out.println("distance: " + sum + " Cost: " + ans);
    }
}
