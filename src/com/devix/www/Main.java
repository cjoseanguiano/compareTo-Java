package com.devix.www;

public class Main {

    public static void main(String[] args) {

        String s = "Hello world";
        String anotherString = "hello world";
        Object object = s;

        System.out.println(s.compareTo(anotherString));
        System.out.println(s.compareToIgnoreCase(anotherString));
        System.out.println(s.compareTo(object.toString()));
    }
}
