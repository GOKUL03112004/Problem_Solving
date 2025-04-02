package day34;

class Queue{
    int size;
    int front=0,rear=-1;
    int[] arr;
    Queue(int n){
        arr=new int[n];
        this.size=n;
    }
    boolean enQueue(int n){
        if(rear>=size-1){
            System.out.println("Queue is full");
            return false;
        }
        arr[++rear]=n;
        return true;
    }
    int deQueue(){
        if(front<0){
            System.out.println("Queue is Empty");
            return  -1;
        }
        return arr[front++];
    }
     int fifo(){
        if(front<0){
            System.out.println("Queue is empty");
        }
        return arr[front];
     }
     void printQueue(){
        if(front<0){
            System.out.println("Queue is Empty");
        }
        else {
            for(int n=front;n<=rear;n++){
                System.out.println(arr[n]);
            }
        }

     }
}
public class QueueImplentation {
    public static void main(String[] args) {
        Queue a1 = new Queue(2);
        a1.enQueue(1);
        a1.enQueue(2);
        a1.enQueue(3);
        System.out.println(a1.fifo());
        System.out.println(a1.deQueue());
        System.out.println(a1.fifo());
        a1.printQueue();
    }
}
