package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {
                  public static void main(String[] args) {
	    	        // Creating an ArrayList of integers
	    	        ArrayList<Integer> numbers = new ArrayList<>();

	    	        // Inserting integer values into the ArrayList
	    	        numbers.add(10);
	    	        numbers.add(20);
	    	        numbers.add(30);
	    	        numbers.add(40);
	    	        numbers.add(30); // Adding another 30 for demonstration

	    	        // Print the ArrayList
	    	        System.out.println("ArrayList: " + numbers);

	    	        // Retrieve elements using get(index) method
	    	        int valueAtIndex2 = numbers.get(2);
	    	        System.out.println("Element at index 2: " + valueAtIndex2);

	    	        // Retrieve the last index of a specific value using lastIndexOf() method
	    	        int lastIndexof30 = numbers.lastIndexOf(30);
	    	        System.out.println("Last index of 30: " + lastIndexof30);

	    	        // Trying to access an index out of bounds will cause an exception
	    	        try {
	    	            int element = numbers.get(10); // This will throw an IndexOutOfBoundsException
	    	        } catch (IndexOutOfBoundsException e) {
	    	            System.out.println("Index out of bounds exception: " + e.getMessage());
	    	        }
	    	    }
	    	}
