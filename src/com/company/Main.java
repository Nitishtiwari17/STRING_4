package com.company;

public class Main {

    public static void main(String[] args) {
        String str1="Python Exercises";
        String str2="Python Exercise";
        String end_str="se";
        boolean ends1=str1.endsWith(end_str);
        boolean ends2=str2.endsWith(end_str);
        System.out.println("\""+ str1+"\"end with"+"\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"?" + ends2);

	// write your code here
    }
}
