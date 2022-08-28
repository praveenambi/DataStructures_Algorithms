package com.linkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        SingleLinkedList sslink = new SingleLinkedList();
        sslink.insertfirstNode(30);
        sslink.insertfirstNode(60);
        sslink.insertfirstNode(40);
        sslink.insertfirstNode(53);
        sslink.insertfirstNode(21);
        sslink.insertLastNode(102);
        sslink.insertAtindex(143,3);
        sslink.displayStructure();
        System.out.println(sslink.deleteFirst());;
        sslink.displayStructure();
        System.out.println(sslink.deleteLast());
        sslink.displayStructure();
        System.out.println(sslink.deleteIndex(2));
        sslink.displayStructure();
        System.out.println(sslink.findNode(60));
        sslink.displayStructure();

    }
}
