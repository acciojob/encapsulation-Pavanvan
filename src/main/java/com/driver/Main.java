package com.driver;
public class Main {
    public static void main(String[] args) {
        // Create an object of the RWOnly class
        RWOnly obj = new RWOnly();

        // Set the value of name using the setter method
        obj.setName("Pavan");

        // Get the value of name using the getter method

              System.out.println(obj.getName());

    }
}