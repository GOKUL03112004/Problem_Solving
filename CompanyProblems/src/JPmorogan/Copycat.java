package JPmorogan;

import java.util.*;

public class Copycat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
        for(String a:arr){
            int count=0;
            for(int i=0;i<a.length()*10;i++) {
                List<Character> a1 = new ArrayList<Character>();
                for (char c : a.toCharArray()) {
                    a1.add(c);
                }
                Collections.shuffle(a1);
                StringBuilder temp1 = new StringBuilder();
                for (char c : a1) {
                    temp1.append(c);
                }
                String temp =temp1.toString();
                int temcount = 0;
                for (int j = 0; j < a.length(); j++) {
                    if(a.charAt(j)!=temp.charAt(j)){
                        temcount++;
                    }
                }
                count=Math.max(temcount,count);
            }
            System.out.println(count);
        }
    }
}
