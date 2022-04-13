package com.company.hackerrank;


public class Parentheses {

    public static void main(String[] args) {

        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String s) {

        int count = 0;
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            }
            if (c == ')') {
                open--;
            }
            count = Math.max(count, open);
        }
        return count;
    }
}

