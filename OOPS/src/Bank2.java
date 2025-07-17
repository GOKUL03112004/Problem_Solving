import java.util.Scanner;

class Customers{
    String Name;
    String password;
    boolean islogin;
    boolean iscreated;
     int id;
    Account account;
    Customers(String Name, String password,int i,int pin,Float balance){
        this.Name=Name;
        this.password=password;
        this.islogin=false;
        this.id=i+1;
        this.account=new Account(Name,pin,balance);
        this.iscreated=true;
    }

}
class Account{
    String AccountName;
    int pin;
     private Float balance;
    Transaction transaction;
    Account(String name,int pin, Float balance) {
        this.AccountName=name;
        this.pin=pin;
        this.balance=balance;
        this.transaction=new Transaction();
    }
    boolean Withdraw(Float num,Scanner s)
    {
        System.out.println("Enter the PIN:");
        if(balance>num && s.nextInt()==pin)
        {
            balance=balance-num;
            String  temp="Withdraw: "+num;
            transaction.updatetransaction(temp);
            return true;
        }
        else{
            return false;
        }
    }

    public Float getBalance() {
        return balance;
    }

    boolean deposit(Float num, Scanner s){
        System.out.println("Enter the PIN:");
        if(num>0 && s.nextInt()==pin)
        {
            balance=num+balance;
            String temp="Deposit: "+num;
            transaction.updatetransaction(temp);
            return true;
        }
        else {
            return false;
        }
    }

}class Transaction{
    String[] arr =new String[100];
    int i=0;
    void updatetransaction(String msg)
    {
        arr[i]=msg;
        i++;
    }
    void transactionhistory()
    {
        System.out.println("Transaction History:");
        for(String i:arr)
        {
            if(i==null) {
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}

public class Bank2 {
    static Customers[] arr =new Customers[10];
    static int i=0;
    static void NewCustomer(Scanner s) {
        System.out.println("Welcome to the bank");
        System.out.println("Enter the Name:");
        String name=s.next();
        System.out.println("Enter the Password");
        String pass=s.next();
        System.out.println("Enter the 4 digit pin number:");
        int pin =s.nextInt();
        System.out.println("Enter the Amount above 1000 for New Account");
        Float num=s.nextFloat();
        arr[i] = new Customers(name,pass,i,pin,num);
        if(arr[i].iscreated)
        {
            System.out.println("Successfully Account created with ID of:"+i);
        }
        else {
            System.out.println("Account Creation Failed");
        }
        i++;

    }
    static void ExistingCustomer(Scanner s) {

        System.out.println("Enter the Name:");
        String name=s.next();
        System.out.println("Enter the Password");
        String pass=s.next();
        System.out.println("Enter the Account ID:");
        int id=s.nextInt();
        if(name.equals(arr[id].Name) && pass.equals(arr[id].password))
        {
            System.out.println("Login successful");
            arr[id].islogin=true;
        }
        else{
            System.out.println("Login failed");
        }
        if(arr[id].islogin) {
            while (true) {
                System.out.println("Enter 1.Balance 2.Withdraw 3.Deposit 4.Transaction History 5.Exit");
                int n = s.nextInt();
                switch (n) {
                    case 2: {
                        System.out.println("Enter the Amount to Withdraw:");

                        if(arr[id].account.Withdraw(s.nextFloat(),s))
                        {
                            System.out.println("Withdraw Successful");
                        }
                        else {
                            System.out.println("Withdraw Failed");
                        }
                        break;
                    }
                    case 1: {
                        System.out.println("Balance: "+arr[id].account.getBalance());
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the Amount to deposit:");
                        if(arr[id].account.deposit(s.nextFloat(),s))
                        {
                            System.out.println("Deposit Successful");
                        }
                        else{
                            System.out.println("Deposit Failed");
                        }
                        break;
                    }
                    case 5: {
                        return;
                    }
                    case 4:{
                        arr[id].account.transaction.transactionhistory();
                        break;
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
                    return;
                }
                default:{
                    System.out.println("Invalid");
                }
            }
        }
    }
}
