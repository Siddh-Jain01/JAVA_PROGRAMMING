import java.util.*;


class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Linkedlist{
  Node head;

  void add(int data){
    Node newnode = new Node(data);

   if (head == null){
    head = newnode;
   }
   else{
    Node current = head;

    while(current.next != null){
      current = current.next;
    }
    current.next = newnode;
   }

  }

  void print(){
    Node temp = head;

    while(temp != null){
      System.out.print(temp.data+" ");
      
      temp = temp.next;
    }
  }


  void addp(int pos,int data){
    Node newnode = new Node(data);
    Node temp = head;

    for(int i=1;i<pos-1;i++){
      temp = temp.next;
    }

    newnode.next = temp.next;
    temp.next = newnode;
  }


  void remove(int pos){
    Node temp = head;

    for(int i=1;i<pos-1;i++){
      temp=temp.next;
    }

    temp.next = temp.next.next;
  }


  int mid(){
    Node fast = head;
    Node slow = head;

    while(fast.next != null && fast.next.next != null){
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow.data;
  }
}
public class Main {
    public static void main(String[] args) {
     Linkedlist l1 = new Linkedlist();
     l1.add(10);
     l1.add(20); 
     l1.add(30);
     l1.add(40);
     l1.add(50);

     //l1.remove(3);

     //l1.addp(6,80);

     //l1.print();

     int result =l1.mid();
     System.out.print(result);
    }
}