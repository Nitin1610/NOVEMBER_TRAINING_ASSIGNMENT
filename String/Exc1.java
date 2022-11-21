package com.yash.stringexc;
import java.util.Scanner;
/*
 * In this method, we will traverse through the string until we encounter the index given by the user. Once we reach the index value add the second string elements to the new string and continue with the original string.
Let us see the step by step procedure for this method,

Input the original string from the user.
Input the string that needs to be inserted (second string).
Get the index value at which the second string needs to be inserted.
Traverse the original string and add it’s elements one by one to a new string.
Use the charAt() method to access each character of the string.
Add the second string to the new string when you reach the index value.
Continue by adding the original string elements and print the new string.
 */
public class Exc1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        
        // Input original string
        System.out.println("Enter the Original String: ");
        String firStr = input.nextLine();
        
        //Input the second string to be inserted
        System.out.println("Enter the String to be Inserted: ");
        String secStr = input.nextLine();
        
        //Input the index after which the string should be inserted
        System.out.println("Enter the Index: ");
        int index = input.nextInt();
  
        String newStr = new String(); 
  
        for (int i = 0; i < firStr.length(); i++) { 
            //Add character by character to new string 
            newStr += firStr.charAt(i); 
           
            if (i == index) { 
                //Insert the second string
                newStr += secStr; 
            } 
        } 
  
        // Output 
        System.out.println("New String After Insertion: "+ newStr);
 
    } 

}
