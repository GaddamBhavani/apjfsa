package com.apjfsa;

public class DemoArray {

	public static void main(String[] args) {
        // Create an array of integers with a size of 5
		int arr[]=new int[5];
        // Initialize the array with specific values
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
        // Loop through the array and print each element
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
		System.out.println("array length="+arr.length);

	}

}
