package day39;

public class Summa {
    public static void main(String[] args) {
        String a="babba";
        StringBuffer b= new StringBuffer(a);
        for(int i=0;i<b.length()-1;i++){
            String c= ""+b.charAt(i)+b.charAt(i+1);
            if(c.equalsIgnoreCase("ab") || c.equalsIgnoreCase("bb")){
                b.delete(i,i+2);
                i=-1;
            }
        }
        System.out.println(b.length());
    }
}
