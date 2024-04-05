package March.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
  public static void main(String[] args) {
    Tree tree = new Tree();

    tree.insert(3);
    tree.insert(1);
    tree.insert(0);
    tree.insert(4);
    tree.insert(2);
    tree.insert(5);

    System.out.print("Inorder : ");
    tree.inOrder();
    System.out.print("\nPreorder : ");
    tree.preOrder();
    System.out.print("\nPostorder : ");
    tree.postOrder();

    System.out.println("\n\nLevel Order : ");
    tree.levelOrder();
    System.out.println("Right View : ");
    tree.rightView();
    System.out.println("Left View : ");
    tree.leftView();
  }
}

class Tree {
  class Node {
    int data;
    Node left;
    Node right;

    Node() {
    }

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static Node root;

  private Node insertRecursive(Node curr, int data) {
    if (curr == null) {
      return new Node(data);
    }

    if (data < curr.data) {
      curr.left = insertRecursive(curr.left, data);
    } else if (data > curr.data) {
      curr.right = insertRecursive(curr.right, data);
    } else {
      return curr;
    }
    return curr;
  }

  public void levelOrder() {
    if (root == null)
      return;

    Node curr;
    Queue<Node> que = new LinkedList<>();
    que.add(root);
    System.out.println(root.data);

    while (!que.isEmpty()) {
      int x = que.size();
      while (x > 0) {
        curr = que.poll();
        if (curr.left != null) {
          que.add(curr.left);
          System.out.print(curr.left.data + " ");
        }
        if (curr.right != null) {
          que.add(curr.right);
          System.out.print(curr.right.data + " ");
        }
        x--;
        if (x == 0)
          System.out.println();
      }
    }
  }

  public void rightView() {
    if (root == null)
      return;

    Node curr;
    Queue<Node> que = new LinkedList<>();
    que.add(root);
    // System.out.println(root.data);

    while (!que.isEmpty()) {
      int x = que.size();
      while (x > 0) {
        curr = que.poll();
        if (curr.left != null) {
          que.add(curr.left);
        }
        if (curr.right != null) {
          que.add(curr.right);
        }
        x--;
        if (x == 0)
          System.out.println(curr.data);
      }
    }
  }

  public void leftView() {
    if (root == null)
      return;

    Node curr;
    Queue<Node> que = new LinkedList<>();
    que.add(root);

    while (!que.isEmpty()) {
      // Number of Nodes at the current level
      int x = que.size();

      // Traversing all nodes at the current level
      for (int i = 1; i <= x; i++) {
        curr = que.poll();
        if (i == 1) {
          System.out.println(curr.data);
        }
        if (curr.left != null) {
          que.add(curr.left);
        }
        if (curr.right != null) {
          que.add(curr.right);
        }
      }
    }
  }

  public void insert(int data) {
    root = insertRecursive(root, data);
  }

  private void inOrderRecursive(Node curr) {
    if (curr == null)
      return;

    inOrderRecursive(curr.left);
    System.out.print(curr.data + " ");
    inOrderRecursive(curr.right);
  }

  public void inOrder() {
    inOrderRecursive(root);
  }

  private void preOrderRecursive(Node curr) {
    if (curr == null)
      return;

    System.out.print(curr.data + " ");
    preOrderRecursive(curr.left);
    preOrderRecursive(curr.right);
  }

  public void preOrder() {
    preOrderRecursive(root);
  }

  private void postOrderRecursive(Node curr) {
    if (curr == null)
      return;

    postOrderRecursive(curr.left);
    postOrderRecursive(curr.right);
    System.out.print(curr.data + " ");
  }

  public void postOrder() {
    postOrderRecursive(root);
  }
}
