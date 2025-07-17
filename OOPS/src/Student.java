import java.util.Scanner;
class Student {
    // 4 instance variable
    int vtuno;
    String name;
    long phoneno;
    int ans1=0;
    //Non-static method
    int cgpa(int sub, Scanner s)
    {
        if(this.ans1==0){
            float ans=0;
            int arr[]=new int[sub];
            for(int i=0;i<sub;i++)
            {
                System.out.println("Enter the Sem"+(i+1)+" gpa:");
                arr[i]=s.nextInt();
            }
            for(int j=0;j<sub;j++)
            {
                ans=ans+arr[j];
            }
            ans1=(int)(ans/sub);
            return (int)(ans/sub);
        }
        else{
            return this.ans1;
        }
    }
    Student(int vtu,String name, long phone)
    {
        this.vtuno=vtu;
        this.name=name;
        this.phoneno=phone;
    }
    void displaydetails()
    {
        System.out.println(vtuno);
        System.out.println(name);
        System.out.println(phoneno);
    }


    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of students:");
        int n=s.nextInt();
        Student arr[]= new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Details of student"+(i+1)+"in order of vtu no, name, phoneno:");
            arr[i]=new Student(s.nextInt(),s.next(),s.nextLong());
            System.out.println();

        }
        for(Student s1: arr){
            s1.displaydetails();
            System.out.println("CGPA:"+s1.cgpa(8,s));
        }
        //to access object from specific array index:
        Student student = arr[0];
        student.displaydetails();
        System.out.println("CGPA:"+student.cgpa(8,s));
    }
}