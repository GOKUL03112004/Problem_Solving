package day25;

public class StringDigitCount {
    public static void main(String[] args) {
        int input1=6753467;
        int i;
        String s = Integer.toString(input1);
        StringBuilder s1 = new StringBuilder(s);
        for( i=0;i<s1.length();i++){
            int count=0;
            char num=s1.charAt(i);
            for(int j=i+1;j<s1.length();j++){
                if(num==s1.charAt(j)){
                    s1.deleteCharAt(j);
                    count++;
                    j--;
                }
            }
            if(count>0){
                s1.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(s1.length());
    }
}
