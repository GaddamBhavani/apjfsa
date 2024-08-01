package com.apjfsa;

public class RotateArray {

	public static void main(String[] args) {
		  int[] a = {1, 2, 3, 4, 5};
	        int temp;

	        System.out.println("Original Array: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }

	        // Perform rotation
	        temp = a[a.length - 1];
	        for (int i = a.length - 1; i > 0; i--) {
	            a[i] = a[i - 1];
	        }
	        a[0] = temp;

	        // Print the rotated array
	        System.out.println("\nRotated Array: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	}

	


