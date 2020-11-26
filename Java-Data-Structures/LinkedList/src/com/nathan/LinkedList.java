package com.nathan;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
    }

    public void addFirst(int value) {
        // 0 node
        if (first == null) {
            initiateFirstNode(value);
        }
        // 1+ nodes
        else {
            first = new Node(value, first);
        }
    }

    public void addLast(int value) {
        // 0 node
        if (first == null) {
            initiateFirstNode(value);
        }
        // 1 node
        else if (first.getNext() == null) {
            last = new Node(value);
            first.setNext(last);
        }
        // 2+ node
        else {
            Node newNode = new Node(value);
            last.setNext(newNode);
            last = newNode;
        }
    }

    private void initiateFirstNode(int value) {
        first = new Node(value);
        last = first;
    }

    public void deleteFirst() {
        Node newFirst = first.getNext();
        first.setNext(null);
        first = newFirst;
    }

    public void deleteLast() {
        // 0 node
        if (first == null) {
            throw new RuntimeException("0 node");
        }
        // 1 node
        if (!first.hasNext()) {
            first = null;
            last = null;
        }

        // 2+ node
        Node thisNode = first;
        while (thisNode.getNext() != last) {
            thisNode = thisNode.getNext();
        }
        thisNode.setNext(null);
        last = thisNode;
    }

    public boolean contains(int value) {
        Node thisNode = first;
        while (thisNode != null) {
            if (thisNode.getValue() == value)
                return true;
            thisNode = thisNode.getNext();
        }
        return false;
    }

    public int indexOf(int value) {
        Node thisNode = first;
        int index = 0;
        while (thisNode != null) {
            if (thisNode.getValue() == value)
                return index;
            thisNode = thisNode.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node thisNode = first;
        while (thisNode != null) {
            sb.append(thisNode.getValue()).append(",");
            thisNode = thisNode.getNext();
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
