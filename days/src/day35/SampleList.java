package day35;
//Two linked list
//Merge
//sort
class Node{
    int data;
    Node next;
    Node prev;
    Node(int n){
        this.data=n;
    }
    Node(int n,Node next){
        this.data=n;
        this.next=next;
    }
    Node(int n,Node next, Node prev){
        this.data=n;
        this.next=next;
        this.prev=prev;
    }
}
public class SampleList {
    private Node head;
    private Node tail;
    private int size=0;

    public int getSize() {
        return size;
    }

    void insertFirst(int n){

        if(head==null){
            Node newnode = new Node(n);
            head=newnode;
            tail=newnode;
        }else{
            Node newnode = new Node(n,head);
            head=newnode;
        }
        size++;
    }

    void insertLast(int n){
        if(tail==null){
            insertFirst(n);
        }else{
            Node node = new Node(n);
            tail.next=node;
            tail=node;
            size++;
        }
    }

    void insertSpecific(int n,int pos){
        if(pos==1){
            insertFirst(n);
        } else if (pos>size) {
            insertLast(n);
        }
        else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(n, temp.next);
            temp.next = node;
            size++;
        }
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("No elements in list");
            tail=null;
        }else {
            System.out.println("Delete:"+head.data);
            head=head.next;
            size--;
        }
    }
    void deleteLast(){
        if(tail==null){
            System.out.println("No elements in list");
            head=null;
        }
        else if(size<=1){
            deleteFirst();
        }
        else {
            Node temp=head;
            for(int i=1;i<size-1;i++){
                temp=temp.next;
            }
            System.out.println("Delete:"+tail.data);
            tail=temp;
            tail.next=null;
            size--;
        }
    }
    void deleteSpecific(int pos){
        if(pos==1){
            deleteFirst();
        } else if (pos>size) {
            deleteLast();
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            System.out.println("Delete:"+temp.next.data);
            temp.next=temp.next.next;
            size--;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+""+"-->");
            temp=temp.next;
        }
        System.out.println("End");

    }

    void merge(Node head1,Node head2){
        Node temp=head1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head2;

    }


    void sort() {
        Node temp = head;
        while (temp != null) {
            Node temp2 = temp.next;
            while (temp2 != null) {
                if (temp.data > temp2.data) {
                    int tempData = temp.data;
                    temp.data = temp2.data;
                    temp2.data = tempData;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SampleList s1 = new SampleList();
        s1.insertFirst(1);
        s1.insertFirst(2);
        s1.insertLast(3);
        s1.insertSpecific(4,4);
        s1.insertSpecific(5,2);
        s1.display();
        System.out.println("No of Elements:"+ s1.getSize());
       /* s1.deleteFirst();
        s1.deleteLast();
        s1.deleteSpecific(2);
        s1.display();*/
        SampleList s2 = new SampleList();
        s2.insertFirst(6);
        s2.insertFirst(7);
        s2.insertSpecific(8,1);
        s2.display();
        System.out.println("No of Elements:"+ s2.getSize());
        s1.merge(s1.head,s2.head);
        s1.display();
        s1.sort();
        s1.display();

    }
}
