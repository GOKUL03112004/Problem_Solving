package day23;

import java.util.Arrays;

public class String_sort {
    public static void main(String[] args) {
        String s1="Kanoj";
        String s2="Kuar";
        String s3="kasha";
        String[] arr = {s1,s2,s3};
        Arrays.sort(arr);
        for(String i:arr){
            System.out.println(i);
        }
    }
}
