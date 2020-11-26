package com.nathan;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int count;

    public LinkedList() {
    }

    public void addFirst(int value) {
        // 0 node
        if (first == null)
            first = last = new Node(value);
        // 1+ nodes
        else
            first = new Node(value, first);
        count++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (first == null)
            first = last = node;
        else {
            last.setNext(node);
            last = node;
        }
        count++;
    }

    public void deleteFirst() {
        if (first == null)
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            Node node = first.getNext();
            first.setNext(null);
            first = node;
        }
        count--;
    }

    public void deleteLast() {
        // 0 node
        if (first == null) {
            throw new NoSuchElementException();
        }
        Node secondLast = getPrevious(last);
        secondLast.setNext(null);
        last = secondLast;
        count--;
    }

    public Node getPrevious(Node node) {
        Node current = first;
        if (first == null) {
            return null;
        }
        while (current.getNext() != null) {
            if (current.getNext() != node)
                current = current.getNext();
            else
                return current;
        }
        return null;

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

    public int[] toArray() {
        int[] nums = new int[count];
        Node current = first;
        int index = 0;
        while (current != null) {
            nums[index] = current.getValue();
            current = current.getNext();
            index++;
        }
        return nums;
    }

    public void reverse() {
        if (count > 1) {
            int[] nums = toArray();
            last = first = null;
            count = 0;
            for (int num : nums) {
                addFirst(num);
            }
        }
    }

    public int size() {
        return count;
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
