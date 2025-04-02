package day19;
 class NegativeBalanceException extends Exception
 {
     @Override
     public String toString() {
         return "NegativeBalanceException";
     }
 }

public class ThrowDemo {
    public static void main(String[] args) {
        int bal=-500;
        try{
            if(bal<0){
                throw new NegativeBalanceException();
            }
        } catch (NegativeBalanceException e) {
            System.out.println("Catch block");
            e.printStackTrace();
        }
    }
}
