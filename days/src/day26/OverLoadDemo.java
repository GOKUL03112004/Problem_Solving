package day26;

public class OverLoadDemo {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        OverLoadDemo d = new OverLoadDemo();
        System.out.println(d.add(1,2));
        System.out.println(d.add(1,2,3));
    }
}
