package day27;
import java.util.*;
abstract class Student{
    int id;
    String name;
      private String password;

    public String getPassword() {
        return password;
    }
    Student(int n, String name){
        this.id=n;
        this.name= name;
    }
    abstract void Password(String pass);
    abstract void displayDetails();
    public void setpassword1(String pass){
        this.password=pass;
    }
}
class BE extends Student{
    BE(int n, String name) {
        super(n, name);
    }
    @Override
    void Password(String pass) {
        this.setpassword1(pass);
    }
    void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(getPassword());
    }
}
class ME extends Student{
    ME(int n ,String name){
        super(n,name);
    }
    @Override
    void Password(String pass){
        this.setpassword1(pass);
    }
    void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(getPassword());
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Student[] arr = new Student[10];
        Scanner s = new Scanner(System.in);
        int id=s.nextInt();
        String name = s.next();
        String pass = s.next();
        arr[0] = new BE(id,name);
        arr[0].Password(pass);
        arr[0].displayDetails();
    }
}
