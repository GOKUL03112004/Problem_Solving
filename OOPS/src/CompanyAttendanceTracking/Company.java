package CompanyAttendanceTracking;

import java.util.Random;
import java.util.Scanner;

public class Company{
    static Employee[] employeeArray = new Employee[100];
    static int i=0;
     static int temp=0;
     static int temp2=-1;
    static void newEmployee(Scanner s){
        Random rand = new Random();
        System.out.println("Enter the Name:");
        String name=s.next();
        System.out.println("Enter the Mobile Number:");
        long num=s.nextLong();
        employeeArray[i]=new Employee(name,num, rand.nextInt(10000));
        System.out.println("Your EmployeeId: "+employeeArray[i].getEmployeeId());
        i++;
    }
    static void oldEmployee(Scanner s){
        System.out.println("LOGIN");
        System.out.println("Enter the Name:");
        String na=s.next();
        System.out.println("Enter the EmployeeId");
        int id=s.nextInt();
        for (Employee emp : employeeArray) {
            if (emp != null && emp.getEmployeeId() == id) {
                emp.isLogin = true;
                temp2 = temp;  // Set temp2 to a valid index
                System.out.println("Login successful for Employee ID: " + id);
                break;
            }
            temp++;
        }

        if (temp2 == -1) {
            System.out.println("Employee not found.");
        }

        if(employeeArray[temp2].isLogin){
            while(true){
            System.out.println("Enter 1.IN 2.OUT 3.Salary 4.Exit");
                switch (s.nextInt()){
                    case(1):{
                        System.out.println("Enter the Time in Hour(9Am to 5Pm): ");
                        employeeArray[temp2].attendanceIn(s.nextInt());
                        break;
                    }
                    case (2):{
                        System.out.println("Enter the Time in Hour(9Am to 5Pm): ");
                        employeeArray[temp2].attendanceOut(s.nextInt());
                        break;
                    }
                    case(3):{
                        employeeArray[temp2].workPerDay();
                        employeeArray[temp2].displaySalary();
                        break;
                    }
                    case(4):{
                        System.out.println("Exit");
                        return;
                    }
                    default:{
                        System.out.println("ERROR");
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome To Company");
        while(true){
            System.out.println("1.New Employee 2.Old Employee 3.Exit");
            int n= s.nextInt();
            switch(n) {
                case(1): {
                    newEmployee(s);
                    break;
                }
                case(2):{
                    oldEmployee(s);
                    break;
                }
                case(3):{
                    System.out.println("Thank you");
                    return;
                }
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}
