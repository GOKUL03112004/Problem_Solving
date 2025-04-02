package day21;

public class AllSubString {
    public static void main(String[] args) {
        String s= "velTech";
        StringBuilder str = new StringBuilder();
        int count=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                str.append(s.substring(i,j));
                System.out.println(s.substring(i,j));
                count++;
            }
        }
        System.out.println(count);
        // formula to count the substring count
        //(n*(n+1))/2 + 1;
        System.out.println(RemoveDuplicates.logic(s));
    }
}
