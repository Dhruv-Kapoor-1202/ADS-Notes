package April.BT;

import java.util.*;

class Node {

  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BT {
  public static int index = 0; // Global index to keep track of the position in the array

  public static void constructTree(int[] arr, Node root) {
    if (index >= arr.length || arr[index] == -1) {
      index++; // Move to the next position in the array
      return;
    }

    root.data = arr[index];
    index++; // Move to the next position in the array

    root.left = new Node(-1); // Initialize left child
    constructTree(arr, root.left); // Recursively construct left subtree

    root.right = new Node(-1); // Initialize right child
    constructTree(arr, root.right); // Recursively construct right subtree
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1 };

    Node root = new Node(-1); // Initialize root node with placeholder data (-1)

    constructTree(arr, root);

    // Now that the tree is constructed, we can print the data of the right child of
    // the root node
    if (root.right != null && root.right.left != null) {
      System.out.println("Data of the right child of the root node: " + root.right.left.data);
    } else {
      System.out.println("The root node does not have a right child.");
    }
  }
}