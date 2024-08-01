package com.apjfsa;

public class FindingDublicates {
public static void main(String[] args) {
        // Initialize the array
      int[] a= {30,20,10,40,30,10};
        // Call the method to find duplicates
	     findDuplicates(a);
		    }
    // Method to find duplicate elements in an array
		    public static void findDuplicates(int[] arr) {
		        // Print the message indicating that we are finding duplicate elements
		        System.out.print("Duplicate elements in the array are: ");
	        // Iterate through the array
		        for (int i = 0; i < arr.length; i++) {
		            // Compare the current element with all subsequent elements
		        	for (int j = i + 1; j < arr.length; j++) {
		                // If a duplicate is found, print it and break out of the inner loop
		        		if (arr[i] == arr[j]) {
		                    System.out.print(arr[i] + " ");
		                    break; // Break once a duplicate is found to avoid printing it multiple times
		                }
		            }
		        }
		    }
}
		    