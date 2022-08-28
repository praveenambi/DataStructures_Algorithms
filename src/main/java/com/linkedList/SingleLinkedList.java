package com.linkedList;


public class SingleLinkedList {

    private Node head;
    private Node tail;
    private  int size;

    public SingleLinkedList(){
        this.size=0;
    }

    public  void insertfirstNode(int val){

        Node node = new Node(val);
        node.next = head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size=size+1;

    }

    public  void insertLastNode(int val){
        if (tail==null){
            insertfirstNode(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;

    }

    public  void insertAtindex(int val,int index){

        if (index==0){
            insertfirstNode(val); // basically means , if the index value is zero , means there is no Linkedlist , so insert at first node
            return;

        }
        if (index==size){
            insertLastNode(val); // when  the index value is equals size ,then insert it at last index
            return;

        }
        //if need to insert at some index
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next; //traverse  through the index and stop, where need to

        }
        Node node = new Node(val,temp.next); // assign the node with new value and point to stored node to next
        temp.next=node;
        size++;
    }

    public  int deleteFirst(){
        int val = head.value; // take the head value to val to remove
        head=head.next; // move the head to  next node
        if (head==null) {
            tail = null;
        }
        size--;
        return  val;
    }

    public int deleteLast(){  //  problem here  is , the complexity is O(n), as we have to traverse through entire list to get the last but one index

        if (size<=1){
            deleteFirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail=secondlast;
        tail.next=null;
        return  val;
    }

    public  int deleteIndex(int index){

        if (index==0){
            return deleteFirst(); // if index is 0 , then delete first node
        }
        if (index==size-1){

            return deleteLast();// if index is  last one , delete the last index
        }

        Node prev = get(index-1);// get the reference of previous node
        int val = prev.next.value;
        prev.next=prev.next.next;
        return  val;
    }

    //get the node value by passing the value
    public Node findNode(int value){

        Node node =head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null; //if nothing is foud then return null
    }


    public  void  displayStructure(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    // get the index value of required node
    public Node get(int index){

        Node node = head;
        for (int i = 0; i <index ; i++) {

            node=node.next;
        }
        return node;
    }

    private class Node{

        private  int value;
        private  Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }






}
