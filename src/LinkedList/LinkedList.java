package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LL{
    Node head = null;
    public void addInStart(int data){
        Node n1=new Node(data);

        if(head == null){
            head=n1;
            return;
        }

        Node temp=head;
        n1.next=temp;
        head=n1;

    }
    public void addInEnd(int data){
        Node n1=new Node(data);

        if(head == null){
            head=n1;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;

    }

    public void addInPosition(int k, int data){
        if(getLength()<k){
            System.out.println("Invalid position");
            return;

        }
        Node temp=head;
        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }
        Node n1=new Node(data);
        n1.next=temp.next;
        temp.next=n1;
    }

    public void addInMid(int data){
        Node fast=head;
        Node slow=head;
        while(fast.next.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;

        }

        Node n1=new Node(data);
        n1.next=slow.next;
        slow.next=n1;
    }

    public int deleteHead(){
        if(head == null){
            return -1;
        }

        int data=head.data;
        head=head.next;
        return data;
    }

    public int deleteLast(){
        Node temp=head;
        Node fast=head.next;
        Node slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int data=fast.data;
        slow.next=null;
        return data;
    }

    public int deleteMid(){
        Node fast=head;
        Node slow=head;
        while(fast.next.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;

        }

        int data=slow.next.data;
        slow.next=slow.next.next;
        return data;
    }

    public void displayData(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;

        }
        System.out.print("null\n");
    }

    public int getLength(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }

    return c;
    }

}

public class LinkedList {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.addInStart(4);
        l1.displayData();
        l1.addInEnd(5);
        l1.addInEnd(6);
        l1.addInPosition(3,2);
        l1.addInMid(7);
        l1.addInMid(3);
        l1.displayData();
//        System.out.println(l1.deleteMid());
//        l1.displayData();
    }
}
