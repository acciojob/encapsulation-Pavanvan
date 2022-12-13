package com.driver;
public class Main {
public  static class RWOnly {
    // Private member variable
    private String name;

    // Getter method for name
    public String getName() {
        return this.name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}

// Main.java


    public static void main(String[] args) {
        // Create an object of the RWOnly class
        RWOnly obj = new RWOnly();

        // Set the value of name using the setter method
        obj.setName("Pavan gp");

        // Get the value of name using the getter method
        String name = obj.getName();

        System.out.println(name); // Output: "Pavan gp"
    }
}