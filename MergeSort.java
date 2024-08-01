package com.apjfsa;

public class MergeSort {

	public static void main(String[] args) {
		        int[] arr1 = {2, 4, 6, 8, 10};
		        int[] arr2 = {1,3, 5, 7, 9};
		        
		        // Merge and sort the arrays
		        int[] arr3 = mergeSort(arr1, arr2);
		        
		        // Print the sorted array
		        printArray(arr3);
		    }

		    static int[] mergeSort(int[] arr1, int[] arr2) {
		        int[] arr3 = new int[arr1.length + arr2.length];
		        int i = 0, j = 0, k = 0;

		        // Merge the arrays
		        while (i < arr1.length && j < arr2.length) {
		            if (arr1[i] <= arr2[j]) {
		                arr3[k] = arr1[i];
		                i++;
		            } else {
		                arr3[k] = arr2[j];
		                j++;
		            }
		            k++;
		        }

		        // Copy remaining elements of arr1 if any
		        while (i < arr1.length) {
		            arr3[k] = arr1[i];
		            i++;
		            k++;
		        }

		        // Copy remaining elements of arr2 if any
		        while (j < arr2.length) {
		            arr3[k] = arr2[j];
		            j++;
		            k++;
		        }

		        // Return the merged and sorted array
		        return arr3;
		    }

		    static void printArray(int[] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		    }
		
	}


