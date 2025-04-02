import java.util.Scanner;
 class Customer{
    String Name;
    Long phoneno;
    int pin;
    String password;
    Float balance;
    boolean login;
    Customer(String Name,Long phoneno,int pin, String password){
        this.Name=Name;
        this.phoneno=phoneno;
        this.pin=pin;
        this.password=password;
        this.login=false;
        this.balance=1000F;
    }
    float checkbalance() {
        return this.balance;
     }

 }

public class Bank  {
    static int id=-1;
    static int i=0;

     static Customer arr[]=new Customer[10];
    static void NewCustomer(Scanner s){
        System.out.println("Welcome to the bank");
        System.out.println("Enter the Account Name:");
        String name=s.next();
        System.out.println("Enter the phone number:");
        Long no = s.nextLong();
        System.out.println("Enter the Password");
        String pass=s.next();
        System.out.println("Enter the PIN Number(4 digit): ");
        int pin=s.nextInt();
        arr[i] = new Customer(name,no,pin,pass);
        i++;
    }
    static void ExistingCustomer(Scanner s){
        System.out.println("LOGIN");
        System.out.println("Enter Name:");
        String name =s.next();
        System.out.println("Enter Password:");
        String pass=s.next();
        for(Customer c : arr) {
            id++;
            if (c.Name.equals(name) && c.password.equals(pass)) {
                System.out.println("Login successful");
                c.login = true;
                break;
            }
            else {
                System.out.println("Login failed");
                return;
            }
        }
        if(arr[id].login) {
            while (true) {
                System.out.println("Enter 1.To Check Balance 2.To Transfer 3. To Deposit 4.Exit");
                int n = s.nextInt();
                switch (n) {
                    case 1: {
                        System.out.println("Account Balance is:" + arr[id].checkbalance());
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the amount to Transfer");
                        System.out.println("Enter the PIN number");
                        if (arr[id].pin == s.nextInt()) {
                            arr[id].balance = Math.abs(s.nextFloat() - arr[id].balance);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the amount to deposit");
                        System.out.println("Enter the PIN number");
                        if (arr[id].pin == s.nextInt()) {
                            arr[id].balance = (s.nextFloat() + arr[id].balance);
                        }
                        break;
                    }
                    case 4: {
                        s.close();
                        return;
                    }
                    default: {
                        System.out.println("Invalid");

                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
        System.out.println("Enter 1. New Account");
        System.out.println("Enter 2. Existing Account");
        System.out.println("Enter 3. Exit");
        int n= s.nextInt();
            switch (n) {
                case 1: {
                    NewCustomer(s);
                    break;
                }
                case 2:{
                    ExistingCustomer(s);
                    break;
                }
                case 3:{
                    System.out.println("Thank you");
                    s.close();
                    return;
                }
                default:{
                    System.out.println("Invalid");
                }
            }
        }
    }
}
