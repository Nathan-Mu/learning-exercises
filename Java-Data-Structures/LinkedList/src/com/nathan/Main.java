package com.nathan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addFirst(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addFirst(60);
        System.out.println(linkedList.toString());
        linkedList.deleteFirst();
        System.out.println(linkedList.toString());
        linkedList.deleteLast();
        System.out.println(linkedList.toString());
        System.out.println(linkedList.contains(10));
        System.out.println(linkedList.contains(1));
        System.out.println(linkedList.indexOf(40));
        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.size());
        linkedList.reverse();
        System.out.println(linkedList.toString());
        System.out.println(linkedList.size());
    }
}
