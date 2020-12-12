package com.nathan;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseString("abc"));
    }
    
    private static String reverseString(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        StringBuffer result = new StringBuffer();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
