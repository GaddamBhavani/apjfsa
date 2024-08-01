package com.apjfsa;

public class Array {
	    public static void main(String[] args) {
	        // Initialize the array
	        int[] arr = {20, 10, 4, 11, 9, 40};
	        int min = arr[0]; // Initialize min to the first element of the array
	        int max = arr[0]; // Initialize max to the first element of the array

	        // Loop through the array to find the minimum and maximum values
	        for (int i = 1; i < arr.length; i++) {
	            // Check if the current element is less than the current minimum
	            if (arr[i] < min) {
	                min = arr[i];// Update min if current element is smaller
	            }
	            // Check if the current element is greater than the current maximum
	            if (arr[i] > max) {
	                max = arr[i];// Update min if current element is  larger 
	            }
	        }
	        // Print the minimum and maximum values
	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
	}
