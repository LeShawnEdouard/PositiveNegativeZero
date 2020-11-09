package com.company;

public class Main {

    public static void main(String[] args) {  // use "psvm" + tab to create a 'main' method
        checkNumber(5);
        checkNumber(-10);
    }

    public static void checkNumber(int number) {
        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        }
    }
}
