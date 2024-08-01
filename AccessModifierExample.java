package com.apjfsa;
// Define a class
public class AccessModifierExample{
    // Public access modifier
    public int publicVar = 10;

    // Private access modifier
    private int privateVar = 20;

    // Protected access modifier
    protected int protectedVar = 30;

    // Default access modifier (no modifier specified)
    int defaultVar = 40;

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method accessible within this class and its subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default method accessible only within the same package
    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        System.out.println("Public variable: " + example.publicVar);
        // Private variable cannot be accessed directly from outside the class
        // System.out.println("Private variable: " + example.privateVar);
        System.out.println("Protected variable: " + example.protectedVar);
        System.out.println("Default variable: " + example.defaultVar);

        example.publicMethod();
        // Private method cannot be accessed directly from outside the class
        // example.privateMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}