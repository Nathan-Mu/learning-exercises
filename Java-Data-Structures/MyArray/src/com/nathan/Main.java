package com.nathan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyArray myArray = new MyArray(4);
        myArray.insert(10);
        myArray.insert(20);
        myArray.insert(30);
        myArray.print();
        myArray.insert(40);
        myArray.print();
        myArray.insert(50);
        myArray.print();
        myArray.removeAt(1);
        myArray.print();
        myArray.removeAt(2);
        myArray.print();
        int i = myArray.indexOf(10);
        System.out.println(i);
        int j = myArray.indexOf(1);
        System.out.println(j);

        /**
         * 10,20,30
         * 10,20,30,40
         * 10,20,30,40,50
         * 10,30,40,50
         * 10,30,50
         * 0
         * -1
         */
    }
}
