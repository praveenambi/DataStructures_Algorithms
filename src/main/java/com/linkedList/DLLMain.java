package com.linkedList;

public class DLLMain {


    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(5);
        list.insertFirst(43);
        list.insertFirst(1);
        list.insertFirst(23);
        list.insertFirst(43);
        list.insertFirst(54);
        list.display();
        list.insertLast(90);
        list.display();
        list.insertAfterElement(1,48);
        list.display();



    }
}
