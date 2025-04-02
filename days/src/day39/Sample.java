package day39;
class Student{
    String name;
    int rollno;
    Student(String name,int rool){
        this.name=name;
        this.rollno=rool;
    }
}
 class Cse extends Student{
    String dept="CSE";
    String spec;
    void display(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(dept);
        System.out.println(spec);
    }
    Cse(String spec,String name,int roll){
        super(name,roll);
        this.spec=spec;
    }
 }
 class Aiml extends Cse{
    Aiml(String name,int roll){
        super("AIML",name,roll);
    }
 }


public class Sample {
    public static void main(String[] args) {
        Aiml s1 = new Aiml("Maanav",21);
        s1.display();
    }
}
