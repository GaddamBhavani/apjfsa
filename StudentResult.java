package com.apjfsa;
import java.util.Scanner;
   public class StudentResult {
    public static void main(String[] args) {
        // Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);
        // Initialize the marks array
		int [] marks= {50,54,43,58,65,36};
        // Variable to track if all marks are above passing limit
		boolean b=true;
        // Variable to calculate sum of marks
		int i=0,sum=0;
		double percentage;
        // Calculate sum of marks and check if any mark is below passing limit
		for(i=0;i<marks.length;) {
            // Check if current mark is below passing threshold
			if(marks[i]<=35)
				b=false;
			i++;
		}
        // Calculate percentage
            if(b) {//if(num%2==0)
			for(i=0;i<marks.length;i++) {
				sum+=marks[i];
			}
			percentage=sum/6;
            // Display result if all marks are above passing limit
			System.out.println("Student Result:Passed:\nTotal="+sum+"percentage="+percentage);
		}
		else
            // Display result if any mark is below passing limit
			System.out.println("Student got failed");
        // Close the scanner
		scanner.close();
    }
}


