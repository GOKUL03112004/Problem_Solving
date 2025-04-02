package day23;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder("Tenet");
        StringBuilder s1=new StringBuilder();

        if(s1.equals(s)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
        System.out.println(s.compareTo(s1));
    }
}
