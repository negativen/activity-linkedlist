package org.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<String>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        System.out.println(linkedList);

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");

        System.out.println(linkedList);

        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.pollLast();
        linkedList.pollLast();




    }
}
