package JPmorogan;

import java.util.Scanner;

public class ExamHall {
    static  boolean test(String a){
        char[] b=a.toCharArray();
        for(int i=0;i<b.length-1;i++){
            if(b[i]=='1' && b[i+1]=='1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int temp = 0;
        int temp1 = 1;
        String[] b = new String[max];
        while (temp < max) {
            String a = Integer.toBinaryString(temp1);
            if (test(a)) {
                b[temp] = a;
                temp++;
                temp1++;
            }
            else {
                temp1++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int m = arr[i];
            System.out.println(b[m - 1]);
        }
    }
}
