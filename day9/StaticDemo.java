public class StaticDemo {
    static int k=0;
    static void hello()
    {
        System.out.println("Hello world");
        System.out.println(k);
        k++;
    }
    void hi(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        hello();
        StaticDemo s=new StaticDemo();
        s.hi();
        System.out.println(k);
    }
}
