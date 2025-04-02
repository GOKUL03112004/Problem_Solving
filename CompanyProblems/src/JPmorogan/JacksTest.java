package JPmorogan;

import java.util.HashSet;
import java.util.Scanner;

public class JacksTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a=s.nextLine().toLowerCase();
        HashSet<String> arr= new HashSet<>();
        String[] arr1=a.split(" ");
        for(String i:arr1){
            arr.add(i);
        }
        System.out.println(arr);
    }
}
