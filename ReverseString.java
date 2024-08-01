package com.apjfsa;
import java.util.Scanner;

public  class ReverseString {

	public static void main(String[] args) {
		 String reverse = "";
       //input from the user to enter a String
          System.out.println("Enter string to reverse:");
          
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          
          //change the input oder in reveres order
          for(int i = str.length() - 1; i >= 0; i--)
          {
          reverse = reverse + str.charAt(i);
          }
          //print the reverse String
          System.out.println("Reversed string is:");
          System.out.println(reverse);

          }
         }  