package data_structure.list.singly_linked_list;

/** Created by xzinoviou 7/4/2019 */
public class Node {

  public int data;
  public Node next;

  public Node(int data) {
    this(data, null);
  }

  public Node(int data, Node node) {
    this.data = data;
    this.next = node;
  }
}
