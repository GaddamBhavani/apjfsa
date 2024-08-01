package com.apjfsa;
import java.util.Scanner;
public class ReplaceStr {
	//method to replace the characters with 'x except last 4
String replaceStr(String s) {
	
	//convert String to character array
	char arr[]=new char[s.length()];
	arr=s.toCharArray();
	
	//Replace characters with 'x except last 4
	for(int i=0;i<arr.length-4;i++) {
		arr[i]='x';	
	}
	
	//convert character array back to String
	String str1=new String(arr);
	return str1;	
}
	public static void main(String[] args) {
		System.out.println("Enter your mobilenumber:");
	Scanner sc =new Scanner(System.in);
	String str=sc.next();
	ReplaceStr rp=new ReplaceStr();
	
	//call replaceStr method and print the result
	System.out.println(rp.replaceStr(str));
}
}