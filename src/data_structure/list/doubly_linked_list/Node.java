package data_structure.list.doubly_linked_list;

/** Created by xzinoviou 7/4/2019 */
public class Node {

  public int data;
  public Node prev;
  public Node next;

  public Node(int data) {
    this(data, null, null);
  }

  public Node(int data, Node prev, Node next) {
    this.data = data;
    this.next = prev;
    this.next = next;
  }
}
