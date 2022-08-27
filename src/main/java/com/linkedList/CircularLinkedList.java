package com.linkedList;

/**
 *  Circular Linkedlist implimentation and logic please refer to ![](CircularLL.png)
 *
 */


public class CircularLinkedList {

    private  Node head;
    private  Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public  void insert(int val){
        Node node = new Node(val);

        if (head==null){
            head= node;
            tail=node;
            return;
        }

        tail.next=node;
        node.next=head;
        tail=head;
    }

    public   void  dispay(){

        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.val+ "->");
                node=node.next;
            }while (node!=head);
        }
        System.out.print("head");
    }

    public  void delete(int Value) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head.val == Value) {
            head = node.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == Value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private  class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }


}
