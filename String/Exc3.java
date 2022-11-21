package com.yash.stringexc;

import java.util.HashSet;
import java.util.Set;

// WAP to remove all the vowels from the given string.

/*Create HashSet named vowelsSet and add all vowels to it.
Iterate over String str and check if vowel_Set does not contain the character.
If vowel_Set does not contain the character, then add it to result String stringBuffer
Once loop is complete, then print the resultStr.
*/
public class Exc3 {

	public static void main(String[] args) {
		String str = "nitin Ovhal";
		Set<Character> vowel_set = new HashSet<>();
		vowel_set.add('A');
		vowel_set.add('E');
		vowel_set.add('I');
		vowel_set.add('O');
		vowel_set.add('U');
		vowel_set.add('a');
		vowel_set.add('e');
		vowel_set.add('i');
		vowel_set.add('o');
		vowel_set.add('u');

		StringBuffer stringBuffer = new StringBuffer();
		char[] charArray = str.toCharArray();
		for (Character chr : charArray) {
			if (!vowel_set.contains(chr))
				stringBuffer.append(chr);
		}
		System.out.println("String str"+str);
		System.out.println("vowel string"+stringBuffer);
	}
}
