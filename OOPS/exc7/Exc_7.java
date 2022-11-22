package com.yash.exc7;

import java.util.Scanner;

public class Exc_7 {

	public static int stringCompare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int lenMin = Math.min(len1, len2);
        
        //comparing each string alphabet wise
        for(int i=0; i<lenMin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);



           if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (len1 != len2) {
            return len1 - len2;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter String1 :");
        String string1 = sc1.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter"
                + " String 2 :");
        String string2 = sc2.nextLine();
        
        int compare = stringCompare(string1, string2);
        if(compare == 0) {
            System.out.printf("Entered Strings %s and %s are equal",string1,string2);
        }
        else if(compare > 0 | compare < 0) {
            System.out.printf("Entered Strings %s and %s are not equal",string1,string2);
        }
    }
}
