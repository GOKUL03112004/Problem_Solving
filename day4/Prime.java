import java.util.*;
class Prime{
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println(" enter the range of numbers:");
    int a =s.nextInt();												
    int b =s.nextInt();	
    for(int j =a;j<b;j++)
    {
      if(j==1)
      {
         continue;
      }
      int n=j;
    int count=0;
       for(int i=2;i<(int)(Math.sqrt(n));i++){
        if(n%i==0){
           count++;
        }
   }
         if(count==0){
         if(n%10==7)
{
System.out.println(n);
}
         }
    }
}
}

  
   
  