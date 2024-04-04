package March.LinkedList;

/**
 * @todo
 *       Check if the linked list contains
 *       a cycle or not.
 */
public class IsCyclic {
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

  public void setFinal(int data, int pos) {
    Node slow = Head;
    Node fast = Head;
    Node newNode = new Node(data);

    while (fast.next != null) {
      fast = fast.next;
    }
    fast.next = newNode;

    for (int i = 0; i < pos - 1; i++) {
      slow = slow.next;
    }
    newNode.next = slow.next;

  }

  public boolean checkCyclic() {
    Node fast = Head;
    Node slow = Head;

    while (fast.next != null || fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast)
        return true;
    }
    return false;
  }

  public void display() {
    Node curr = Head;
    Node fast = Head;

    // while (curr != null) {
    // System.out.print(curr.data + " -> ");
    // curr = curr.next;
    // }
    while (fast.next != null || fast.next.next != null) {
      System.out.print(fast.data + " -> " + fast.next.data + " -> ");
      fast = fast.next.next;
      curr = curr.next;
      if (curr == fast) {
        return;
      }
    }
    if (curr == null) {
      System.out.println("NULL");
    }
  }

  public static void main(String[] args) {
    IsCyclic ll = new IsCyclic();

    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.insert(6);
    ll.insert(7);

    ll.setFinal(8, 3);

    System.out.println(ll.checkCyclic());
    ll.display();

  }
}
