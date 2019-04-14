package data_structure.tree.binary_tree;

import data_structure.tree.Node;

/** Created by xzinoviou 11/4/2019 */
public class BinaryTree {

  public Node root;

  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree();

    binaryTree.root = addNode(binaryTree.root, new Node(40));
    binaryTree.root = addNode(binaryTree.root, new Node(20));
    binaryTree.root = addNode(binaryTree.root, new Node(10));
    binaryTree.root = addNode(binaryTree.root, new Node(30));
    binaryTree.root = addNode(binaryTree.root, new Node(5));
    binaryTree.root = addNode(binaryTree.root, new Node(60));
    binaryTree.root = addNode(binaryTree.root, new Node(50));
    binaryTree.root = addNode(binaryTree.root, new Node(70));
    binaryTree.root = addNode(binaryTree.root, new Node(55));

    preOrderTraversal(binaryTree.root);
    System.out.println();
    inOrderTraversal(binaryTree.root);
    System.out.println();
    postOrderTraversal(binaryTree.root);
  }

  public static Node addNode(Node root, Node node) {

    if (root == null) {
      return node;
    }

    if (node.data < root.data) {
      root.left = addNode(root.left, node);
    } else if (node.data > root.data) {
      root.right = addNode(root.right, node);
    } else {
      return root;
    }
    return root;
  }

  public static void preOrderTraversal(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
    }
  }

  public static void inOrderTraversal(Node root) {
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.data + " ");
      inOrderTraversal(root.right);
    }
  }

  public static void postOrderTraversal(Node root) {
     if (root != null) {
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.print(root.data + " ");
    }

  }

}
