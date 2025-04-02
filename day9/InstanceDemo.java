import java.util.Scanner;

class Employee{
    //2 instance varisble

    int empno;
    String enmae;
    Employee(String name, int empno){
        this.empno=empno;
        this.enmae=name;
    }

    public Employee(String name) {
        this.enmae=name;
    }

    void printDetails()
    {
        System.out.println(enmae  +" is "+empno);
    }
}
public class InstanceDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee arr[]= new Employee[2];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= new Employee(s.next(),s.nextInt());
        }
        for(Employee e : arr)
        {
            e.printDetails();
        }

    }
}
