import java.util.*;
public class Calculator{
  public static void main(String args[]){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter two number and opertor:");
     int a = s.nextInt();
     int b = s.nextInt();
     char o = s.next().charAt(0);
     switch(o){
       case('+'):
          System.out.println(""+(a+b));
          break;
       case('-'):
         System.out.println(""+(a-b));
         break;
       case('*'):
         System.out.println(""+(a*b));
         break;
       case('%'):
         System.out.println(""+(a/b));
         break;
       default:
         System.out.println("Invalid");
         break;
       }
    }
}	







     
