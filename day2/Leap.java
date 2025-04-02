import java.util.*;
 class Leap{
      public static void main(String args[]){
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the Number:");
          int a = s.nextInt();
          if(a %4 == 0)
            {
              if(a%100==0)
                {
                   if(a%400 ==0)
                     {
                       System.out.println("Leap Year");
                     }
                     else 
                     {
                       System.out.println("Not Leap Year");
                     } 
                 }
               else{
                    System.out.println("Not Leap Year");
                 }
            }
            else{
                 System.out.println("Not Leap Year");
                }
        }
}
                  
		  