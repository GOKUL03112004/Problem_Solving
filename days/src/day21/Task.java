package day21;

public class Task {
    public static void main(String[] args) {
        String s = "hello";
        String temp="";
        for(int i=0;i<3;i++){
            temp=temp+s.charAt(i);
        }
        System.out.println("first 3:"+temp);
        for(int j=s.length()-3;j<s.length();j++)
        {
            System.out.print(s.charAt(j));
        }
        System.out.println();
        char[] arr =s.toCharArray();
        int mid = arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(i==mid){
                System.out.println();
            }
            else {
                System.out.print(arr[i]);
            }
        }
    }
}
