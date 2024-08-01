package com.apjfsa;

public class FibonacciExample {

	public static void main(String[] args) {
	 // Initialize the first two Fibonacci numbers
	int n1=0,n2=1,n3,i,count=10;
	// Print the first two numbers separately
	System.out.println(n1+""+n2);
	 // Loop to generate and print the rest of the Fibonacci sequence
	for(i=2;i<count;++i)
	{
		n3=n1+n2;
		System.out.print(""+n3);
         // Update the previous numbers
		n1=n2;
		n2=n3;
	}
	}
        }


