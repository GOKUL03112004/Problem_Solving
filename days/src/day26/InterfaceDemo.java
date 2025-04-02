package day26;
interface calc{
    int add(int a,int b);
    int sub(int a,int b);
}
interface calc2{
    int multi(int a,int b);
}
class calculate implements calc,calc2{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int multi(int a, int b) {
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        calculate c = new calculate();
        System.out.println(c.add(1,3));
        System.out.println(c.multi(3,9));
        System.out.println(c.div(3,1));
    }
}
