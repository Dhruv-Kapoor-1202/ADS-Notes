package March.LinkedList;

public class Reverse {

  class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node Head = null;

  public void insert(int data) {
    Node newNode = new Node(data);
    Node curr = Head;

    if (Head == null) {
      Head = newNode;
    } else {
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    }
  }

  public void reverse() {
    Node curr = Head;
    Node prev = null;
    Node forw = Head.next;

    while (curr != null) {
      curr.next = prev;
      prev = curr;
      curr = forw;
      forw = forw.next;
    }

    

  }

  public void display() {
    Node curr = Head;

    while (curr != null) {
      System.out.print(curr.data + " -> ");
      curr = curr.next;
    }
    if (curr == null) {
      System.out.println("NULL");
    }
  }

  public static void main(String[] args) {
    Reverse ll = new Reverse();

    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);

    ll.display();
  }
}
