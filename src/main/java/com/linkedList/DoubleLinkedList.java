package com.linkedList;

/**
 *  Double Linked list internal implimentation and Logic
 *  Please refer to ![](DoubleLL.png)
 *
 * For insertLast method please refer to ![](DoulbeLLInsertLast.png)
 */


public class DoubleLinkedList {

    Node head;


    // get the index value of required node
    public Node get(int index){

        Node node = head;
        for (int i = 0; i <index ; i++) {

            node=node.next;
        }
        return node;
    }

    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }

    // taking referenc of last node and as and when node moves , assigning it  to last node
    public  void display(){
        Node node  = head;
        Node last = null;
        while (node!=null){
            System.out.print(node.val + "->");
            last=node;
            node=node.next;
        }
        System.out.println("End");

        // print in reversal order
        while (last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("Start");
    }

    public  void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next=null;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }



    public void insertAfterElement(int ElementVal, int val){

      Node prevNode =   get(ElementVal);
      if (prevNode==null){
          System.out.println("Unable to find the Node wth Value " + ElementVal);
          return;
      }
        Node node = new Node(val);
      node.next=prevNode.next;
      prevNode.next=node;
      node.prev=prevNode;
      if (node.next!=null){
          node.next.prev=node;
      }


    }




    private class Node{

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }







    }



}
