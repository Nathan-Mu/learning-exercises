package com.nathan;

public class MyArray {
    private int[] numbers;
    private int size;

    public MyArray(int length) {
        this.numbers = new int[length];
        this.size = 0;
    }

    public void insert(int number) {
        if (numbers.length == size) {
            int[] newNumbers = new int[size * 2];
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = this.numbers[i];
            }
            this.numbers = newNumbers;
        }
        numbers[size] = number;
        size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Incorrect Index");
        }
        size--;
        for (int i = index; i < size; i++) {
            numbers[i] = numbers[i+1];
        }
    }

    public int indexOf(int number) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println("=========");
        for (int i = 0; i < size; i++) System.out.println(numbers[i]);
        System.out.println("=========");
        System.out.println();
        System.out.println();
    }

    public int max() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}
