package data_structure.list.singly_linked_list;

import static common.Utils.LOG;

/** Created by xzinoviou 7/4/2019 */
public class SinglyLinkedList {

  public static void main(String[] args) {

    Node head = null;

    for (int i = 1; i <= 10; i++) {
      if (i > 5) {
        head = prependNode(head, new Node(i));
      } else {
        head = appendNode(head, new Node(i));
      }
    }

    showListContents(head);

    System.out.println(String.format("Total nodes in the list : %d", countNodes(head)));

    head = reverseList(head);

    showListContents(head);
  }

  public static Node appendNode(Node head, Node node) {
    if (isHeadNull(head)) {
      head = node;
      node.next = null;
    } else {
      Node temp = head;

      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = node;
      node.next = null;
    }
    return head;
  }

  public static Node prependNode(Node head, Node node) {
    if (isHeadNull(head)) {
      head = node;
      head.next = null;
    } else {
      node.next = head;
      head = node;
    }
    return head;
  }

  public static void showListContents(Node head) {
    if (isHeadNull(head)) {
      LOG.info("List is empty");
    } else {
      Node temp = head;

      while (temp != null) {
        System.out.print(String.format("[ %d ] --> ", temp.data));
        temp = temp.next;
      }
      System.out.println("NULL");
    }
  }

  public static int countNodes(Node head) {
    if (isHeadNull(head)) return 0;

    Node temp = head;
    int count = 1;

    while (temp.next != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static Node reverseList(Node head) {

    if (isHeadNull(head)) {
      LOG.info("List is empty");
      return null;
    } else {

      Node prev = null;
      Node curr;
      Node next = head;

      while (next != null) {
        curr = next;
        next = curr.next;
        curr.next = prev;
        prev = curr;
      }
      return prev;
    }
  }

  private static boolean isHeadNull(Node head) {
    return head == null;
  }
}
