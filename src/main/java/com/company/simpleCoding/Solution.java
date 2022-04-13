package com.company.simpleCoding;

public class Solution {

    public static void main(String[] args) {

        String str = "Ch";
        int n = 3;


            int frontLen = 3;
            if (frontLen > str.length()) {
                frontLen = str.length();
            }
            String front = str.substring(0, frontLen);

            String result = "";
            for (int i=0; i<n; i++) {
                result = result + front;
            }
        System.out.println(result);
        }
    }

