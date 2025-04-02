package day26;

abstract class Animal{
    abstract void makesound();
    void describe(){
        System.out.println("Abstract class");
    }
}
class cat extends Animal{
    @Override
    void makesound() {
        System.out.println("Meow Meow");
    }

    @Override
    void describe() {
        super.describe();
    }
}
class dog extends Animal{
    @Override
    void makesound() {
        System.out.println("Bow Bow");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Animal c1 = new cat();
        c1.describe();
        c1.makesound();
        c1= new dog();
        c1.makesound();
        Animal d = new Animal() {
            @Override
            void makesound() {
                System.out.println("hello");
            }
        };
        d.makesound();
        System.out.println(c1 instanceof dog);

    }
}
