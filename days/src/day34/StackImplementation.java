package day34;

import java.util.Scanner;

class Stack{
    int size;
    int[] arr;
    int top=-1;

    Stack(int n){
        arr=new int[n];
        this.size=n;
    }
    boolean push(int n){
        if (top >= size - 1) {
            System.out.println("Stack overflow");
            return false;
        }
        arr[++top] = n;
        return true;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else {
            return arr[top--];
        }
    }
     int peek(){
        if(top==-1){
             System.out.println("Stack underflow");
             return -1;
         }
         else {
            return arr[top];
        }
     }
     void printstack(){
        for( int temp=top; temp>=0;temp--){
            System.out.println(arr[temp]);
        }
     }
}
public class StackImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        Stack a1 = new Stack(n);
        a1.push(1);
        a1.push(2);
        a1.push(3);
        a1.push(4);
        //System.out.println(a1.pop());
       // a1.peek();
        a1.printstack();
    }
}
