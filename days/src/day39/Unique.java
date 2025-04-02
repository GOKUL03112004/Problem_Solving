package day39;

public class Unique {
    public static void main(String[] args) {
        int[] arr={2,3,3,4};
        int uni=0;
                for(int n:arr){
                    uni^=n;
                }
        System.out.println(uni);
    }
}
