package data_structure.tree;

/** Created by xzinoviou 11/4/2019 */
public class Node {

  public int data;
  public Node left;
  public Node right;

  public Node(int data) {
    this(data, null, null);
  }

  public Node(int data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
